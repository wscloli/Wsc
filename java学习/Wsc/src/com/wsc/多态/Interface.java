package com.wsc.多态;
/*接口定义了某一批类所需要遵守的规范，
只规定这些类里必须提供某些方法*/
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Running dz1=new Dazhong();//接口
		dz1.running();//接口名.方法
		Car dz2=new Dazhong();
		dz2.a();
		Running byd1=new Byd();
		byd1.running();
		//匿名内部类和接口使用
		Running dz=new Dazhong(){
			public void running(){
				System.out.println("我会飞");
			}
		};
		dz.running();
		//另一种形式   匿名内部类
		new Dazhong(){
			public void running(){
				System.out.println("我会飞 dz");
			}
		}.running();
	}

}
