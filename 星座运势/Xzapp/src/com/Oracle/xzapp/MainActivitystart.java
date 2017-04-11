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
//开始查询界面
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
			//设置教师节土司
			if(Xz.equals("教师节"))
			{
				Toast.makeText(MainActivitystart.this, 
		        "教师节快乐~", Toast.LENGTH_SHORT).show();
			}else{
			String day = "";
			//单选按钮的点击
			if(rtn1.isChecked()){
				day = "today";
				//将数据放入intent中带过去
				intent.putExtra("xz", Xz);
				intent.putExtra("day",day);
				startActivity(intent);
				Toast.makeText(MainActivitystart.this, 
						"静待片刻哟!", Toast.LENGTH_SHORT).show();
			}else if(rtn2.isChecked()){
				
				day = "tomorrow";
				//将数据放入intent中带过去
				intent.putExtra("xz", Xz);
				intent.putExtra("day",day);
				startActivity(intent);
				Toast.makeText(MainActivitystart.this, 
						"静待片刻哟!", Toast.LENGTH_SHORT).show();
			}else {
				Toast.makeText(MainActivitystart.this, 
						"你没有选", Toast.LENGTH_SHORT).show();
			  }
		  }
	  }
  });
}	  
}

	
