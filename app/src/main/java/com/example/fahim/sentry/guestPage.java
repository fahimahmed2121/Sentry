package com.example.fahim.sentry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class guestPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_page);
    }

    public void toTenantDirectory(View tenantDirectory) {
        Intent intent = new Intent(this, tenantDirectory);
        startActivity(intent);
    }
}
