package com.upgrad.ugreactnative_example;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.upgrad.ugreactnative.UGReactNativeActivity;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton(View view) {
        Intent intent = new Intent(this, UGReactNativeActivity.class);
        startActivity(intent);
    }
}
