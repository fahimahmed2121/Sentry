package com.example.fahim.sentry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BuildingManager extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_building_manager);
    }
    public void specialHostLogin(View HostLogin) {
        //TODO show host main page
        int x = 1;
        Intent intent = new Intent(this, HostMain.class);
        startActivity(intent);
    }
}
