package com.imooc.form;

import lombok.Data;

/**
 * @author lhtao
 * @date 2019-01-23 18:55
 */
@Data
public class CategoryForm {
    private Integer categoryId;

    /** 类目名字 */
    private String categoryName;

    /** 类目编号 */
    private Integer categoryType;
}
