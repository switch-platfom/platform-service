package com.hotel.platform.web.web;

import java.net.URLDecoder;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import com.hotel.platform.common.utils.NumberUtil;
import com.hotel.platform.common.utils.StringUtil;

public class BaseController {
    private final static String ENCODE = "UTF-8";

    @Autowired
    public HttpServletRequest request;

    /**
     * 获取modelandview
     *
     * @param viewName 视图名称
     * @return
     */
    protected ModelAndView getModeAndView(String viewName, String title) {
        ModelAndView view = new ModelAndView(viewName);

        view.addObject("title", title);
        view.addObject("view", viewName.substring(viewName.lastIndexOf("/") + 1));

        return view;
    }

    /**
     * 获取请求参数
     * 
     * @param name
     * @return
     */
    protected String getRequestParameter(String name) {
        try {
            return URLDecoder.decode(StringUtil.getString(request.getParameter(name)), ENCODE);
        } catch (Exception ex) {
        }
        return "";
    }

    /**
     * 获取请求参数
     * 
     * @param name
     * @return
     */
    protected int getIntegerParameter(String name) {
        return NumberUtil.parseInteger(getRequestParameter(name));
    }

    /**
     * 获取请求参数
     * 
     * @param name
     * @return
     */
    protected double getDoubleParameter(String name) {
        return NumberUtil.parseDouble(getRequestParameter(name));
    }

    /**
     * 获取请求参数
     * 
     * @param name
     * @return
     */
    protected long getLongParameter(String name) {
        return NumberUtil.parsLong(getRequestParameter(name));
    }

    /**
     * 获取请求参数
     * 
     * @param name
     * @return
     */
    protected boolean getBooleanParameter(String name) {
        return NumberUtil.parseBoolean(getRequestParameter(name));
    }

    /**
     * 获取请求参数
     * 
     * @param name
     * @return
     */
    protected float getFloatParameter(String name) {
        return NumberUtil.parseFloat(getRequestParameter(name));
    }
}
