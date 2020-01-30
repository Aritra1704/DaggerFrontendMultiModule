package com.arpaul.daggerfrontendmultimodule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

// https://proandroiddev.com/using-dagger-in-a-multi-module-project-1e6af8f06ffc
// https://github.com/Aritra1704/dagger-playground/tree/multi-module

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
