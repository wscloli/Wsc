package com.example.wsc.text;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ContextMenuActivity extends AppCompatActivity {
    private String[] data={"文件一","文件二","文件三","文件四","文件五","文件六"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu);
        //showListView();
   /* }
    private void showListView(){*/

        ArrayAdapter<String>adapter=new ArrayAdapter(ContextMenuActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_View);
        listView.setAdapter(adapter);
    }
   /* private ArrayList<String>getData(){
    ArrayList<String>list=new ArrayList<String>();
        for (int i=0;i<5;i++) {
            list.add("文件" + (i+1));
        }
        return list;
        }*/
    }


