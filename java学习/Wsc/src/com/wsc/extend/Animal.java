package com.wsc.extend;

public class Animal {
	final int i=3;//final 常量
	//final 修饰类，不允许被继承
	//修饰方法，不允许重写
	String name;
	int age;
	String sex;
	void eat(){
		System.out.println("I can eat food");
	}
}
