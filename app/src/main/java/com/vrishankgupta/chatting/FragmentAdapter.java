package com.vrishankgupta.chatting;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by harshdeepsingh on 21/03/18.
 */

public class FragmentAdapter extends FragmentPagerAdapter {

    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        EventFragment fragment = new EventFragment();
        switch (position){
            case 0:
                fragment.setImageResId(R.drawable.one);
                break;
            case 1:
                fragment.setImageResId(R.drawable.two);
                break;
            case 2:
                fragment.setImageResId(R.drawable.three);
                break;
            case 3:
                fragment.setImageResId(R.drawable.four);
                break;
            case 4:
                fragment.setImageResId(R.drawable.five);
                break;
            case 5:
                fragment.setImageResId(R.drawable.six);
                break;
            case 6:
                fragment.setImageResId(R.drawable.seven);
                break;
            case 7:
                fragment.setImageResId(R.drawable.eight);
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 8;
    }
}
