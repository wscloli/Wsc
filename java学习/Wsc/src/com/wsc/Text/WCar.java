package com.wsc.Text;

public class WCar extends Car {
	
	public WCar(String i,int x,int y){
		name=i;
		m=x;
		w=y;
	}
	public void shuxing(){
		System.out.println(name+'\t'+m+"元"+'\t'+w+"吨");
	}
}
