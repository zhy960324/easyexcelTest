package com.zhy.easyexceldemo.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.zhy.easyexceldemo.easyexcel.ExcelPatternMsg;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Null;
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
public class UserExcelDto implements Serializable {

    private static final long serialVersionUID = 1L;

    //名称
    @ExcelProperty(index = 0,value = "名称")
    @ColumnWidth(30)
    @Length(max = 10)
    private String name;

    //性别
    @ExcelProperty(index = 1,value = "性别")
    @ColumnWidth(30)
    @Length(max = 2)
    private String sex;

    //年龄
    @ExcelProperty(index = 2,value = "年龄")
    @ColumnWidth(30)
    @Pattern(regexp = ExcelPatternMsg.NUMBER,message = ExcelPatternMsg.NUMBER_MSG)
    private String age;


    //生日
    @ExcelProperty(index = 3,value = "生日")
    @Pattern(regexp = ExcelPatternMsg.DATE_TIME1,message = ExcelPatternMsg.DATE_TIME1_MSG)
    private String birthday;
}
