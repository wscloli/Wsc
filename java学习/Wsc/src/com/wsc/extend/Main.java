package com.wsc.extend;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1=new Dog();
		dog1.name="wangcai";
		System.out.println(dog1.name);
		dog1.eat();
		//System.out.println(dog1); ַ
		//dog 在类中的地址
		System.out.println(dog1.toString());
		Dog dog2=new Dog();
		if(dog1.equals(dog2)){
			System.out.println("是一样的哟");
		}else{
			System.out.println("不一样");
		}
		
	}

}
