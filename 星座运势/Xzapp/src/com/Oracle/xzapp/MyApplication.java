package com.Oracle.xzapp;

import com.thinkland.sdk.android.JuheSDKInitializer;

import android.app.Application;

public class MyApplication extends Application {
//³õÊ¼»¯¾ÛºÏSDK
	public void onCreate(){
	super.onCreate();	
	
	JuheSDKInitializer.initialize( getApplicationContext());	
	}
}
