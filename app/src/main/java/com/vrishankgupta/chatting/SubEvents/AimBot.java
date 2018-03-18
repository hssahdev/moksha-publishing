package com.vrishankgupta.chatting.SubEvents;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.vrishankgupta.chatting.EventsActivityDance;
import com.vrishankgupta.chatting.HomeActivity;
import com.vrishankgupta.chatting.R;

public class AimBot extends AppCompatActivity {

    Button fifa,militia,cs,tekken,nfs,cricket,simcity,dota;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aimbot_detail);

        ImageView signOut,homeIcon;
        signOut = (ImageView) findViewById(R.id.sign_out_icon);
        homeIcon = (ImageView) findViewById(R.id.home_icon);

        fifa = (Button) findViewById(R.id.fifa);
        militia = (Button) findViewById(R.id.militia);
        cs = (Button) findViewById(R.id.cs);
        tekken = (Button) findViewById(R.id.tekken);
        nfs = (Button) findViewById(R.id.nfs);
        cricket = (Button) findViewById(R.id.cricket);
        simcity = (Button) findViewById(R.id.simcity);
        dota = (Button) findViewById(R.id.dota);

        fifa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String a = "https://goo.gl/forms/9KxWK7eWfkvucBP63";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(a));
                startActivity(i);
            }
        });


        militia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = "https://goo.gl/forms/Ku3lpq8trE6sJWbL2";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(a));
                startActivity(i);

            }
        });


        dota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = "https://docs.google.com/forms/d/e/1FAIpQLSdG3CT4J1W5TCB7_G3prlj-1zffYkmgU-R55Y1Ky8J4SYeEIA/viewform";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(a));
                startActivity(i);
            }
        });


        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = "https://goo.gl/forms/MNLhL6PKv1oCOjBO2";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(a));
                startActivity(i);

            }
        });


        tekken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = "https://goo.gl/forms/ifPvkXlPwE3RrSMI3";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(a));
                startActivity(i);

            }
        });


        nfs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = "https://goo.gl/forms/9T8EThPtIYIAbYam2";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(a));
                startActivity(i);

            }
        });


        cricket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = "http://nsitmoksha.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(a));
                startActivity(i);

            }
        });



        simcity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = "http://nsitmoksha.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(a));
                startActivity(i);
            }
        });

        signOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AuthUI.getInstance().signOut(AimBot.this).addOnCompleteListener(new OnCompleteListener<Void>() {
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
    }
}
