package com.Oracle.xzapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivitystart extends Activity {
//��ʼ��ѯ����
	Button btnCx;
	EditText etXz;
	RadioGroup rg;
	RadioButton rtn1;
	RadioButton rtn2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main1);
		btnCx=(Button)findViewById(R.id.btnCx);
		etXz=(EditText)findViewById(R.id.etXz);
		rtn1=(RadioButton)findViewById(R.id.rtn1);
		rtn2=(RadioButton)findViewById(R.id.rtn2);
			
		btnCx.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			String Xz=etXz.getText().toString();
			Intent intent =new Intent(MainActivitystart.this,MainActivity.class);
			//���ý�ʦ����˾
			if(Xz.equals("��ʦ��"))
			{
				Toast.makeText(MainActivitystart.this, 
		        "��ʦ�ڿ���~", Toast.LENGTH_SHORT).show();
			}else{
			String day = "";
			//��ѡ��ť�ĵ��
			if(rtn1.isChecked()){
				day = "today";
				//�����ݷ���intent�д���ȥ
				intent.putExtra("xz", Xz);
				intent.putExtra("day",day);
				startActivity(intent);
				Toast.makeText(MainActivitystart.this, 
						"����Ƭ��Ӵ!", Toast.LENGTH_SHORT).show();
			}else if(rtn2.isChecked()){
				
				day = "tomorrow";
				//�����ݷ���intent�д���ȥ
				intent.putExtra("xz", Xz);
				intent.putExtra("day",day);
				startActivity(intent);
				Toast.makeText(MainActivitystart.this, 
						"����Ƭ��Ӵ!", Toast.LENGTH_SHORT).show();
			}else {
				Toast.makeText(MainActivitystart.this, 
						"��û��ѡ", Toast.LENGTH_SHORT).show();
			  }
		  }
	  }
  });
}	  
}

	
