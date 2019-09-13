package com.muflihun.moviecatalogue4.adapters;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.muflihun.moviecatalogue4.R;
import com.muflihun.moviecatalogue4.fragments.FavoriteMovieFragment;
import com.muflihun.moviecatalogue4.fragments.FavoriteTvFragment;

import java.util.ArrayList;
import java.util.List;

public class PagerAdapter extends FragmentPagerAdapter {
    private Context context;
    private List<Fragment> fragments;
    private List<String> fragmentTitles;
    private static final String[] TAB_TITLES = new String[2];
    private static final String TAG = "PagerAdapter";

    public PagerAdapter(Context context, @NonNull FragmentManager fm) {
        super(fm);
        this.context = context;
        fragments = new ArrayList<>();
        fragmentTitles = new ArrayList<>();
    }

    public void attach(Fragment fragment, String title) {
        fragments.add(fragment);
        fragmentTitles.add(title);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitles.get(position);
    }
}
