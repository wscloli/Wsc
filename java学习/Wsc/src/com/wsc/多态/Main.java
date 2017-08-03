package com.wsc.多态;

public class Main extends Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog1=new Dog();//父类可以引用子类对象
		//Dog dog2=new Animal();//不可以
		//dog1.watchdoor();//不能引用子类特有方法
		Dog dog2=new Dog();
		Animal cat1=new Cat();
		dog2.eat();
		cat1.eat();
		Dog dog3=new Dog();
		Animal animal=dog3;//类型转换 向上类型转换   自动的，安全的
		//instanceof 返回一个布尔值表示一个对象是否属于一个类
		if(animal instanceof Dog){
			Dog dog4=(Dog)animal;
		}else{
			System.out.println("无法编译 Dog");
		}
		if(animal instanceof Cat){
			Cat cat2=(Cat)animal;
		}else{
			System.out.println("无法编译 Cat");
		}
		
		
	}

}
