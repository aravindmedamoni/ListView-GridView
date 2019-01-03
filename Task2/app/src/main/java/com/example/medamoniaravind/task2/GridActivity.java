package com.example.medamoniaravind.task2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class GridActivity extends AppCompatActivity {
    GridView grdvw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        grdvw=findViewById(R.id.gv);
        String[] array={"anji","aravnd","anu","anil","mahi"};
        ArrayAdapter aa=new ArrayAdapter(GridActivity.this,android.R.layout.simple_list_item_1,array);
        grdvw.setAdapter(aa);
        grdvw.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Toast.makeText(GridActivity.this, "clicked on anji", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(GridActivity.this, "clciked on aravnd", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(GridActivity.this, "clicked on anu", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(GridActivity.this, "clicked on anil", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(GridActivity.this, "clciked on mahi", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}
