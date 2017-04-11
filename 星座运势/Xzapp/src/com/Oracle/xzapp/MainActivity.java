package com.Oracle.xzapp;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.thinkland.sdk.android.DataCallBack;
import com.thinkland.sdk.android.JuheData;
import com.thinkland.sdk.android.Parameters;

public class MainActivity extends Activity {
	//定义变量
TextView tv;
ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //声明控件
        tv=(TextView)findViewById(R.id.tv);
        iv=(ImageView)findViewById(R.id.iv);
        //获取从intent中传递过来的数据。
        Intent intent = getIntent();
        String Xz = intent.getStringExtra("xz");
        String day = intent.getStringExtra("day");
        requestJHData(Xz,day);
        }
    public void requestJHData(String consName,String type){
    	Parameters params=new Parameters(); 
    	params.add("consName", consName);
    	params.add("type", type);
    	//请求聚合数据
    	JuheData.executeWithAPI(
    		  MainActivity.this,//上下文对象 
    		  58,//数据id
    		  "http://web.juhe.cn:8080/constellation/getAll",//接口地址
    		  JuheData.GET,//请求方法(bug)
    		  params,
   new DataCallBack() {
  
	public void onSuccess(int arg0, String arg1) {
		// TODO Auto-generated method stub
		Log.i(">>>>>>>>>>>", arg1);
		//解析logCat
		try {
			//获得json
			JSONObject json=new JSONObject(arg1);
			String summary=json.getString("summary");
			String name = json.getString("name");
			String datetime = json.getString("datetime");
			String all=json.getString("all");
			String color=json.getString("color");
			String health=json.getString("health");
			String love=json.getString("love");
			String money=json.getString("money");
			String number=json.getString("number");
			String QFriend=json.getString("QFriend");
			String work = json.getString("work");
			String resultcode = json.getString("resultcode");

		 tv.setText(
		"星座名称："
		 + name+
		 "\n日期："
		 +datetime+
		 "\n综合指数："
		 +all+
		 "\n幸运色："
		 +color+
		 "\n爱情指数："+
		 love+
		 "\n健康指数："+
		 health+
		 "\n财运指数："+
		 money+
		 "\n幸运数字："+
		 number+
		 "\n速配星座："+
		 QFriend+
		 "\n综合评价："+
		 summary+
		 "\n工作指数："
		  +work		 
				 );
		 
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	

    	
    	  public void onFinish() {
    	      
    	  	Toast.makeText(MainActivity.this, "查询成功！！~~并祝老师教师节快乐~~老师万岁~~",Toast.LENGTH_LONG).show();
    	  	}
    	  public void onFailure(int arg0,String arg1, Throwable arg2) {
    			// TODO Auto-generated method stub
    		Toast.makeText(MainActivity.this, arg0+arg1, Toast.LENGTH_LONG).show();
    			}
    		});

    }	  
   }


