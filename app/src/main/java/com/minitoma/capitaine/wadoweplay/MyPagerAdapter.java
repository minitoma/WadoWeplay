package com.minitoma.capitaine.wadoweplay;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPagerAdapter extends FragmentPagerAdapter {
    private static int NUM_ITEMS = 3;

    StatusFeedFragment statusFeedFragment = StatusFeedFragment.newInstance("Liste des status");
    ProfileFragment profileFragment = ProfileFragment.newInstance("Profil");
    ListFriendFragment listFriendFragment = ListFriendFragment.newInstance("Liste d'amis");

    public MyPagerAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return statusFeedFragment;
            case 1:
                return profileFragment;
            case 2:
                return listFriendFragment;
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
