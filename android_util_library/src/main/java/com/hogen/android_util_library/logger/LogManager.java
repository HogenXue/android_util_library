package com.hogen.android_util_library.logger;

import android.support.annotation.NonNull;

public class LogManager {
    static LogManager logManager;
    private LogConfig logConfig;


    private LogManager(){
        ;
    }

    public static LogManager getInstance(){
        if(logManager != null){
            return logManager;
        }
        return new LogManager();
    }

    static void init(@NonNull LogConfig logConfig,LogPrinter...logPrinters){

    }
}
