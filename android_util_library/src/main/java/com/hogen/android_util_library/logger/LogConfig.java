package com.hogen.android_util_library.logger;

abstract class LogConfig {
    static int                 MAX_LEN                  = 512;
    static ThreadFormat        LOG_THREAD_FORMATTER      = new ThreadFormat();
    static StackTraceFormat    LOG_STACK_TRACE_FORMATTER = new StackTraceFormat();

    public String getGlobalTag() {
        return "Log";
    }
    boolean enable(){
        return true;
    }
    boolean includeThread(){
        return true;
    }
    int stackTrackDepth(){
        return 5;
    }

    public JsonParser injectjsonParser(){
        return null;
    }

    public LogPrinter[] printers(){
        return null;
    }

    public interface JsonParser {
        String toJson(Object src);
    }


}
