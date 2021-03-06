package com.dylan.coolweather2.db;

import org.litepal.crud.DataSupport;

/**
 * Created by kangweiding on 2018/3/20.
 */

public class County extends DataSupport {

    // 主键ID
    private int id;
    // 县名称
    private String countyName;
    // 县对应天气ID
    private String weatherId;
    // 城市ID
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
