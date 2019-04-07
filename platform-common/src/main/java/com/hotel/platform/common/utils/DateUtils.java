package com.hotel.platform.common.utils;

import java.util.Calendar;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.Seconds;


public final class DateUtils {

    private final static String MIN_DATE_STR = "1900-01-01";
    private final static String DATE_FORMAT_DATE = "yyyy-MM-dd";
    private final static String DATE_FORMAT_DATE_TIME = "yyyy-MM-dd HH:mm:ss";
    private final static String DATE_FORMAT_TIME = "HH:mm:ss";
    private final static String DATE_FORMAT_STANDARD = "yyyy-MM-dd'T'HH:mm:ss";
    private final static String DATE_FORMAT_STANDARD_WITH_TIMEZONE = "yyyy-MM-dd'T'HH:mm:ss.SSS Z";
    private final static String DATE_FORMAT_STANDARD_WITH_Z = "yyyy-MM-dd'T'HH:mm:ss'Z'";

    private final static DateTimeZone TIME_ZONE = DateTimeZone.forID("Asia/Shanghai");

    /**
     * 获取格式为 yyyy-MM-dd 不带小时数的当天日期
     */
    public static DateTime today() {
        DateTime now = DateTime.now(TIME_ZONE);

        return now.withTimeAtStartOfDay();
    }

    /**
     * 转换成datetime
     *
     * @param date
     * @return
     */
    public static DateTime toDate(long date) {
        return new DateTime(date, TIME_ZONE);
    }

    /**
     * 转换成datetime
     *
     * @param date
     * @return
     */
    public static DateTime toDate(long date, DateTimeZone timeZone) {
        return new DateTime(date, timeZone);
    }

    /**
     * 转换成datetime
     *
     * @param date
     * @return
     */
    public static DateTime toDate(Calendar date) {
        return new DateTime(date, TIME_ZONE);
    }

    /**
     * 转换成datetime
     *
     * @param date
     * @return
     */
    public static DateTime toDate(Calendar date, DateTimeZone timeZone) {
        return new DateTime(date, timeZone);
    }

    /**
     * 转换成datetime
     *
     * @param date
     * @return
     */
    public static DateTime toDate(String date, DateTimeZone timeZone) {
        return new DateTime(date, timeZone);
    }

    /**
     * 转换成datetime
     *
     * @param date
     * @return
     */
    public static DateTime toDate(String date, Boolean ignoreNull, DateTimeZone timeZone) {
        if (ignoreNull && !StringUtil.isNullOrEmpty(date) && date.indexOf(" ") == 10) {
            StringBuilder sb = new StringBuilder(date);
            sb.insert(10, "T");
            sb.replace(11, 12, "");
            date = sb.toString();
        }
        return toDate(date, timeZone);
    }

    /**
     * 转换成datetime
     *
     * @param date
     * @return
     */
    public static DateTime toDate(String date) {
        return new DateTime(date, TIME_ZONE);
    }

    /**
     * 转换成datetime
     *
     * @param date
     * @return
     */
    public static DateTime toDate(Date date) {
        return new DateTime(date, TIME_ZONE);
    }

    /**
     * 转换成datetime
     *
     * @param date
     * @return
     */
    public static DateTime toDate(Date date, DateTimeZone timeZone) {
        return new DateTime(date, timeZone);
    }


    /**
     * 求两个日期的差值
     *
     * @param large
     * @param small
     * @return
     */
    public static int diffDays(DateTime small, DateTime large) {
        return Days.daysBetween(small, large).getDays();
    }

    /**
     * 求两个日期的差值
     *
     * @param large
     * @param small
     * @return
     */
    public static int diffDays(Calendar small, Calendar large) {
        DateTime begin = new DateTime(small, TIME_ZONE);
        DateTime end = new DateTime(large, TIME_ZONE);
        return diffDays(begin, end);
    }

    /**
     * 求两个日期的差值
     *
     * @param large
     * @param small
     * @return
     */
    public static int diffDays(Date small, Date large) {
        DateTime begin = new DateTime(small, TIME_ZONE);
        DateTime end = new DateTime(large, TIME_ZONE);
        return diffDays(begin, end);
    }

    /**
     * 求两个日期的差值
     *
     * @param large
     * @param small
     * @return
     */
    public static int diffHours(DateTime small, DateTime large) {
        return Hours.hoursBetween(small, large).getHours();
    }

    /**
     * 求两个日期的差值
     *
     * @param large
     * @param small
     * @return
     */
    public static int diffHours(Calendar small, Calendar large) {
        DateTime begin = new DateTime(small, TIME_ZONE);
        DateTime end = new DateTime(large, TIME_ZONE);
        return diffHours(begin, end);
    }

    /**
     * 求两个日期的差值
     *
     * @param large
     * @param small
     * @return
     */
    public static int diffHours(Date small, Date large) {
        DateTime begin = new DateTime(small, TIME_ZONE);
        DateTime end = new DateTime(large, TIME_ZONE);
        return diffHours(begin, end);
    }

    /**
     * 求两个日期的差值
     *
     * @param large
     * @param small
     * @return
     */
    public static int diffSeconds(DateTime small, DateTime large) {
        return Seconds.secondsBetween(small, large).getSeconds();
    }

    /**
     * 求两个日期的差值
     *
     * @param large
     * @param small
     * @return
     */
    public static int diffSeconds(Calendar small, Calendar large) {
        DateTime begin = new DateTime(small, TIME_ZONE);
        DateTime end = new DateTime(large, TIME_ZONE);
        return diffSeconds(begin, end);
    }

    /**
     * 求两个日期的差值
     *
     * @param large
     * @param small
     * @return
     */
    public static int diffSeconds(Date small, Date large) {
        DateTime begin = new DateTime(small, TIME_ZONE);
        DateTime end = new DateTime(large, TIME_ZONE);
        return diffSeconds(begin, end);
    }

    /**
     * 求两个日期的差值
     *
     * @param small
     * @param large
     * @return
     */
    public static int diffMinutes(DateTime small, DateTime large) {
        return Minutes.minutesBetween(small, large).getMinutes();
    }

    /**
     * 求两个日期的差值
     *
     * @param large
     * @param small
     * @return
     */
    public static int diffMinutes(Calendar small, Calendar large) {
        DateTime begin = new DateTime(small, TIME_ZONE);
        DateTime end = new DateTime(large, TIME_ZONE);
        return Minutes.minutesBetween(begin, end).getMinutes();
    }

    /**
     * 获取最小日期时间 1900-01-01
     * 
     * @return
     */
    public static DateTime min() {
        return DateTime.parse(MIN_DATE_STR);
    }

    /**
     * 格式化日期类型,yyyy-MM-dd
     * 
     * @return
     */
    public static String formatDate(DateTime dateTime) {
        return dateTime.toString(DATE_FORMAT_DATE);
    }

    /**
     * 格式化日期类型,yyyy-MM-dd
     *
     * @return
     */
    public static String formatDate(String dateTime) {
        return toDate(dateTime).toString(DATE_FORMAT_DATE);
    }

    /**
     * 格式化日期类型,yyyy-MM-dd HH:mm:ss
     * 
     * @param dateTime
     * @return
     */
    public static String formatDateTime(DateTime dateTime) {
        return dateTime.toString(DATE_FORMAT_DATE_TIME);
    }

    /**
     * 格式化日期类型,yyyy-MM-dd HH:mm:ss
     *
     * @param dateTime
     * @return
     */
    public static String formatDateTime(String dateTime) {
        return toDate(dateTime).toString(DATE_FORMAT_DATE_TIME);
    }

    /**
     * 格式化日期类型,HH:mm:ss
     *
     * @param dateTime
     * @return
     */
    public static String formatTime(DateTime dateTime) {
        return dateTime.toString(DATE_FORMAT_TIME);
    }

    /**
     * 格式化日期类型,HH:mm:ss
     *
     * @param dateTime
     * @return
     */
    public static String formatTime(String dateTime) {
        return toDate(dateTime).toString(DATE_FORMAT_TIME);
    }

    /**
     * 格式化日期类型，yyyy-MM-dd'T'HH:mm:ss
     * 
     * @param dateTime
     * @return
     */
    public static String formatStandard(DateTime dateTime) {
        return dateTime.toString(DATE_FORMAT_STANDARD);
    }

    /**
     * 格式化日期类型，yyyy-MM-dd'T'HH:mm:ss +8:00
     *
     * @param dateTime
     * @return
     */
    public static String formatWithTimeZone(String dateTime) {
        return formatWithTimeZone(toDate(dateTime));
    }

    /**
     * 格式化日期类型，yyyy-MM-dd'T'HH:mm:ss +8:00
     *
     * @param dateTime
     * @return
     */
    public static String formatWithTimeZone(DateTime dateTime) {
        return dateTime.toString(DATE_FORMAT_STANDARD_WITH_TIMEZONE);
    }

    /**
     * 格式化日期类型，yyyy-MM-dd'T'HH:mm:ssZ
     *
     * @param dateTime
     * @return
     */
    public static String formatWithZ(String dateTime) {
        return formatWithZ(toDate(dateTime));
    }

    /**
     * 格式化日期类型，yyyy-MM-dd'T'HH:mm:ssZ
     *
     * @param dateTime
     * @return
     */
    public static String formatWithZ(DateTime dateTime) {
        return dateTime.toString(DATE_FORMAT_STANDARD_WITH_Z);
    }

    /**
     * 格式化日期类型，yyyy-MM-dd'T'HH:mm:ss
     *
     * @param dateTime
     * @return
     */
    public static String formatStandard(String dateTime) {
        return toDate(dateTime).toString(DATE_FORMAT_STANDARD);
    }

    /**
     * 分钟转秒
     * 
     * @param minute
     * @return
     */
    public static int secondFromMinute(int minute) {
        return minute * 60;
    }

    /**
     * 小时转秒
     * 
     * @param hours
     * @return
     */
    public static int secondFromHour(int hours) {
        return secondFromMinute(hours * 60);
    }

    /**
     * 天转秒
     * 
     * @param day
     * @return
     */
    public static int secondFromDay(int day) {
        return secondFromHour(day * 24);
    }

    /**
     * 秒转毫秒
     *
     * @param second
     * @return
     */
    public static int millsFromSecond(int second) {
        return second * 1000;
    }

    /**
     * 分钟转毫秒
     *
     * @param minute
     * @return
     */
    public static int millsFromMinute(int minute) {
        return millsFromSecond(secondFromMinute(minute));
    }

    /**
     * 小时转毫秒
     *
     * @param hours
     * @return
     */
    public static int millsFromHour(int hours) {
        return millsFromSecond(secondFromHour(hours));
    }

    /**
     * 天转毫秒
     * 
     * @param day
     * @return
     */
    public static int millsFromDay(int day) {
        return millsFromSecond(secondFromDay(day));
    }
}
