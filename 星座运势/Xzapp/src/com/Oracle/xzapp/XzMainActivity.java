package com.Oracle.xzapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class XzMainActivity extends Activity {
Button btn;
	@Override
	//开始首界面
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_xz);
		Toast.makeText(XzMainActivity.this, 
				"是不是字体太小看不见0.0\n"+ "没事\n"+"我也看不见\n", Toast.LENGTH_LONG).show();
		Toast.makeText(XzMainActivity.this, 
				"不服来咬我啊~~", Toast.LENGTH_LONG).show();
		
			btn=(Button)findViewById(R.id.btn);
		    btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent intent=new Intent(XzMainActivity.this,MainActivitystart.class);
				startActivity(intent);
			}
		});
	}
	

}
