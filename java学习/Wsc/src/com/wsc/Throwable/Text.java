package com.wsc.Throwable;

public class Text {
	//异常测试
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Text text=new Text();
		int result=text.Text1();
		System.out.println("执行结束了，结果为："+result);
		//text.Text1();
	}
	public int Text1(){
	int a=12;
	int c = 3;
	int result = 0;
	try{
		while(c>-1){
			c--;
			result=result+a/c;
		}
	}catch(Exception e){
		System.out.println("输出异常了，返回值为"+result);
		return -1;
	}finally {
		System.out.println("结果为"+result);
		return -1;
	}

}
}
