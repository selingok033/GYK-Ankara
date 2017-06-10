package com.gok.selin.loginappgyk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText isim;
    EditText sifre;
    Button giris;
    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        isim = (EditText) findViewById(R.id.editTextName);
        sifre = (EditText) findViewById(R.id.editTextPass);
        giris = (Button) findViewById(R.id.buttonGiris);

        giris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = isim.getText().toString();
                //tıklayınca ne olacak
                Intent niyet = new Intent(getApplicationContext(),AnaActivity.class);
                niyet.putExtra("usernameId",username);
                startActivity(niyet);
            }
        });







    }
}
