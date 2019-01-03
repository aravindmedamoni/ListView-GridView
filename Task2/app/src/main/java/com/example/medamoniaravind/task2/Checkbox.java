package com.example.medamoniaravind.task2;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import static com.example.medamoniaravind.task2.R.*;


public class Checkbox extends AppCompatActivity {

    CheckBox ckbx_tel,ckbx_eng,ckbx_hindi;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_checkbox);
        ckbx_eng = (CheckBox) findViewById(R.id.ch_eng);
        ckbx_tel=(CheckBox)findViewById(id.ch_telugu);
        ckbx_hindi=(CheckBox)findViewById(id.ch_hindi);
        ckbx_tel.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(Checkbox.this, "checkbox is already checked", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(Checkbox.this, "Now check the checkbox", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
