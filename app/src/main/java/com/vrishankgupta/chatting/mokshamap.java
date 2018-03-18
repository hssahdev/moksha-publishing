package com.vrishankgupta.chatting;


import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
@SuppressLint("ValidFragment")
public class mokshamap extends Fragment {

    private int i;


    public mokshamap(int i) {
        this.i = i;
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        if(i==0)
            return inflater.inflate(R.layout.about, container, false);
        else  if (i==1)
            return inflater.inflate(R.layout.fragment_mokshamap, container, false);
        else  if (i==2)
            return inflater.inflate(R.layout.sponsors, container, false);
        else  if (i==3)
            return inflater.inflate(R.layout.team_layout, container, false);
        else
            return inflater.inflate(R.layout.contact_us, container, false);

    }

}
