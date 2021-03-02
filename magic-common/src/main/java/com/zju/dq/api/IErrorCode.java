package com.zju.dq.api;

/**
 * @author Linker
 * @date 2021/3/2 17:31
 * @description：封装API的错误码
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
