package com.example.fahim.sentry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Verified extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verified);
    }
    public void checkOut(View CheckOut) {
        //TODO show host main page
        Intent intent = new Intent(this, CheckOut.class);
        startActivity(intent);
    }
}
