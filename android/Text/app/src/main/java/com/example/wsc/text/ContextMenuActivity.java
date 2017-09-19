package com.example.wsc.text;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ContextMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu);
    private void showListView(){
        ListView listView=(ListView)findViewById(R.id.listView);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,getData() );
    }
    private ArrayList<String>getData(){
    ArrayList<String>list=new ArrayList<String>();
        for (int i=0;i<5;i++) {
            list.add("文件" + (i + 1));
        }
        return list;
        }
    }
    }
}
