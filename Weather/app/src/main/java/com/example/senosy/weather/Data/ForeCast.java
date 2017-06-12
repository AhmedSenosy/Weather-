package com.example.senosy.weather.Data;

/**
 * Created by senosy on 03/01/2017.
 */

public class ForeCast {

    private int temp_c,feelLike_c,will_it_rain;
    private String condition,time;
    //private URL image_url;

    public ForeCast(String time, int temp_c, int feelLike_c, int will_it_rain, String condition/*, URL image_url*/) {
        this.time = time;
        this.temp_c = temp_c;
        this.feelLike_c = feelLike_c;
        this.will_it_rain = will_it_rain;
        this.condition = condition;
       // this.image_url = image_url;
    }

    public String getTime() {
        return time;
    }

    public int getTemp_c() {
        return temp_c;
    }

    public int getFeelLike_c() {
        return feelLike_c;
    }

    public int getWill_it_rain() {
        return will_it_rain;
    }

    public String getCondition() {
        return condition;
    }

    /*public URL getImage_url() {
        return image_url;
    }*/
}
