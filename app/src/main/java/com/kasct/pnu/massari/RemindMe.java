package com.kasct.pnu.massari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;



public class RemindMe extends AppCompatActivity {


    public Button button3;
    public void init(){
        button3= (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(RemindMe.this, ReminderNotification.class);
                startActivity(toy);

            }
        });


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.remind_me);
        init();



        Spinner mySpinner =(Spinner)findViewById(R.id.spinner1);
        ArrayAdapter<String> myAdapter;
        myAdapter = new ArrayAdapter<String>(RemindMe.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));

        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
    }


}
