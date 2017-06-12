package com.example.senosy.weather;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    public static final String LOG_TAG = MainActivity.class.getName();

    public static final String APIXIU_URL="http://api.apixu.com/v1/forecast.json?key=8708db889c08470eb47185254170101&q=Cairo";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewPager viewPager=(ViewPager) findViewById(R.id.viewpager);

        SimpleFragmentPagerAdapter simpleFragmentPagerAdapter =new SimpleFragmentPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(simpleFragmentPagerAdapter);

    }
}
