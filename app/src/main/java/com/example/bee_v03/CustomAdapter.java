package com.example.bee_v03;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CustomAdapter extends FragmentPagerAdapter {

    private Context context;
    int numberOfTabs;

    public CustomAdapter(Context context, FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.context = context;
        this.numberOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case(0):
                DashboardFragment dashboardFragment = new DashboardFragment();
                return dashboardFragment;
            case(1):
                TimelineFragment timelineFragment = new TimelineFragment();
                return timelineFragment;
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
