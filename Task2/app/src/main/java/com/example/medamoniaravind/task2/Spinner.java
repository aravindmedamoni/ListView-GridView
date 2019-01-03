package com.example.medamoniaravind.task2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class Spinner extends AppCompatActivity {

    android.widget.Spinner sp_spnr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        sp_spnr=findViewById(R.id.spinner);
        String[] array2={"male","fimale","others"};
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,array2);
        sp_spnr.setAdapter(arrayAdapter);
        sp_spnr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Toast.makeText(Spinner.this, "male selected", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(Spinner.this, "fimale selected", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(Spinner.this, "others selected", Toast.LENGTH_SHORT).show();
                        break;
                   /* case 3:
                        Toast.makeText(Spinner.this, "anil selected", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(Spinner.this, "mahi selected", Toast.LENGTH_SHORT).show();
                        break;*/
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
