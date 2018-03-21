package com.vrishankgupta.chatting;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by harshdeepsingh on 21/03/18.
 */

public class ScrollingEventsFragment extends Fragment {

    public ScrollingEventsFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.scrolling_fragment,container,false);
        ViewPager viewPager = (ViewPager) rootView.findViewById(R.id.viewPager);
        FragmentAdapter adapter = new FragmentAdapter(getFragmentManager());
        viewPager.setAdapter(adapter);
        return rootView;
    }
}
