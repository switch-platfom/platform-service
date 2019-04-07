package com.hotel.platform.common.utils;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberUtil {
    private final static String DEFAULT_ZERO = "0";
    private final static int NUM = 10;

    public static Integer parseInteger(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        Integer retVal;
        try {
            retVal = Integer.parseInt(checkForString(obj));
        } catch (NumberFormatException nfe) {
            retVal = 0;
        }
        return retVal;
    }

    public static Integer parseInteger(Object obj, Integer defaultValue) {
        if (obj == null) {
            return parseInteger(defaultValue);
        }

        return parseInteger(obj);
    }

    public static BigInteger parseBigInteger(Object obj) {
        if (obj == null) {
            return new BigInteger(DEFAULT_ZERO);
        }
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        BigInteger retVal;
        try {
            retVal = new BigInteger(checkForString(obj));
        } catch (NumberFormatException nfe) {
            retVal = new BigInteger("0");
        }
        return retVal;
    }

    public static BigInteger parseBigInteger(Object obj, BigInteger defaultValue) {
        if (obj == null) {
            return parseBigInteger(defaultValue);
        }

        return parseBigInteger(obj);
    }

    public static Boolean parseBoolean(Object obj) {
        if (obj == null) {
            return Boolean.FALSE;
        }
        if (obj instanceof Integer || obj instanceof Byte) {
            return obj.equals(1);
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        Boolean retVal;
        try {
            retVal = Boolean.parseBoolean(checkForString(obj));
        } catch (NumberFormatException nfe) {
            retVal = Boolean.FALSE;
        }
        return retVal;
    }

    public static Boolean parseBoolean(Object obj, Boolean defaultValue) {
        if (obj == null) {
            return parseBoolean(defaultValue);
        }

        return parseBoolean(obj);
    }

    public static BigDecimal parseBigDecimal(Object obj) {
        if (obj == null) {
            return new BigDecimal(0);
        }
        if (obj instanceof BigDecimal) {
            return (BigDecimal) obj;
        }
        if (obj instanceof Double) {
            return new BigDecimal((Double) obj);
        }
        if (obj instanceof Integer) {
            return new BigDecimal((Integer) obj);
        }
        BigDecimal retVal;
        try {
            retVal = new BigDecimal(checkForString(obj));
        } catch (NumberFormatException nfe) {
            retVal = new BigDecimal(0);
        }
        return retVal;
    }

    public static BigDecimal parseBigDecimal(Object obj, BigDecimal defaultValue) {
        if (obj == null) {
            return parseBigDecimal(defaultValue);
        }

        return parseBigDecimal(obj);
    }

    public static Double parseDouble(Object obj) {
        if (obj == null) {
            return 0d;
        }
        if (obj instanceof Double) {
            return (Double) obj;
        }
        Double retVal;
        try {
            retVal = Double.parseDouble(checkForString(obj));
        } catch (NumberFormatException nfe) {
            return 0d;
        }
        return retVal;
    }

    public static Double parseDouble(Object obj, Double defaultValue) {
        if (obj == null) {
            return parseDouble(defaultValue);
        }

        return parseDouble(obj);
    }

    public static Float parseFloat(Object obj) {
        if (obj == null) {
            return 0f;
        }
        if (obj instanceof Float) {
            return (Float) obj;
        }
        Float retVal;
        try {
            retVal = Float.parseFloat(checkForString(obj));
        } catch (NumberFormatException nfe) {
            return 0f;
        }
        return retVal;
    }

    public static Float parseFloat(Object obj, Float defaultValue) {
        if (obj == null) {
            return parseFloat(defaultValue);
        }

        return parseFloat(obj);
    }

    public static Long parsLong(Object obj) {
        if (obj == null) {
            return 0L;
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        Long retVal;
        try {
            retVal = Long.parseLong(checkForString(obj));
        } catch (NumberFormatException nfe) {
            return 0L;
        }
        return retVal;
    }

    public static Long parsLong(Object obj, Long defaultValue) {
        if (obj == null) {
            return parsLong(defaultValue);
        }

        return parsLong(obj);
    }

    public static BigDecimal formatBigDecimal(double val) {
        int scale = 6;
        BigDecimal val1 = new BigDecimal(val).setScale(scale, BigDecimal.ROUND_HALF_UP);
        BigDecimal val2 = val1.setScale(0, BigDecimal.ROUND_FLOOR);

        double val3 = val1.subtract(val2).doubleValue();

        if (val3 == 0) {
            return val2;
        } else {
            int i = 1;
            int lng = 0;
            while ((val3 * (i *= NUM)) % NUM != 0) {
                lng++;
            }
            return val2.add(new BigDecimal(val3)).setScale(lng, BigDecimal.ROUND_HALF_UP);
        }
    }

    private static String checkForString(Object obj) {
        if (obj instanceof String) {
            String val = (String) obj;
            if (StringUtil.isNullOrEmpty(val)) {
                val = DEFAULT_ZERO;
            }
            return val;
        } else {
            if (obj instanceof Integer || obj instanceof Double || obj instanceof BigInteger || obj instanceof Float
                    || obj instanceof Long || obj instanceof Boolean || obj instanceof Short) {
                return obj.toString();
            } else {
                return DEFAULT_ZERO;
            }
        }
    }
}
