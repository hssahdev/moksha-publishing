package com.vrishankgupta.chatting;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private FirebaseAuth auth;
    private FirebaseAuth.AuthStateListener authStateListener;
    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupFirebaseAuth();

        android.app.FragmentManager fragmentManager = getFragmentManager();
        BlankFragment frag = new BlankFragment(getApplicationContext());
        fragmentManager.beginTransaction().replace(R.id.frame, frag).commit();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(HomeActivity.this)
                        .setIcon(R.drawable.itemlogo)
                        .setTitle("MOKSHA")
                        .setMessage("CONTACT US\n")
                        .setPositiveButton("YAMIN :9999132765", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String phone = "9999132765";
                                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                                startActivity(intent);

                            }

                        })
                        .setNegativeButton("MAHIMA :9990891061", new DialogInterface.OnClickListener()
                        {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String phone = "9990891061";
                                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                                startActivity(intent);
                            }

                        })
                        .show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            new AlertDialog.Builder(this)
                    .setIcon(R.drawable.m)
                    .setTitle("MOKSHA")
                    .setMessage("Do You Want To Exit")
                    .setPositiveButton("YES", new DialogInterface.OnClickListener()
                    {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }

                    })
                    .setNegativeButton("NO", null)
                    .show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            AuthUI.getInstance().signOut(this).addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    Toast.makeText(getApplicationContext(),"Signed Out",Toast.LENGTH_SHORT).show();
                    finish();
                }
            });
            return true;
        }else if(id==R.id.home){
            android.app.FragmentManager fragmentManager = getFragmentManager();
            BlankFragment frag = new BlankFragment(getApplicationContext());
            fragmentManager.beginTransaction().replace(R.id.frame, frag).commit();
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.about) {
            android.app.FragmentManager fragmentManager = getFragmentManager();
            mokshamap frag = new mokshamap(0);
            fragmentManager.beginTransaction().replace(R.id.frame, frag).commit();

        } else if (id == R.id.events) {
            startActivity(new Intent(getApplicationContext(),EventsActivityDance.class));

        } else if (id == R.id.chatroom) {
            startActivity(new Intent(getApplicationContext(),ChatMainActivity.class));

        } else if (id == R.id.directions) {
            Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                    Uri.parse("http://maps.google.com/maps?daddr=Netaji Subhas Institute Of Technology, Azad Hind Fauz Marg, Sector 3, Dwarka, New Delhi, Delhi 110078"));
            startActivity(intent);

        } else if (id == R.id.mokshamap) {
            android.app.FragmentManager fragmentManager = getFragmentManager();
            mokshamap frag = new mokshamap(1);
            fragmentManager.beginTransaction().replace(R.id.frame, frag).commit();

        }else if (id == R.id.sponsors) {
            android.app.FragmentManager fragmentManager = getFragmentManager();
            mokshamap frag = new mokshamap(2);
            fragmentManager.beginTransaction().replace(R.id.frame, frag).commit();

        }else if (id == R.id.team) {
            android.app.FragmentManager fragmentManager = getFragmentManager();
            mokshamap frag = new mokshamap(3);
            fragmentManager.beginTransaction().replace(R.id.frame, frag).commit();

        }else if (id == R.id.contactus) {
            android.app.FragmentManager fragmentManager = getFragmentManager();
            mokshamap frag = new mokshamap(4);
            fragmentManager.beginTransaction().replace(R.id.frame, frag).commit();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    private void setupFirebaseAuth()
    {
        Log.d(TAG, "setupFirebaseAuth: setting up firebase auth");
        auth = FirebaseAuth.getInstance();
        authStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                checkCurrentUser(user);
                if(user != null)
                {
                    Log.d(TAG, "onAuthStateChanged: signed In" + user.getUid());
                }
                else
                {
                    Log.d(TAG, "onAuthStateChanged: SignedOut");
                }
            }
        };
    }


    private void checkCurrentUser(FirebaseUser user)
    {
        Log.d(TAG, "checkCurrentUser: Check if logged in");
        if(user == null)
        {
            Log.d(TAG, "checkCurrentUser: no user");
            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(intent);
            finish();
        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        auth.addAuthStateListener(authStateListener);
        checkCurrentUser(auth.getCurrentUser());
    }

    @Override
    protected void onStop() {
        super.onStop();
        auth.removeAuthStateListener(authStateListener);
    }
}
