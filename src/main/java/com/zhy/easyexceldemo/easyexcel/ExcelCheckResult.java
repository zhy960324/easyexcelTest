package com.zhy.easyexceldemo.easyexcel;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhy
 * @title: ExcelCheckErrDto
 * @projectName cec-moutai-bd-display
 * @description: excel数据导入结果
 * @date 2019/12/2318:23
 */
@Data
public class ExcelCheckResult<T> {
    private List<T> successDtos;

    private List<ExcelCheckErrDto<T>> errDtos;

    public ExcelCheckResult(List<T> successDtos, List<ExcelCheckErrDto<T>> errDtos){
        this.successDtos =successDtos;
        this.errDtos = errDtos;
    }

    public ExcelCheckResult(List<ExcelCheckErrDto<T>> errDtos){
        this.successDtos =new ArrayList<>();
        this.errDtos = errDtos;
    }
}
