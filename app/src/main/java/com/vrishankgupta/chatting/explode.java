package com.vrishankgupta.chatting;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import tyrantgit.explosionfield.ExplosionField;

public class explode extends AppCompatActivity {

    ImageView a,b,c,d,e,f,g,h,i,j;
    ImageView k,l;
    FrameLayout fl;
    RelativeLayout rl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explode);


        k= (ImageView) findViewById(R.id.firstmoksha);
        l= (ImageView) findViewById(R.id.nsitfirst);
        fl= (FrameLayout) findViewById(R.id.first);

        rl= (RelativeLayout) findViewById(R.id.relative);

        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExplosionField explosionField=ExplosionField.attach2Window(explode.this);
                explosionField.explode(k);
            }
        });


        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExplosionField explosionField=ExplosionField.attach2Window(explode.this);
                explosionField.explode(l);
            }
        });


        fl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExplosionField explosionField=ExplosionField.attach2Window(explode.this);
                explosionField.explode(fl);
            }
        });


        a= (ImageView) findViewById(R.id.imageView3);
        b= (ImageView) findViewById(R.id.imageView4);
        c= (ImageView) findViewById(R.id.imageView5);
        d= (ImageView) findViewById(R.id.imageView6);
        e= (ImageView) findViewById(R.id.imageView7);
        f= (ImageView) findViewById(R.id.imageView8);
        g= (ImageView) findViewById(R.id.imageView9);
        h= (ImageView) findViewById(R.id.imageView10);
        i= (ImageView) findViewById(R.id.imageView11);
        j= (ImageView) findViewById(R.id.imageView12);


        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExplosionField explosionField=ExplosionField.attach2Window(explode.this);
                explosionField.explode(a);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExplosionField explosionField=ExplosionField.attach2Window(explode.this);
                explosionField.explode(b);
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExplosionField explosionField=ExplosionField.attach2Window(explode.this);
                explosionField.explode(c);
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExplosionField explosionField=ExplosionField.attach2Window(explode.this);
                explosionField.explode(d);
            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExplosionField explosionField=ExplosionField.attach2Window(explode.this);
                explosionField.explode(e);
            }
        });

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExplosionField explosionField=ExplosionField.attach2Window(explode.this);
                explosionField.explode(f);
            }
        });

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExplosionField explosionField=ExplosionField.attach2Window(explode.this);
                explosionField.explode(g);
            }
        });

        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExplosionField explosionField=ExplosionField.attach2Window(explode.this);
                explosionField.explode(h);
            }
        });

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExplosionField explosionField=ExplosionField.attach2Window(explode.this);
                explosionField.explode(i);
            }
        });

        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExplosionField explosionField=ExplosionField.attach2Window(explode.this);
                explosionField.explode(j);
            }
        });

        rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExplosionField explosionField=ExplosionField.attach2Window(explode.this);
                explosionField.explode(rl);
            }
        });


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                a.performClick();
                b.performClick();
                c.performClick();
                d.performClick();
                e.performClick();
                f.performClick();
                g.performClick();
                h.performClick();
                i.performClick();
                j.performClick();
                rl.performClick();
            }
        }, 1000);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                k.performClick();
                l.performClick();
                fl.performClick();
            }
        }, 1000);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
               startActivity(new Intent(explode.this,HomeActivity.class));
               finish();
            }
        }, 2000);


    }
}
