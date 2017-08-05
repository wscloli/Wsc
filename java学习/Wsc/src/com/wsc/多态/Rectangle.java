package com.wsc.多态;

public class Rectangle extends Shape {
	int a;
	int b;
	//构造方法传入数值
	public Rectangle(int i,int j) {
		// TODO Auto-generated constructor stub
		a=i;
		b=j;
	}

	@Override
	int c() {
		// TODO Auto-generated method stub
		int c=(a+b)*2;
		return c;
	}

	@Override
	int s() {
		// TODO Auto-generated method stub
		int s=a*b;
		return s;
	}

}
