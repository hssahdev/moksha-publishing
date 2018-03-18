package com.vrishankgupta.chatting;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.vrishankgupta.chatting.SubEvents.Kalakriti;
import com.vrishankgupta.chatting.SubEvents.Mudra;
import com.vrishankgupta.chatting.SubEvents.Oorja;
import com.vrishankgupta.chatting.SubEvents.Stepup;
import com.vrishankgupta.chatting.SubEvents.Zephyr;


public class EventsActivityDance extends AppCompatActivity {

    ImageView frontArrow,oorja,kalakriti,stepup,mudra,zephyr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_dance);

        frontArrow = (ImageView) findViewById(R.id.front_arrow);

        oorja = (ImageView) findViewById(R.id.oorja);
        kalakriti = (ImageView) findViewById(R.id.kalakriti);
        stepup = (ImageView) findViewById(R.id.stepup);
        mudra = (ImageView) findViewById(R.id.mudra);
        zephyr = (ImageView) findViewById(R.id.zephyr);
        ImageView signOut,homeIcon;
        signOut = (ImageView) findViewById(R.id.sign_out_icon);
        homeIcon = (ImageView) findViewById(R.id.home_icon);

        signOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AuthUI.getInstance().signOut(EventsActivityDance.this).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        Toast.makeText(getApplicationContext(),"Signed Out",Toast.LENGTH_SHORT).show();
                        finish();
                    }
                });
            }
        });

        homeIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),HomeActivity.class));
                finish();
            }
        });



        oorja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Oorja.class));
            }
        });

        kalakriti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Kalakriti.class));
            }
        });


        stepup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Stepup.class));
            }
        });


        mudra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Mudra.class));
            }
        });

        zephyr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Zephyr.class));
            }
        });


        frontArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),EventsActivityFashion.class));
                finish();
            }
        });
    }
}
