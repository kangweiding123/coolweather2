package com.dylan.coolweather2.db;

import org.litepal.crud.DataSupport;

/**
 * Created by kangweiding on 2018/3/20.
 */

public class Province extends DataSupport {

    // ID主键
    private int id;
    // 省份名称
    private String provinceName;
    // 省份代码
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
