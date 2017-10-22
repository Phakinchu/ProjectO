package com.example.phakin.argi;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void To_program(View v){
        Intent x=new Intent(getApplicationContext(),program.class) ;
        startActivity(x);
    }
    public void To_marketprice(View v){
        Intent y=new Intent(getApplicationContext(),marketprice.class) ;
        startActivity(y);
    }
}
