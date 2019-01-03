package com.example.medamoniaravind.task2;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    SharedPreferences shrprprnc;
    SharedPreferences.Editor editor;
    EditText rgname;
    EditText rgmail;
    EditText rgmblnum;
    EditText rgpswd;
   // DbHander dbHander;
  //  PojoClass pojoClass;
    String rgstrname12,rgstrmbnum,rgstrpswd,rgstrmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        rgname=findViewById(R.id.rname);
        rgmail=findViewById(R.id.remail);
        rgmblnum=findViewById(R.id.rmbnum);
        rgpswd=findViewById(R.id.rpswd) ;
        shrprprnc=getSharedPreferences("aravnd",MODE_PRIVATE);
      // dbHander=new DbHander(RegisterActivity.this);
    }

 /*  public void clickregister(View view){
       rgstrname12= rgname.getText().toString();
       rgstrmail=rgmail.getText().toString();
       rgstrmbnum=rgmblnum.getText().toString();
      rgstrpswd=rgpswd.getText().toString();
      boolean b=dbHander.userinserdata(new PojoClass(rgstrname12,rgstrmbnum,rgstrpswd,rgstrmail));
      if(b){
          Toast.makeText(RegisterActivity.this, "data is stored successfully", Toast.LENGTH_SHORT).show();
      }else{
          Toast.makeText(RegisterActivity.this, "plz entered valid detailes", Toast.LENGTH_SHORT).show();
      }

    } */

 public void clickregister(View view){
     rgstrname12= rgname.getText().toString();
     rgstrmail=rgmail.getText().toString();
     rgstrmbnum=rgmblnum.getText().toString();
     rgstrpswd=rgpswd.getText().toString();
     editor=shrprprnc.edit();
     editor.putString("username",rgstrname12);
     editor.putString("usremail",rgstrmail);
     editor.putString("usrmobilenumber",rgstrmbnum);
     editor.putString("usrpassword",rgstrpswd);
     editor.putBoolean("isreigister",true);
     editor.commit();
     Toast.makeText(RegisterActivity.this, "you registered", Toast.LENGTH_SHORT).show();
     finish();

 }
}
