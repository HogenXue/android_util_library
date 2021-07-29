package com.hogen.android_util_library.logger;

import static com.hogen.android_util_library.logger.LogConfig.HI_THREAD_FORMATTER;

import android.support.annotation.NonNull;

public class Log {
    private static final String LOG_PACKAGE;

    static {
        String className = Log.class.getName();
        LOG_PACKAGE = className.substring(0, className.lastIndexOf('.') + 1);
    }


    static void v(String tag, Object... contents) {

    }
    static void d(String tag, Object... contents) {

    }
    static void i(String tag, Object... contents) {

    }
    static void w(String tag, Object... contents) {

    }
    static void e(String tag, Object... contents) {

    }
    static void a(String tag, Object... contents) {

    }

    static void log(@NonNull LogConfig logConfig, LogType logType,@NonNull String tag, Object... contents){
        StringBuilder sb = new StringBuilder();
        if(!logConfig.enable()){
            return;
        }

        if(logConfig.includeThread()){
            sb.append(HI_THREAD_FORMATTER.format())
        }

        if(logConfig.)
    }
}
