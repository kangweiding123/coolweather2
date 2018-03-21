package com.dylan.coolweather2.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kangweiding on 2018/3/21.
 */

public class AQI {
    public AQICity city;

    public class AQICity {

        @SerializedName("aqi")
        public String aqi;

        @SerializedName("pm25")
        public String pm25; //PM2.5
    }
}
