/*package com.example.medamoniaravind.task2;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHander extends SQLiteOpenHelper {
    public static final String dbname="aravnd";
    public static final String tablename="usersdata";
    public static final String columnid="id";
    public static final String columnname="Name";
    public static final String columnmblnum="Number";
    public static final String columnpassword="password";
    public static final String columnemail="Email";
    public static final int databaseversion=5;
    public DbHander(Context context) {

        super(context, dbname, null, databaseversion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table userdata(id integer primary key autoincrement,Name text,Number text,password text,Email text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onCreate(db);

    }

    public boolean userinserdata(PojoClass pojoClass){
        SQLiteDatabase sqLiteDatabase=getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(columnname,pojoClass.getName());
        contentValues.put(columnmblnum,pojoClass.getMblnum());
        contentValues.put(columnpassword,pojoClass.getPasswd());
        contentValues.put(columnemail,pojoClass.getEmail());
        sqLiteDatabase.insert(tablename,null,contentValues);
        sqLiteDatabase.close();
        return true;

    }
}*/
