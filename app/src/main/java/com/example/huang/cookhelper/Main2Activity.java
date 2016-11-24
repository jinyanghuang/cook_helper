package com.example.huang.cookhelper;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private String selected;



    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
            String selected = parent.getItemAtPosition(pos).toString();
        }

    public void onNothingSelected(AdapterView parent) {
        // Do nothing.
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void addClick(View view) {
        try {
            EditText eTextname = (EditText) findViewById(R.id.editText5);
            EditText eTextprep = (EditText) findViewById(R.id.editText6);
            EditText eTextcook = (EditText) findViewById(R.id.cooktime);
            EditText eTextcal = (EditText) findViewById(R.id.editText8);
            EditText eTextstep = (EditText) findViewById(R.id.editText2);
            Spinner category = (Spinner) findViewById(R.id.category);
            Spinner type = (Spinner) findViewById(R.id.type);

            ArrayList<Ingredient> inglist = new ArrayList<Ingredient>();
            // Ingredient 1

            Spinner ingname1 = (Spinner) findViewById(R.id.spinner11);
            Spinner ingenum1 = (Spinner) findViewById(R.id.spinner12);
            EditText ingquan1 = (EditText) findViewById(R.id.editText11);
            if (ingname1.getSelectedItem().toString() != "Choose ingredient") {
                inglist.add(new Ingredient(ingname1.getSelectedItem().toString(), Float.parseFloat(ingquan1.getText().toString()), ingenum1.getSelectedItem().toString()));
            }
            // Ingredient 2
            Spinner ingname2 = (Spinner) findViewById(R.id.spinner21);
            Spinner ingenum2 = (Spinner) findViewById(R.id.spinner22);
            EditText ingquan2 = (EditText) findViewById(R.id.editText21);
            if (ingname1.getSelectedItem().toString() != "Choose ingredient") {
                inglist.add(new Ingredient(ingname2.getSelectedItem().toString(), Float.parseFloat(ingquan2.getText().toString()), ingenum2.getSelectedItem().toString()));
            }
            //Ingredient 3
            Spinner ingname3 = (Spinner) findViewById(R.id.spinner31);
            Spinner ingenum3 = (Spinner) findViewById(R.id.spinner32);
            EditText ingquan3 = (EditText) findViewById(R.id.editText31);
            if (ingname1.getSelectedItem().toString() != "Choose ingredient") {
                inglist.add(new Ingredient(ingname3.getSelectedItem().toString(), Float.parseFloat(ingquan3.getText().toString()), ingenum3.getSelectedItem().toString()));
            }
            // Ingredient 4
            Spinner ingname4 = (Spinner) findViewById(R.id.spinner41);
            Spinner ingenum4 = (Spinner) findViewById(R.id.spinner42);
            EditText ingquan4 = (EditText) findViewById(R.id.editText41);
            if (ingname1.getSelectedItem().toString() != "Choose ingredient") {
                inglist.add(new Ingredient(ingname1.getSelectedItem().toString(), Float.parseFloat(ingquan4.getText().toString()), ingenum4.getSelectedItem().toString()));
            }

            Recipe addrecipe = new Recipe((eTextname.getText().toString()), "main class", type.getSelectedItem().toString(), category.getSelectedItem().toString(), inglist, (eTextcook.getText().toString()), (eTextprep.getText().toString()), (eTextcal.getText().toString()), (eTextstep.getText().toString()));
            addrecipe.writeRecipe();
            // System.out.println(addrecipe);
        }
            catch ( Exception e){
            System.out.print("what");
        }
        }
    //method to execute arithmetic oper
}

