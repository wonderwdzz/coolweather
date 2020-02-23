package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 45861 on 2020/2/20.
 */

public class Basic {
    //@SerializedName(String)注解将JSON和Java字段之间建立映射关系
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
