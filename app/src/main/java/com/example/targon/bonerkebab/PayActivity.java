package com.example.targon.bonerkebab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);
    }

    public void openCode(View view) {
        Intent intent =  new Intent(this, CodeActivity.class);
        startActivity(intent);
    }
}
