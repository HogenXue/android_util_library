package com.hogen.android_util_library.logger;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LogManager {
    private static LogManager instance;
    private static LogConfig logConfig;
    private List<LogPrinter> logPrtiners = new ArrayList<>();

    private LogManager(LogConfig config,LogPrinter[] logPrinters){
        this.logConfig = config;
        this.logPrtiners.addAll(Arrays.asList(logPrinters));
    }

    static LogManager getInstance(){
        return instance;
    }

    static void init(@NonNull LogConfig config,LogPrinter...printers){
        instance = new LogManager(config,printers);
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
