package com.example.signlanguage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInClient;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class LoginActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager2;
    FloatingActionButton fb,google,twitter;
    float v=0;
    String titles[]={"Login","Sign Up"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        tabLayout=findViewById(R.id.tab_layout);
        viewPager2=findViewById(R.id.view_pager);
        fb=findViewById(R.id.fab_facebook);
        google=findViewById(R.id.fab_google);
        twitter=findViewById(R.id.fab_twitter);


        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final LoginAdapter adapter=new LoginAdapter(LoginActivity.this,this,titles.length);

        viewPager2.setAdapter(adapter);

        new TabLayoutMediator(tabLayout, viewPager2,
                (tab, position) -> tab.setText(titles[position])
        ).attach();

        fb.setTranslationY(300);
        google.setTranslationY(300);
        twitter.setTranslationY(300);
        tabLayout.setTranslationY(300);

        fb.setAlpha(v);
        google.setAlpha(v);
        twitter.setAlpha(v);
        tabLayout.setAlpha(v);

        fb.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        google.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
        twitter.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(800).start();
        tabLayout.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(1000).start();



        //Google signin

     /*   google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                signInRequest = BeginSignInRequest.builder()
                        .setGoogleIdTokenRequestOptions(GoogleIdTokenRequestOptions.builder()
                                .setSupported(true)
                                // Your server's client ID, not your Android client ID.
                                .setServerClientId("601833220926-5q06v5j3fg2ikh2gighd57525hj9m0vk.apps.googleusercontent.com"))
                                // Only show accounts previously used to sign in.
                                .setFilterByAuthorizedAccounts(true)
                                .build())
                        .build();

            }
        });*/


    }
}