package com.example.alc4phase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void About(View v){
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }

    public void Profile(View u){
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
}
