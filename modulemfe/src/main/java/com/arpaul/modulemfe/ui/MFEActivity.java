package com.arpaul.modulemfe.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.arpaul.modulemfe.R;
import com.arpaul.modulemfe.component.DaggerMFEComponent;
import com.arpaul.modulemfe.contracts.MFEContract;

public class MFEActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mfe);

        ((Button)findViewById(R.id.btnButton1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
