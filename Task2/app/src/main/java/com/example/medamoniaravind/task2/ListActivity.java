package com.example.medamoniaravind.task2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {
    ListView lstvw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        lstvw=findViewById(R.id.lv);
        String[] array={"anji","aravnd","anu","anil","mahi"};
        ArrayAdapter aa=new ArrayAdapter(ListActivity.this,android.R.layout.simple_list_item_1,array);
        lstvw.setAdapter(aa);
        lstvw.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Toast.makeText(ListActivity.this, "clicked on anji", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(ListActivity.this, "clciked on aravnd", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(ListActivity.this, "clicked on anu", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(ListActivity.this, "clicked on anil", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(ListActivity.this, "clciked on mahi", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });


    }
}
