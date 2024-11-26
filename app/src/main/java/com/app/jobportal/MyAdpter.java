package com.app.jobportal;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.app.jobportal.fragment.Slide1Fragment;
import com.app.jobportal.fragment.Slide2Fragment;

public class MyAdpter extends FragmentPagerAdapter {

    public MyAdpter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Slide1Fragment();
            case 1:
                return new Slide2Fragment();
            case 2:
                return new Slide1Fragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
