package com.wsc.extend;

public class Animal {
	final int i=3;//final 常量
	//final 修饰类，不允许被继承
	//修饰方法，不允许重写
	public Animal(){
		System.out.println("I am a Animal");
	}
	String name;
	int age;
	String sex;
	void eat(){
		System.out.println("I can eat food");
	}
	//重写了toString
	public String toString() {//toString 方法   返回地址值  属性值
	return "Animal [i=" + i + ", name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
}
