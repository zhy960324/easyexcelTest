package com.zhy.easyexceldemo.common;

import lombok.Data;

/**
 * @title: Result
 * @projectName easyexceldemo
 * @description: rest层返回结果集
 * @author zhy
 * @date 2020/1/1611:34
 */
@Data
public class Result<T> {

    public static final String SUCCESS_MSG = "操作成功！";
    private static final long serialVersionUID = -34684491868853686L;
    private boolean result;
    private String code;
    private String message;
    private String token;
    private Long count;
    private T data;

}
