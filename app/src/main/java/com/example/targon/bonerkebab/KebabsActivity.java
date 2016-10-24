package com.example.targon.bonerkebab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class KebabsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kebabs);
    }

    public void addKebab(View view) {
        Intent intent =  new Intent(this, CreateKebabActivity.class);
        startActivity(intent);
    }
}
