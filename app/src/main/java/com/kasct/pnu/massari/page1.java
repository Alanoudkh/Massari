package com.kasct.pnu.massari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
    }

    public void button_LogIn (View v){
                Intent toy = new Intent(page1.this, login2.class);
                startActivity(toy);
            }

    public void button_SignIn (View v){
        Intent toy = new Intent(page1.this, registration.class);
        startActivity(toy);
    }

    }