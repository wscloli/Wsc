package com.example.wsc.text;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main2,menu);
        //menu.add(1,100,1,"菜单一");     //动态添加菜单项
        return true;     //显示菜单
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){    //判断点击的是那一个菜单项
            case R.id.Test:
                Intent intent=new Intent(Main2Activity.this,MainActivity.class);
                 //活动跳转
                item.setIntent(intent);
               // Toast.makeText(this,"测试1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.Test2:
                Toast toast=Toast.makeText(this,"测试二",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);






    }


}
