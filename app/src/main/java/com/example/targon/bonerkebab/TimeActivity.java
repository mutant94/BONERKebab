package com.example.targon.bonerkebab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
    }

    public void openPay(View view) {
        Intent intent =  new Intent(this, PayActivity.class);
        startActivity(intent);
    }
}
