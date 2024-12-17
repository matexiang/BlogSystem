package com.lxy.blog.model;

import com.lxy.blog.enmus.ResultCodeEnum;
import lombok.Data;

@Data
public class Result<T> {
    private int code;
    private String errMsg;
    private T data;

    public static <T> Result success(T data){
        Result result = new Result();
        result.setCode(ResultCodeEnum.SUCCESS.getCode());
        result.setData(data);
        return result;

    }

    public static <T> Result fail(String errMsg){
        Result result = new Result();
        result.setCode(ResultCodeEnum.FAIL.getCode());
        result.setErrMsg(errMsg);
        return result;

    }

    public static <T> Result fail(int code, String errMsg,T data){
        Result result = new Result();
        result.setCode(code);
        result.setErrMsg(errMsg);
        result.setData(data);
        return result;

    }
    public static <T> Result fail(int code, String errMsg){
        Result result = new Result();
        result.setCode(code);
        result.setErrMsg(errMsg);

        return result;

    }

    public static <T> Result nologin(){
        Result result = new Result();
        result.setCode(ResultCodeEnum.NO_LOGIN.getCode());
        result.setErrMsg("未登录");
        return result;

    }

}
