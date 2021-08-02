package com.hogen.android_util_library.logger;

import static com.hogen.android_util_library.logger.LogConfig.HI_THREAD_FORMATTER;
import static com.hogen.android_util_library.logger.LogConfig.LOG_STACK_TRACE_FORMATTER;
import static com.hogen.android_util_library.logger.LogConfig.LOG_THREAD_FORMATTER;

import android.support.annotation.NonNull;

public class Log {
    private static final String LOG_PACKAGE;

    static {
        String className = Log.class.getName();
        LOG_PACKAGE = className.substring(0, className.lastIndexOf('.') + 1);
    }

    static void v(Object... contents) {
        log(LogType.V,contents);
    }
    static void vt(String tag, Object... contents) {
        log(LogType.V,tag,contents);
    }

    static void d(Object... contents) {
        log(LogType.D,contents);
    }
    static void dt(String tag, Object... contents) {
        log(LogType.D,contents);
    }

    static void i(Object... contents) {
        log(LogType.I,contents);
    }
    static void it(String tag, Object... contents) {
        log(LogType.I,tag,contents);
    }

    static void w(Object... contents) {
        log(LogType.W,contents);
    }
    static void wt(String tag, Object... contents) {
        log(LogType.W,tag,contents);
    }

    static void e(Object... contents) {
        log(LogType.E,contents);
    }
    static void et(String tag, Object... contents) {
        log(LogType.E,tag,contents);
    }

    static void a(Object... contents) {
        log(LogType.A,contents);
    }
    static void at(String tag, Object... contents) {
        log(LogType.A,tag,contents);
    }

    private static void log(@LogType.TYPE int type, Object... contents) {
        log(type, LogManager.getInstance().getLogConfig().getGlobalTag(), contents);
    }

    private static void log(@LogType.TYPE int type, @NonNull String tag, Object... contents) {
        log(LogManager.getInstance().getLogConfig(), type, tag, contents);
    }

    private static void log(@NonNull LogConfig config, @LogType.TYPE int type, @NonNull String tag, Object... contents) {
        StringBuilder sb = new StringBuilder();
        if(!config.enable()){
            return;
        }

        //thread
        if(config.includeThread()){
            sb.append(LOG_THREAD_FORMATTER.format(Thread.currentThread()));
        }

        //add stacktrace
        if(config.stackTrackDepth() > 0){
            sb.append(LOG_STACK_TRACE_FORMATTER.format(new Throwable().getStackTrace()));
        }

        //parse contents
    }


}
