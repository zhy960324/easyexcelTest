package com.zhy.easyexceldemo.service.impl;

import com.alibaba.excel.util.StringUtils;
import com.zhy.easyexceldemo.dto.UserExcelDto;
import com.zhy.easyexceldemo.easyexcel.ExcelCheckErrDto;
import com.zhy.easyexceldemo.easyexcel.ExcelCheckResult;
import com.zhy.easyexceldemo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @title: UserService
 * @projectName easyexceldemo
 * @description: 用户service
 * @author zhy
 * @date 2020/1/1610:56
 */
@Service
public class UserServiceImpl implements UserService {

    //不合法名字
    public static final String ERR_NAME = "史珍香";
    /**
     * @description: 校验方法
     * @param userExcelDtos 用户信息
     * @throws
     * @return com.cec.moutai.common.easyexcel.ExcelCheckResult
     * @author zhy
     * @date 2019/12/24 14:57
     */
    @Override
    public ExcelCheckResult checkImportExcel(List<UserExcelDto> userExcelDtos) {
        //成功结果集
        List<UserExcelDto> successList = new ArrayList<>();
        //错误数组
        List<ExcelCheckErrDto<UserExcelDto>> errList = new ArrayList<>();
        for (UserExcelDto userExcelDto : userExcelDtos) {
            //错误信息
            StringBuilder errMsg = new StringBuilder();
            //根据自己的业务去做判断
            if (ERR_NAME.equals(userExcelDto.getName())) 
                errMsg.append("请输入正确的名字").append(";");
            if (StringUtils.isEmpty(errMsg.toString())){
                //这里有两个选择，1、一个返回成功的对象信息，2、进行持久化操作
                successList.add(userExcelDto);
            }else{//添加错误信息
                errList.add(new ExcelCheckErrDto(userExcelDto,errMsg.toString()));
            }
        }
        return new ExcelCheckResult(successList,errList);
    }
}
