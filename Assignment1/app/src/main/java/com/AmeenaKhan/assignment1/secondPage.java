package com.AmeenaKhan.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class secondPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
    }

    public void open1(View view) {
        Intent intent = new Intent(secondPage.this,kalma1.class);
        startActivity(intent);
    }

    public void open2(View view) {
        Intent intent = new Intent(secondPage.this,kalma2.class);
        startActivity(intent);
    }

    public void open3(View view) {
        Intent intent = new Intent(secondPage.this,kalma3.class);
        startActivity(intent);
    }

    public void open4(View view) {
        Intent intent = new Intent(secondPage.this,kalma4.class);
        startActivity(intent);
    }

    public void open5(View view) {
        Intent intent = new Intent(secondPage.this,kalma5.class);
        startActivity(intent);
    }

    public void open6(View view) {
        Intent intent = new Intent(secondPage.this,kalma6.class);
        startActivity(intent);
    }
}