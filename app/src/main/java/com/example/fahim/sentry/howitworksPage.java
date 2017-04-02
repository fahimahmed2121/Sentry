package com.example.fahim.sentry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class howitworksPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_howitworks_page);
    }
    public void login(View Login) {
        //TODO show host main page
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}
