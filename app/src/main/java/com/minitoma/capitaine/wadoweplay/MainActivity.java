package com.minitoma.capitaine.wadoweplay;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;
import java.util.Vector;

public class MainActivity extends FragmentActivity {

    private FragmentPagerAdapter adapterViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewPager pager = (ViewPager) super.findViewById(R.id.viewpager);
        adapterViewPager = new MyPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(adapterViewPager);

    }
}
