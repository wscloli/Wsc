package com.wsc.Text;

public class RWCar extends Car {
	public RWCar(String i,int x,int y,int z){
		name=i;
		m=x;
		r=y;
		w=z;
	}
	public void shuxing(){
		System.out.println(name+""+m+"元"+""+r+"人"+""+w+"吨");
	}
}
