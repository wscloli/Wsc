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
	//��ʼ�׽���
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_xz);
		Toast.makeText(XzMainActivity.this, 
				"�ǲ�������̫С������0.0\n"+ "û��\n"+"��Ҳ������\n", Toast.LENGTH_LONG).show();
		Toast.makeText(XzMainActivity.this, 
				"������ҧ�Ұ�~~", Toast.LENGTH_LONG).show();
		
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
