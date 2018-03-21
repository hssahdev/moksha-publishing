package com.vrishankgupta.chatting;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by harshdeepsingh on 21/03/18.
 */

public class EventFragment extends Fragment {

    int ImageResId;

    public EventFragment() {
        super();
        ImageResId=R.drawable.one;
    }

    public void setImageResId(int resid){
        ImageResId=resid;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.event_fragment,container,false);
        ImageView imageView= (ImageView) view.findViewById(R.id.eventImageView);
        imageView.setImageResource(ImageResId);
        return view;
    }
}
