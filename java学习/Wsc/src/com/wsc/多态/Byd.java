package com.wsc.多态;

public class Byd extends Car implements Running {
	
	@Override
	public void running() {
		// TODO Auto-generated method stub
		System.out.println("我会跑");
	}

}
