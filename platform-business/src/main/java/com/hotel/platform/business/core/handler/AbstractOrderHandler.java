package com.hotel.platform.business.core.handler;

import org.springframework.stereotype.Component;

import com.hotel.platform.business.core.context.BaseContext;
import com.hotel.platform.business.core.exceptions.BizException;
import com.hotel.platform.business.core.exceptions.ExceptionEnum;
import com.hotel.platform.business.core.exceptions.SystemException;

/**
 * @Author wmo
 * @CreateDate 2019/3/20 12:28
 * @Version 1.0
 * @Description
 */
@Component
public abstract class AbstractOrderHandler<RQ, RS, CONTEXT extends BaseContext>
        implements BaseSwitchHandler<RQ, RS>, ExceptionHandler<RQ, RS, CONTEXT>, LogHandler<RQ, RS, CONTEXT> {

    /**
     * 处理请求
     * 
     * @param request 请求内容
     * @return
     */
    @Override
    public RS process(RQ request) {
        RS response = null;
        CONTEXT context = null;
        long startTime = System.currentTimeMillis();
        try {
            response = initResponse();
            if (request == null) {
                throw new SystemException(ExceptionEnum.REQUEST_EMPTY);
            }
            checkRequest(request, response);
            context = initContext(request, response);
            preProcess(request, response, context);
            sendRequest(request, response, context);
            afterProcess(request, response, context);
        } catch (BizException sbe) {
            bizExceptionHandler(request, response, context, sbe);
        } catch (SystemException sse) {
            systemExceptionHandler(sse, response);
        } catch (Exception e) {
            otherExceptionHandler(request, response, context, e);
        } finally {
            long cost = (System.currentTimeMillis() - startTime);
            logDb(request, response, context);
            logEs(request, response, context, cost);
            logMetric(request, response, context, cost);
        }
        return response;
    }

    /**
     * 初始化Response
     *
     * @return
     */
    public abstract RS initResponse();

    /**
     * 初始化请求
     *
     * @param request 请求
     * @param response 响应
     * @return
     */
    public abstract CONTEXT initContext(RQ request, RS response) throws BizException;

    /**
     * 验证请求内容是否正确
     * 
     * @param request 请求
     * @param response 响应
     * @return
     */
    public abstract void checkRequest(RQ request, RS response) throws BizException;

    /**
     * 后处理
     *
     * @param request
     * @param response
     * @param context
     * @return
     */
    public abstract void preProcess(RQ request, RS response, CONTEXT context) throws BizException;

    /**
     * 发送请求
     *
     * @param request
     * @param response
     * @param context
     * @return
     */
    public abstract void sendRequest(RQ request, RS response, CONTEXT context) throws BizException;

    /**
     * 后处理
     *
     * @param request
     * @param response
     * @param context
     * @return
     */
    public abstract void afterProcess(RQ request, RS response, CONTEXT context) throws BizException;
}
