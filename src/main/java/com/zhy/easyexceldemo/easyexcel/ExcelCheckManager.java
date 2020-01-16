package com.zhy.easyexceldemo.easyexcel;

import java.util.List;

/**
 * @author zhy
 * @title: ExcelCheckManager
 * @projectName cec-moutai-bd-display
 * @description: excel校验接口
 * @date 2019/12/2317:44
 */
public interface ExcelCheckManager<T> {

    /**
     * @description: 校验方法
     * @param objects
     * @throws
     * @return com.cec.moutai.common.easyexcel.ExcelCheckResult
     * @author zhy
     * @date 2019/12/24 14:57
     */
    ExcelCheckResult checkImportExcel(List<T> objects);
}
