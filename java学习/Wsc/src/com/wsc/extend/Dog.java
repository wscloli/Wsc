package com.wsc.extend;

public class Dog extends Animal{
	public Dog(){
		//调用了父类构造方法
		super();
		System.out.println("wangwang");
		
	}
	void eat(){
		System.out.println("I can eat cat");
		System.out.println(i);
	}
}
