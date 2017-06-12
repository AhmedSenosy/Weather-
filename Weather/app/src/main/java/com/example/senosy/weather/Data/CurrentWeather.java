package com.example.senosy.weather.Data;

/**
 * Created by senosy on 03/01/2017.
 */

public class CurrentWeather {

    private String last_update,condition;
    private int temp_c,humadity,cloud,feels_like_c;
    private boolean is_day;
    //private Bitmap image_url;

    public CurrentWeather(String last_update, String condition,
                          int temp_c, int humadity, int cloud, int feels_like_c,
                          boolean is_day /*Bitmap image_url*/)
    {
        this.last_update = last_update;
        this.condition = condition;
        this.temp_c = temp_c;
        this.humadity = humadity;
        this.cloud = cloud;
        this.feels_like_c = feels_like_c;
        this.is_day = is_day;
        //this.image_url = image_url;
    }

    public String getLast_update() {
        return last_update;
    }

    public String getCondition() {
        return condition;
    }

    public int getTemp_c() {
        return temp_c;
    }

    public int getHumadity() {
        return humadity;
    }

    public int getCloud() {
        return cloud;
    }

    public int getFeels_like_c() {
        return feels_like_c;
    }

    public boolean is_day() {
        return is_day;
    }

    /*public Bitmap getImage_url() {
        return image_url;
    }*/
}
