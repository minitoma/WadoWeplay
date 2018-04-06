package com.minitoma.capitaine.wadoweplay;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;
import java.util.Vector;

public class MainActivity extends FragmentActivity {

    private PagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Création de la liste de Fragment que fera défiler le PagerAdapter
        List fragments = new Vector();

        // Ajout des Fragments dans la liste

        fragments.add(Fragment.instantiate(this, StatusFeedFragment.class.getName()));
        fragments.add(Fragment.instantiate(this, ListFriendFragment.class.getName()));
        fragments.add(Fragment.instantiate(this, ProfileFragment.class.getName()));

        // Création de l'adapter qui s'occupera de l'affichage de la liste de Fragments
        this.mPagerAdapter = new MyPagerAdapter(super.getSupportFragmentManager(), fragments );

        ViewPager pager = (ViewPager) super.findViewById(R.id.viewpager);
        // Affectation de l'adapter au ViewPager
        pager.setAdapter(this.mPagerAdapter);

    }
}
