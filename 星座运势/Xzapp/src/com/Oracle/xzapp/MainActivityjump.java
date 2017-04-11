package com.Oracle.xzapp;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.os.Build;

public class MainActivityjump extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main_activityjump);
		
		final Intent intent=new Intent();
		Timer timer=new Timer();
		TimerTask task=new TimerTask(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				intent.setClass(MainActivityjump.this,XzMainActivity.class);
				MainActivityjump.this.startActivity(intent);
				finish();
			}};
			timer.schedule(task, 1000*3);
	}

}
