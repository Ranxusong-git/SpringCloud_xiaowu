package com.ranxusong.exception;

import com.google.common.collect.ImmutableMap;
import com.ranxusong.model.response.CommonCode;
import com.ranxusong.model.response.ResponseResult;
import com.ranxusong.model.response.ResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

//处理器增强
@ControllerAdvice
@Slf4j
public class ExceptionCatch {

    //将异常信息存储到map中
    private static ImmutableMap<Class<? extends Throwable>, ResultCode> EXCEPTIONS;
    //添加异常信息
    protected static ImmutableMap.Builder<Class<? extends Throwable>, ResultCode> build =
            ImmutableMap.builder();

    static {
        build.put(ArithmeticException.class, CommonCode.ARITHMETIC_ERROR);
//        build.put(HttpRequestMethodNotSupportedException.class, CommonCode.HTTP_METHOD_ERROR);
    }

    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public static ResponseResult customExceptionHandler(CustomException customException) {
        log.error("当前时间：" + new Date() + "  " + customException.getResultCode());
        ResultCode resultCode = customException.getResultCode();
        return new ResponseResult(resultCode);
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public static ResponseResult exceptionHandler(Exception exception) {
        if (EXCEPTIONS == null) {
            //map构建成功
            EXCEPTIONS = build.build();
        }

        log.error("当前时间：" + new Date() + "  " + exception.getMessage());

        if (EXCEPTIONS.containsKey(exception.getClass())){
            ResultCode resultCode = EXCEPTIONS.get(exception.getClass());
            System.out.println(resultCode.code() + "=============================");
            return new ResponseResult(resultCode);
        }else {
            return new ResponseResult(CommonCode.SERVER_ERROR);
        }

    }
}