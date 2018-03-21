package com.dylan.coolweather2.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 未来天气
 */

public class Forecast {
    @SerializedName("date")
    public String date; // 时间

    @SerializedName("tmp")
    public Temperature temperature; // 温度

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max; // 最高温度

        public String min; // 最低温度
    }

    public class More {

        @SerializedName("txt_d")
        public String info; // 天气情况
    }
}
