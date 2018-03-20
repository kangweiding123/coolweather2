package com.dylan.coolweather2.db;

import org.litepal.crud.DataSupport;

/**
 * Created by kangweiding on 2018/3/20.
 */

public class City extends DataSupport {

    // 主键ID
    private int id;
    // 城市名
    private String cityName;
    // 城市代码
    private int cityCode;
    // 省份ID
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
