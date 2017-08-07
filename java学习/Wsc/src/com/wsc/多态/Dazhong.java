package com.wsc.多态;
//接口可以和继承一起，  可以同时继承一个父类并实现多个接口
public class Dazhong extends Car implements Running {
	void a(){
		System.out.println("aaaaa");
	}
	@Override
	public void running() {
		// TODO Auto-generated method stub
		System.out.println("我会跑");
	}

}
