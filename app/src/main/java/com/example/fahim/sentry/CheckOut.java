package com.example.fahim.sentry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CheckOut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);
    }
    public void hostLogin(View hostMain) {
        //TODO show host main page
        Intent intent = new Intent(this, HostMain.class);
        startActivity(intent);
    }
}
