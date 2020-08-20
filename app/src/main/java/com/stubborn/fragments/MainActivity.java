package com.stubborn.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button frag1,frag2;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frag1 = findViewById(R.id.frag1);
        frag2 = findViewById(R.id.frag2);
        frag2 = findViewById(R.id.frag2);

        linearLayout = findViewById(R.id.linearLayout);

        frag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentOne fragO = new FragmentOne();
                FragmentManager fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.linearLayout, fragO, fragO.getTag()).commit();
            }
        });
        frag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTwo fragT = new FragmentTwo();
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.linearLayout,fragT, fragT.getTag()).commit();
            }
        });



    }
}
