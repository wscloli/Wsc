package com.wsc.Text;

import java.util.Scanner;

public class Main2 {
//  测试 答答租车系统  解2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] car={new RCar("奥迪A4",500,4),new RCar("马自达6",400,4),new RWCar("皮卡雪6",450,4,2),new RCar("金龙",800,20),new WCar("松花江",400,4),new WCar("依维柯",1000,20)};
		System.out.println("欢迎来到答答租车系统：");
		System.out.println("是否租车：  1是 0否");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		if(a==0){
			System.out.println("退出系统");
			
		}else{
			System.out.println("租车类型表：");
			System.out.println("序号  汽车名称   租 金        容 量");
			
		}
	}

}
