package com.mao.maobook.util;

public class Log {

    private static final String TAG = "MaoBook";

    private static boolean DEBUG = true;

    static {
        // TODO 动态配置DEBUG开关
    }

    public static void d(String className, String content) {
        if (DEBUG) {
            android.util.Log.d(TAG, "[" + className + "]---------" + content);
        }
    }

    public static void i(String className, String content) {
        if (DEBUG) {
            android.util.Log.i(TAG, "[" + className + "]---------" + content);
        }
    }

    public static void e(String className, String content) {
        if (DEBUG) {
            android.util.Log.e(TAG, "[" + className + "]---------" + content);
        }
    }

    public static void w(String className, String content) {
        if (DEBUG) {
            android.util.Log.w(TAG, "[" + className + "]---------" + content);
        }
    }

    public static void v(String className, String content) {
        if (DEBUG) {
            android.util.Log.v(TAG, "[" + className + "]---------" + content);
        }
    }

}
