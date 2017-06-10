package com.gok.selin.loginappgyk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnaActivity extends AppCompatActivity {

    TextView mesaj;
    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana);

        mesaj = (TextView) findViewById(R.id.textViewHosgeldin);

        username = getIntent().getStringExtra("usernameId");
        mesaj.setText("Hoşgeldin "+username);



    }
}
