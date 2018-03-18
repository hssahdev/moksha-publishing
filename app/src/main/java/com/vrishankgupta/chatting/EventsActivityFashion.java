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
import com.vrishankgupta.chatting.SubEvents.MrMoksha;
import com.vrishankgupta.chatting.SubEvents.Rogue;
import com.vrishankgupta.chatting.SubEvents.Talent;


public class EventsActivityFashion extends AppCompatActivity {

    ImageView front_arrow,back_arrow,rogue,mr_moksha,talent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_fashion);

        front_arrow = (ImageView) findViewById(R.id.front_arrow);
        back_arrow = (ImageView) findViewById(R.id.back_arrow);
        rogue = (ImageView) findViewById(R.id.rogue);
        mr_moksha = (ImageView) findViewById(R.id.mr_moksha);
        talent = (ImageView) findViewById(R.id.talent);

        ImageView signOut,homeIcon;
        signOut = (ImageView) findViewById(R.id.sign_out_icon);
        homeIcon = (ImageView) findViewById(R.id.home_icon);

        signOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AuthUI.getInstance().signOut(EventsActivityFashion.this).addOnCompleteListener(new OnCompleteListener<Void>() {
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

        front_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),EventsActivityAutomobile.class));
                finish();
            }
        });


        back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),EventsActivityDance.class));
                finish();
            }
        });


        rogue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Rogue.class));
            }
        });

        mr_moksha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MrMoksha.class));
            }
        });

        talent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Talent.class));
            }
        });
    }
}
