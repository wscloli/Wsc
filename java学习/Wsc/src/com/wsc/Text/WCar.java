package com.wsc.Text;

public class WCar extends Car {
	
	public WCar(String i,int x,int y){
		name=i;
		m=x;
		w=y;
	}
	public void shuxing(){
		System.out.println(name+""+m+"元"+""+w+"吨");
	}
}
