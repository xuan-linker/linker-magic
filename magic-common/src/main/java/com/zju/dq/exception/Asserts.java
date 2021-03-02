package com.zju.dq.exception;

import com.zju.dq.api.IErrorCode;

/**
 * @author Linker
 * @date 2021/3/2 18:52
 * @description：断言处理类，用于抛出各种API异常
 */
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
