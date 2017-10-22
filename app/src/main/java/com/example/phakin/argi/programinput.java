package com.example.phakin.argi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class programinput extends AppCompatActivity {

    private Spinner Treeselect ;
    private ArrayList<String> Treelist = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programinput);
        /*Treeselect = (Spinner)findViewById(R.id.treespinner) ;
        createtreeselect();
        ArrayAdapter<String> adapterTreelist = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, Treelist);
        Treeselect.setAdapter(adapterTreelist);*/
    }
    /*private void createtreeselect() {
        Treelist.add("kuy1") ;
        Treelist.add("kuy2") ;
        Treelist.add("kuy3") ;
        Treelist.add("kuy4") ;
        Treelist.add("kuy5") ;
        Treelist.add("kuy6") ;
        Treelist.add("kuy7") ;
    }*/

}
