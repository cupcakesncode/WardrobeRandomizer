package com.example.tanya.wardroberandomizer;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tanya on 11/6/16.
 */

public class AddClothesActivity extends ActionBarActivity implements OnItemSelectedListener{
    String item;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_clothes);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);

        List<String> categories = new ArrayList<String>();
        categories.add("Tops");
        categories.add("Shorts/Skirts");
        categories.add("Pants");
        categories.add("Dresses/Rompers");
        categories.add("Shoes");
        categories.add("Accessories");
        categories.add("Coats/Jackets");
        categories.add("Sweatshirts");
        ArrayAdapter<String> dataAdapter =  new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

    }
    public void onItemSelected(AdapterView<?> parent, View view, int position, long blah){
        item = parent.getItemAtPosition(position).toString();
    }
    public void onNothingSelected(AdapterView<?> arg0){}
}
