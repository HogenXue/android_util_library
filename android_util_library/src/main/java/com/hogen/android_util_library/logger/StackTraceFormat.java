package com.hogen.android_util_library.logger;

import java.util.Stack;

/**
 * @author Hogen.Xue
 * @version 1.0.0
 * @time 2021/7/29 16:43
 * @brief
 **/
class StackTraceFormat implements LogFormat<StackTraceElement[]> {
    @Override
    public String format(StackTraceElement[] data) {
        StringBuilder sb = new StringBuilder();
        int size = data.length;

        for(int i = 0; i < size; i++){
            if( i == 0){
                sb.append("|-->"+data[i].toString());
            }else if( i == (size - 1)){
                sb.append("|--"+data[i].toString());
            }else{
                sb.append("|-*-"+data[i].toString());
            }
        }

        return sb.toString();
    }
}
