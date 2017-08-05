package com.wsc.多态;

public class Abstract {
	//抽象类 限制子类的方法 设置一个范围
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape a1=new Rectangle(2,3);
		System.out.println(a1.c());
		System.out.println(a1.s());
		Shape b1=new Circle(3);
		System.out.println(b1.c());
		System.out.println(b1.s());
	}

}
