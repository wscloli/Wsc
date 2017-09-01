package com.example.wsc.text;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //log t+Tab键
    private static final String TAG = "MainActivity";

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"ADD",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"REMOVE",Toast.LENGTH_SHORT).show();
                break;
            case R.id.intent_item:
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                // item.setIntent(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//加载一个布局
        //调试信息  Log.d()   日志
        Log.d("MainActivity","onCreate execute");

        Log.w(TAG, "onCreate: " );
        /*
        *Toast*/
        Button button1=(Button)findViewById(R.id.button);  //获取布局文件定义元素
        button1.setOnClickListener(new View.OnClickListener(){//注册一个监听器
            public void onClick(View v){//执行监听器中的onclick方法
                Toast.makeText(MainActivity.this,"www",Toast.LENGTH_SHORT).show();
            }

        });

        Button button4=(Button)findViewById(R.id.button4);



        Button button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(MainActivity.this,"销毁活动",Toast.LENGTH_SHORT).show();
                //销毁活动~
               // finish();
            }
        });



        Button button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //显式tent
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

    }
}
