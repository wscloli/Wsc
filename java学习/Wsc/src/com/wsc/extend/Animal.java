package com.wsc.extend;

public class Animal {
	final int i=3;//final 常量
	//final 
	public Animal(){
		System.out.println("I am a Animal");
	}//构造方法
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + i;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		return result;
	}
	//重写equals  
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (age != other.age)
			return false;
		if (i != other.i)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}
	String name;
	int age;
	String sex;
	void eat(){
		System.out.println("I can eat food");
	}
	//��д��toString
	public String toString() {//toString ����   ���ص�ֵַ  ����ֵ
	return "Animal [i=" + i + ", name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
}
