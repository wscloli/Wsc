package com.example.wsc.text;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //logt+Tab键
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //调试信息  Log.d()
        Log.d("MainActivity","onCreate execute");

        Log.w(TAG, "onCreate: " );
        Button button1=(Button)findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(MainActivity.this,"you jump,I click",Toast.LENGTH_LONG).show();

            }
        });

    }
}
