package com.example.targon.bonerkebab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CreateKebabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_kebab);
    }

    public void addLocalization(View view) {
        Intent intent =  new Intent(this, LocalizationActivity.class);
        startActivity(intent);
    }
}
