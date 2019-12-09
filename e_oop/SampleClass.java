package e_oop;				//현재 클래스의 위치를 알려준다.

import java.util.Scanner;	//다른 패키지에 있는 클래스의 위치를 알려준다.
import java.util.*;			//java.util.*는 java.util의 모든 클래스를 사용하겠다고 선언하는 것

public class SampleClass {

	int field = 10; //전역변수: 클래스 전체 영역에서 공유하는 변수
	
	/*
	 *  - 메서드 : 코드를 분리해서 더 효율적인 프로그램을 만들기 위한 도구 - 데이터를 주고받기 위한 도구가 리턴타입과 파라미터
	 *  - 리턴타입 메서드명(파라미터){	}
	 *  - 리턴타입 (반환타입) : 실행 후 돌려줘야 하는 결과물
	 *  - 파라미터 (매개변수) : 실행에 필요한 정보
	 */
	
	void method1(){											//void는 리턴타입이 없단 얘기
		System.out.println("파라미터도 리턴타입도 없는 메서드");
	}
	
	void method2(int parameter){							//파라미터는 메서드 안에서 지역변수로만 사용됨
		System.out.println(parameter + "를 사용해 명령을 수행하는 메서드");
	}
	
	String method3(){
		return "명령 수행후 결과물을 돌려주는 메서드";
		//return : 메서드를 종료시키고 결과물을 돌려준다.
		//리턴타입이 없는 메서드에서는 메서드를 종료시킨다.
	}
	
	int method4(int a, int b){
//		Scanner sc = new Scanner(System.in);
//		a = Integer.parseInt(sc.nextLine());
//		b = Integer.parseInt(sc.nextLine());
		System.out.println(a + ", " + b
				+ "를 사용해 명령을 수행하고 결과물을 돌려주는 메서드");
		return a + b;
	}
	
	void test1(){
		System.out.println("test1 시작");		//1
		test3();						//같은 클래스의 메서드를 호출하는 방법
		System.out.println("test1 종료");		//6
	}
	
	void test2(){
		System.out.println("test2 시작");		//3
		System.out.println("test2 종료");		//4
	}
	void test3(){
		System.out.println("test3 시작");		//2
		test2();
		System.out.println("test3 종료");		//5
	}
}
