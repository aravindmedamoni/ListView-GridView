package com.example.medamoniaravind.task2;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    ImageView img11,img12,img13;
    TextView textView1,textView2,textView3;
   // EditText emailet,paswdet;
    boolean aBoolean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img11=findViewById(R.id.image12);
        img12=findViewById(R.id.image13);
        img13=findViewById(R.id.mn_image14);
        textView1=findViewById(R.id.tv11);
        textView2=findViewById(R.id.tv12);
        textView3=findViewById(R.id.tv33);
      //  emailet=findViewById(R.id.mlpsswd);
      //  paswdet=findViewById(R.id.lgnmail);
        sharedPreferences=getSharedPreferences("aravnd",MODE_PRIVATE);
      aBoolean= sharedPreferences.getBoolean("isreigister",false);

      //  textView3=findViewById(R.id.tv13);
    }

    public void clicklinear1(View view){
        Intent intent=new Intent(MainActivity.this,ListActivity.class);
        startActivity(intent);
    }

    public void clicklinear2(View view){
        Intent intent1=new Intent(MainActivity.this,GridActivity.class);
        startActivity(intent1);
    }

    public void clickbtn(View view){
       /*mactemail= emailet.getText().toString();
       mactpswd=paswdet.getText().toString();*/
        if (aBoolean){


            Intent intent2=new Intent(MainActivity.this,LoginActivity.class);
            startActivity(intent2);

        }else {
            Intent intent2=new Intent(MainActivity.this,RegisterActivity.class);
            startActivity(intent2);


        }


    }

    @Override
    protected void onResume() {
        super.onResume();
        aBoolean= sharedPreferences.getBoolean("isreigister",false);
    }

    public void clickspinner(View view) {
        startActivity(new Intent(this,Spinner.class));
        Toast.makeText(this, "SpinnerActivity selected", Toast.LENGTH_SHORT).show();
    }
}
