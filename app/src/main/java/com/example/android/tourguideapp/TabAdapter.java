package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new TabAdapter object.
     */
    public TabAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the Fragment that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HomeFragment();
        } else if (position == 1) {
            return new SightsFragment();
        } else if (position == 2) {
            return new ActivitiesFragment();
        } else if (position == 3) {
            return new ParksFragment();
        } else {
            return new RestaurantsFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.home_fragment);
        } else if (position == 1) {
            return mContext.getString(R.string.activities_fragment);
        } else if (position == 2) {
            return mContext.getString(R.string.sights_fragment);
        } else if (position == 3) {
            return mContext.getString(R.string.parks_fragment);
        } else {
            return mContext.getString(R.string.restaurants_fragment);
        }
    }
}

