package com.minitoma.capitaine.wadoweplay;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.SparseArray;

import java.util.List;

public class MyPagerAdapter extends FragmentPagerAdapter {
    private static int NUM_ITEMS = 3;

    public MyPagerAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return ListFriendFragment.newInstance("toto");
            case 1:
                return ProfileFragment.newInstance("Fragment 2");
            case 2:
                return StatusFeedFragment.newInstance("Fragment 3");
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "tab" + position;
    }
}
