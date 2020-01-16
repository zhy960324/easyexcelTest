package com.zhy.easyexceldemo.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.zhy.easyexceldemo.easyexcel.ExcelPatternMsg;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * @title: UserExcelDto
 * @projectName easyexceldemo
 * @description: 用户excel类
 * @author zhy
 * @date 2020/1/1610:45
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class UserExcelErrDto extends UserExcelDto {


    //错误信息
    @ExcelProperty(index = 4,value = "错误信息")
    @ColumnWidth(50)
    private String errMsg;


}
