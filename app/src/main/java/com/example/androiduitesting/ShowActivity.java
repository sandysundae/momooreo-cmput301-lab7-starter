package com.example.androiduitesting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ShowActivity extends AppCompatActivity {
    // Declare the variables so that you will be able to reference it later.
    TextView cityText;
    Bundle extras;
    String city;
    Button backButton;
    //functions

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        cityText = findViewById(R.id.city_text);
        backButton = findViewById(R.id.back_button);
        extras = getIntent().getExtras();
        if (extras != null) {
            city = extras.getString("key");
        }
        cityText.setText(city);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}