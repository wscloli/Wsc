package com.wsc.Text;

import java.util.Scanner;
// 测试     答答租车系统  解1
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RCar AD=new RCar("奥迪A4",500,4);
		RCar MD=new RCar("马自达6",400,4);
		RWCar PK=new RWCar("皮卡雪6",450,4,2);
		RCar JL=new RCar("金龙",800,20);
		WCar SJ=new WCar("松花江",400,4);
		WCar YK=new WCar("依维柯",1000,20);
		System.out.println("欢迎使用答答租车系统：");
		System.out.println("您是否要租车：1是 0否");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		if(a==0){
			System.out.println("退出");
		}
		else{
			System.out.println("...");
			System.out.println("租车数量：");
			int b=input.nextInt();//b  租车数量
			String rs=""; // 载人车的名字
			int r=0;  //载人数量
			
			String ws=""; // 载物车的名字
			int w=0; // 载物重量
			int m=0; // 车的价格
			
			for(int i=1;i<=b;i++){
				System.out.println("第"+i+"辆车是：");
			int c=input.nextInt(); //c  车序号
			switch(c){
			//通过选的车序号，依次叠加下去
			case 1: 
				rs=rs+""+AD.name;
				r=r+AD.r;
				m=m+AD.m;
				break;
			case 2:
				rs=rs+""+MD.name;
				r=r+MD.r;
				m=m+MD.m;
				break;
			case 3:
				rs=rs+""+PK.name;
				r=r+PK.r;
				ws=ws+""+PK.name;
				w=w+PK.w;
				m=m+PK.m;
				break;
			case 4:
				rs=rs+""+JL.name;
				r=r+JL.r;
				m=m+JL.m;
				break;
			case 5:
				ws=ws+""+SJ.name;
				w=w+SJ.w;
				m=m+SJ.m;
				break;
			case 6:
				ws=ws+""+YK.name;
				w=w+YK.w;
				m=m+YK.m;
				break;
				}
			}
			System.out.println("租用天数：");
			int d=input.nextInt();
			m=m*d;
			System.out.println("车账单：");
			System.out.println("载人车有："+rs+""+"载人："+r+"人");
			System.out.println("载物车有："+ws+""+"载物："+w+"吨");
			System.out.println("总金额："+m);
			}
		}
	}


