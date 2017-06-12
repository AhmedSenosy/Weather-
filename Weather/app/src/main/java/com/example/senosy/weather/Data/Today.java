package com.example.senosy.weather.Data;

import java.net.URL;

/**
 * Created by senosy on 28/01/2017.
 */

public class Today {


    private int min,max;
    private String condition,sunRise,sunSet;
    private URL image_url;

    public Today(int min, int max, String sunRise, String sunSet, String condition/*, URL image_url*/) {
        this.min = min;
        this.max = max;
        this.sunRise = sunRise;
        this.sunSet = sunSet;
        this.condition = condition;
        /*this.image_url = image_url;*/
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public String getSunRise() {
        return sunRise;
    }

    public String getSunSet() {
        return sunSet;
    }

    public String getCondition() {
        return condition;
    }

    public URL getImage_url() {
        return image_url;
    }


}
