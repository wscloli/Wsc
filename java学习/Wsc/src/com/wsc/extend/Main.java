package com.wsc.extend;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog wangcai=new Dog();
		wangcai.name="wangcai";
		System.out.println(wangcai.name);
		wangcai.eat();
		//System.out.println(wangcai);//Dog类在内存中的地址
		System.out.println(wangcai.toString());
		
	}

}
