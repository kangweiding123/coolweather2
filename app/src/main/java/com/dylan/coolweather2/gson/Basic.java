package com.dylan.coolweather2.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kangweiding on 2018/3/21.
 */

public class Basic {

    @SerializedName("city")
    public String cityName; //城市名称

    @SerializedName("id")
    public String weatherId;// 天气ID

    @SerializedName("update")
    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime; // 更新时间
    }
}
