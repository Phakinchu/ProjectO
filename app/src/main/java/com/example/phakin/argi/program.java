package com.example.phakin.argi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class program extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program);
    }
    public void To_programinput(View v){
        Intent x=new Intent(getApplicationContext(),programinput.class) ;
        startActivity(x);
    }
}
