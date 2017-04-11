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
	//�������
TextView tv;
ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //�����ؼ�
        tv=(TextView)findViewById(R.id.tv);
        iv=(ImageView)findViewById(R.id.iv);
        //��ȡ��intent�д��ݹ��������ݡ�
        Intent intent = getIntent();
        String Xz = intent.getStringExtra("xz");
        String day = intent.getStringExtra("day");
        requestJHData(Xz,day);
        }
    public void requestJHData(String consName,String type){
    	Parameters params=new Parameters(); 
    	params.add("consName", consName);
    	params.add("type", type);
    	//����ۺ�����
    	JuheData.executeWithAPI(
    		  MainActivity.this,//�����Ķ��� 
    		  58,//����id
    		  "http://web.juhe.cn:8080/constellation/getAll",//�ӿڵ�ַ
    		  JuheData.GET,//���󷽷�(bug)
    		  params,
   new DataCallBack() {
  
	public void onSuccess(int arg0, String arg1) {
		// TODO Auto-generated method stub
		Log.i(">>>>>>>>>>>", arg1);
		//����logCat
		try {
			//���json
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
		"�������ƣ�"
		 + name+
		 "\n���ڣ�"
		 +datetime+
		 "\n�ۺ�ָ����"
		 +all+
		 "\n����ɫ��"
		 +color+
		 "\n����ָ����"+
		 love+
		 "\n����ָ����"+
		 health+
		 "\n����ָ����"+
		 money+
		 "\n�������֣�"+
		 number+
		 "\n����������"+
		 QFriend+
		 "\n�ۺ����ۣ�"+
		 summary+
		 "\n����ָ����"
		  +work		 
				 );
		 
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	

    	
    	  public void onFinish() {
    	      
    	  	Toast.makeText(MainActivity.this, "��ѯ�ɹ�����~~��ף��ʦ��ʦ�ڿ���~~��ʦ����~~",Toast.LENGTH_LONG).show();
    	  	}
    	  public void onFailure(int arg0,String arg1, Throwable arg2) {
    			// TODO Auto-generated method stub
    		Toast.makeText(MainActivity.this, arg0+arg1, Toast.LENGTH_LONG).show();
    			}
    		});

    }	  
   }


