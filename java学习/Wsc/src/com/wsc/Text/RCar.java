package com.wsc.Text;

public class RCar extends Car {
	public RCar(String i,int x,int y){
		name=i;
		m=x;
		r=y;
	}
	public void shuxing(){
		System.out.println(name+""+m+"元"+""+r+"人");
	}
}
