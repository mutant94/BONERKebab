package com.example.targon.bonerkebab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LocalizationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localization);
    }


    public void addLocalization(View view) {
        Intent intent =  new Intent(this, TimeActivity.class);
        startActivity(intent);
    }
}
