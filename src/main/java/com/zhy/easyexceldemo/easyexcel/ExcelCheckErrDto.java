package com.zhy.easyexceldemo.easyexcel;

import lombok.Data;

/**
 * @author zhy
 * @title: ExcelCheckErrDto
 * @projectName cec-moutai-bd-display
 * @description: excel单条数据导入结果
 * @date 2019/12/2318:23
 */
@Data
public class ExcelCheckErrDto<T> {

    private T t;

    private String errMsg;

    public ExcelCheckErrDto(){}

    public ExcelCheckErrDto(T t, String errMsg){
        this.t = t;
        this.errMsg = errMsg;
    }
}
