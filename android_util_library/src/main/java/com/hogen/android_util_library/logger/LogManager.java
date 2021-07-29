package com.hogen.android_util_library.logger;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class LogManager {
    static LogManager logManager;
    static LogConfig logConfig;
    static List<LogPrinter> logPrtiners = new ArrayList<>();

    private LogManager() throws Exception {
        if(logManager != null){
            throw new Exception("logmanager is init alread!");
        }
    }

    static LogManager getInstance() throws Exception {
        if(logManager != null){
            return logManager;
        }
        return new LogManager();
    }

    static void init(@NonNull LogConfig config,LogPrinter...printers){
        logConfig = config;
        for( LogPrinter printer : printers){
            logPrtiners.add(printer);
        }
    }

    public LogConfig getLogConfig() {
        return logConfig;
    }

    List<LogPrinter> getPrinters(){
        return logPrtiners;
    }

    void addPrinter(@NonNull LogPrinter printer){
        logPrtiners.add(printer);
    }

    void removePrinter(@NonNull LogPrinter printer){
        logPrtiners.remove(printer);
    }

}
