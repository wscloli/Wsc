package com.wsc.extend;

public class Dog extends Animal{
	public Dog(){
		//对于父类构造方法的引用
		super();
		System.out.println("wangwang");
		
	}
	void eat(){
		System.out.println("I can eat cat");
		System.out.println(i);
	}
}
