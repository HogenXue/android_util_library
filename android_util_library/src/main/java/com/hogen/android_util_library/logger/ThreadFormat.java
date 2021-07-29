package com.hogen.android_util_library.logger;

/**
 * @author Hogen.Xue
 * @version 1.0.0
 * @time 2021/7/29 16:39
 * @brief
 **/
class ThreadFormat implements LogFormat<Thread> {
    @Override
    public String format(Thread data) {
        return "Thread"+data.getName();
    }
}
