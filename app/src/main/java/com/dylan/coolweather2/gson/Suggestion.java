package com.dylan.coolweather2.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kangweiding on 2018/3/21.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort; //舒适度

    public class Comfort {

        @SerializedName("txt")
        public String info; // 舒适度建议描述
    }

    @SerializedName("cw")
    public CarWash carWash; // 洗车

    public class CarWash {

        @SerializedName("txt")
        public String info; // 洗车建议
    }

    @SerializedName("sport")
    public Sport sport; // 运动

    public class Sport {

        @SerializedName("txt")
        public String info;// 洗车建议
    }
}
