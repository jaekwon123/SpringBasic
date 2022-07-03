package kr.co.pll.main;

import kr.co.pll.beans.HelloWorld;
import kr.co.pll.beans.HelloWorldEn;
import kr.co.pll.beans.HelloWorldKo;

public class MainClass {
	public static void main(String[] args) {
		
		HelloWorld hello1=new HelloWorldEn();
		
		HelloWorld hello2=new HelloWorldKo();

		callMehtod(hello1);
		callMehtod(hello2);
		
	}
	
	public static void callMehtod(HelloWorld bean) {
		bean.sayHello();
	}
}
