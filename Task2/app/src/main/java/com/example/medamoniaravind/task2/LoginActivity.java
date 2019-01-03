package com.example.medamoniaravind.task2;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences1;
    EditText etlgnemail;
    EditText etlgnpswd;
    String lgnactemail,lgnactpswd;
    String mainemail,mainpswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etlgnemail=findViewById(R.id.lgnmail);
        etlgnpswd=findViewById(R.id.lgnpassword);
        sharedPreferences1=getSharedPreferences("aravnd",MODE_PRIVATE);
        mainemail=sharedPreferences1.getString("usremail",null);
        mainpswd= sharedPreferences1.getString("usrpassword",null);
    }

    public void clicklgnbtn(View view){
       lgnactemail= etlgnemail.getText().toString();
       lgnactpswd=etlgnpswd.getText().toString();
       if (mainemail.equals(lgnactemail) && mainpswd.equals(lgnactpswd)){

           final AlertDialog.Builder alertDialog=new AlertDialog.Builder(LoginActivity.this);
           alertDialog.setTitle("Alert msg");
           alertDialog.setMessage("are you want to login");
           alertDialog.setCancelable(true);
           alertDialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
               @Override
               public void onClick(DialogInterface dialog, int which) {
                   etlgnemail.setText("");
                   etlgnpswd.setText("");
                   startActivity(new Intent(LoginActivity.this,Checkbox.class));
                   Toast.makeText(LoginActivity.this, "successfully you are loging", Toast.LENGTH_SHORT).show();
                  /* Toast.makeText(LoginActivity.this, "ok selected you", Toast.LENGTH_SHORT).show();*/
               }
           });
           alertDialog.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
               @Override
               public void onClick(DialogInterface dialog, int which) {
                   Toast.makeText(LoginActivity.this, "cancel clicked you", Toast.LENGTH_SHORT).show();

               }
           });

           alertDialog.show();

       }else{
           Toast.makeText(LoginActivity.this, "please enter valid details", Toast.LENGTH_SHORT).show();
       }
    }
}
