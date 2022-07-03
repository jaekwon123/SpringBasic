package kr.co.pll.main;

import kr.co.pll.beans.HelloWorldEn;
import kr.co.pll.beans.HelloWorldKo;

public class MainClass {
	public static void main(String[] args) {
		
		HelloWorldEn hello1=new HelloWorldEn();
		callMethod(hello1);
		
		HelloWorldEn hello2=new HelloWorldEn();
		callMethod(hello2);
		
		HelloWorldKo hello3=new HelloWorldKo();
		callMethod(hello3);
		
		System.out.println("깃허브 커밋테스트");
		
		
	}
	
	public static void callMethod(HelloWorldEn hello) {
		hello.sayHello();
	}
	public static void callMethod(HelloWorldKo hello) {
		hello.sayHello();
	}
	
}
