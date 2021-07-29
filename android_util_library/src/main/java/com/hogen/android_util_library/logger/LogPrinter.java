package com.hogen.android_util_library.logger;

import android.support.annotation.NonNull;

public interface LogPrinter {
    void print(@NonNull LogConfig logConfig,int level,String tag,@NonNull String printString);
}
