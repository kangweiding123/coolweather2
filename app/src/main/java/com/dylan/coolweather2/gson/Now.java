package com.dylan.coolweather2.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kangweiding on 2018/3/21.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature; //温度

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info; //天气类型（如阵雨，多云）
    }
}
