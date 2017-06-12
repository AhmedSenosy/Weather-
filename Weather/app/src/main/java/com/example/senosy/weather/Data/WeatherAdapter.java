package com.example.senosy.weather.Data;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.senosy.weather.R;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by senosy on 03/01/2017.
 */

public class WeatherAdapter extends ArrayAdapter<ForeCast> {

    public WeatherAdapter(Context contex, ArrayList<ForeCast> foreCasts)
    {
        super(contex,0,foreCasts);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listView=convertView;
        TextView hour_text,temp_c_text,feelLike_c_text,rain,condition;
        //ImageView image_condition;

        ForeCast current_foreCast=getItem(position);


        if(listView==null)
        {
            listView= LayoutInflater.from(getContext()).inflate(R.layout.forecast_listview,parent,false);
        }

        hour_text=(TextView) listView.findViewById(R.id.hour);
        temp_c_text=(TextView) listView.findViewById(R.id.temp_c);
        feelLike_c_text=(TextView) listView.findViewById(R.id.feelLike_forecast_textView);
        rain=(TextView) listView.findViewById(R.id.rain);
        condition=(TextView)listView.findViewById(R.id.condition_forecast_textView);
        //image_condition=(ImageView)lisView.findViewById(R.id.forecast_image_view);



        hour_text.setText(String.valueOf( current_foreCast.getTime()));
        temp_c_text.setText(String.valueOf(current_foreCast.getTemp_c()));
        feelLike_c_text.setText(String.valueOf(current_foreCast.getFeelLike_c()));
        condition.setText(current_foreCast.getCondition());
       // image_condition.setImageBitmap(getImageFromUrl(current_foreCast.getImage_url()));

        if(current_foreCast.getWill_it_rain()==0)
        {
            rain.setText("NO");
        }
        else
        {
            rain.setText("YES");
        }

        return listView;
    }

    private Bitmap getImageFromUrl(URL url)
    {
        InputStream inputStream=null;
        try {
            inputStream=url.openConnection().getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return BitmapFactory.decodeStream(inputStream);
    }

}
