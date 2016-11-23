package com.example.huang.cookhelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String cateName;
    private String typeName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner category = (Spinner) findViewById(R.id.category);
        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> categoryAdapter = ArrayAdapter.createFromResource(this, R.array.category_arrays, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        categoryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        category.setAdapter(categoryAdapter);
        Spinner foodtype = (Spinner) findViewById(R.id.type);
        ArrayAdapter<CharSequence> foodAdapter = ArrayAdapter.createFromResource(this, R.array.type_arrays, android.R.layout.simple_spinner_item);
        foodtype.setAdapter(foodAdapter);
        foodtype.setOnItemSelectedListener(new TypeSelectedListener() );
        category.setOnItemClickListener((AdapterView.OnItemClickListener) new CategorySelectedListener());

    }
    class TypeSelectedListener implements AdapterView.OnItemSelectedListener {
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            typeName=(String) parent.getItemAtPosition(position).toString();
        }
        public void onNothingSelected(AdapterView<?> arg0) {
        }
    }
    class CategorySelectedListener implements AdapterView.OnItemSelectedListener {
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            cateName=(String) parent.getItemAtPosition(position).toString();
        }
        public void onNothingSelected(AdapterView<?> arg0) {
        }
    }
    public void backToMain(View view){
        Intent back=new Intent(this,Main3Activity.class);
        startActivity(back);
    }
    public void viewPage(View view){
        Intent viewPage=new Intent(this,Main4Activity.class);
        startActivity(viewPage);
    }
}
