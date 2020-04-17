package com.ranxusong.exception;


import com.ranxusong.model.response.ResultCode;

public class ExceptionCast {
    public static void cast(ResultCode resultCode) {
        throw new CustomException(resultCode);
    }
}
