package com.wsc.多态;
import java.math.*;
public class Circle extends Shape {
	double r;
	public Circle(double j) {
		// TODO Auto-generated constructor stub
		r=j;
	}

	@Override
	int c() {
		// TODO Auto-generated method stub
		int c=(int)(2*Math.PI*r);
		return c;
	}

	@Override
	int s() {
		// TODO Auto-generated method stub
		int s=(int)(Math.PI*r*r);
		return s;
	}

}
