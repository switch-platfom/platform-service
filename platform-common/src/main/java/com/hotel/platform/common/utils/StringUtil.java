package com.hotel.platform.common.utils;

import java.util.Arrays;

public class StringUtil {

    /**
     * 空字符串
     */
    public static String Empty = "";

    /**
     * 判断字符串是否为空
     *
     * @param input
     * @return
     */
    public static boolean isNullOrEmpty(String input) {
        return input == null || trim(input, new char[0]).isEmpty();
    }

    public static String trim(String s, char... chars) {
        s = trimStart(s, chars);
        s = trimEnd(s, chars);
        return s;
    }

    public static String trimEnd(String s, char... chars) {
        if (s != null && chars != null) {
            Arrays.sort(chars);

            int index;
            for (index = s.length() - 1; index >= 0; --index) {
                char c = s.charAt(index);
                if (!Character.isWhitespace(c)) {
                    int i = Arrays.binarySearch(chars, c);
                    if (i < 0) {
                        break;
                    }
                }
            }

            return index == s.length() - 1 ? s : (index < 0 ? "" : s.substring(0, index + 1));
        } else {
            return s;
        }
    }

    public static String trimStart(String s, char... chars) {
        if (s != null && chars != null) {
            Arrays.sort(chars);

            int index;
            for (index = 0; index < s.length(); ++index) {
                char c = s.charAt(index);
                if (!Character.isWhitespace(c)) {
                    int i = Arrays.binarySearch(chars, c);
                    if (i < 0) {
                        break;
                    }
                }
            }

            return index == 0 ? s : (index == s.length() ? "" : s.substring(index));
        } else {
            return s;
        }
    }

    /**
     * 判断字符串是否为null或者空字符串,如果是则并返回一个默认值，如果不是则返回本身
     *
     * @param inputStr
     * @param defultStr
     * @return
     */
    public static String getString(String inputStr, String defultStr) {
        if (isNullOrEmpty(inputStr)) {
            return defultStr;
        }
        return inputStr;
    }

    /**
     * 判断字符串是否为null或者空字符串,如果是则并返回一个默认值，如果不是则返回本身
     *
     * @param obj
     * @return
     */
    public static String getString(Object obj) {
        return getString(obj, "");
    }

    /**
     * 判断字符串是否为null或者空字符串,如果是则并返回一个默认值，如果不是则返回本身
     *
     * @param obj
     * @param defaultStr
     * @return
     */
    public static String getString(Object obj, String defaultStr) {
        if (obj == null) {
            return defaultStr;
        }
        return getString(obj.toString(), defaultStr);
    }

    /**
     * 移除字符串中的 低序位非打印 ASCII 字符
     *
     * @param inputString
     * @return
     */
    public static String removeLowOrderCharacters(String inputString) {
        try {
            StringBuilder sbResult = new StringBuilder();
            for (char cc : inputString.toCharArray()) {
                int ss = (int) cc;
                boolean flag = ((ss >= 0) && (ss <= 8)) || ((ss >= 11) && (ss <= 12)) || ((ss >= 14) && (ss <= 31));
                if (flag) {
                    ;
                } else {
                    sbResult.append(cc);
                }
            }
            return sbResult.toString();
        } catch (Exception ex) {
            return inputString;
        }
    }

    /**
     * 去除非英文字符
     * 
     * @param original
     * @return
     */
    public static String removeNonLetters(String original) {
        StringBuffer aBuffer = new StringBuffer(original.length());
        char aCharacter;
        for (int i = 0; i < original.length(); i++) {
            aCharacter = original.charAt(i);
            if (Character.isLetter(aCharacter)) {
                aBuffer.append(new Character(aCharacter));
            }
        }
        return new String(aBuffer);
    }

    /**
     * 字符串对比
     * 
     * @param origin
     * @param target
     * @return
     */
    public static boolean compare(String origin, String target) {
        if (origin == null && target == null) {
            return true;
        }
        if (origin != null) {
            return origin.equalsIgnoreCase(target);
        }

        return false;
    }
}
