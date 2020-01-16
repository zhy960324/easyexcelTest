package com.zhy.easyexceldemo.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @title: ExcelImportTest
 * @projectName easyexceldemo
 * @description: 用户
 * @author zhy
 * @date 2020/1/1610:41
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    //名称
    private String name;

    //性别
    private String sex;

    //年龄
    private Integer age;

    //生日
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    @JsonFormat( pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date birthday;
}
