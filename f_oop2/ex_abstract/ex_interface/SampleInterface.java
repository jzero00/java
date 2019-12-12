package f_oop2.ex_abstract.ex_interface;

public interface SampleInterface {

	/*
	 *  <<인터페이스 >>
	 *  - 상수와 추상메서드만 멤버로 가질 수 있는 데이터 구조이다.
	 *  - interface 인터페이스명{	}
	 *  - 모든 멤버변수의 제어자는 public static final 이며, 생략할 수 있다.
	 *  - 모든 메서드의 제어자는 public abstract 이며, 생략할 수 있다.
	 */

	public static final int NUM1 = 1;
	
	int NUM2 = 2;
	//자동으로 public static final가 적용된다.
	
	public abstract void method1();
	
	void method2();
	
	//JDK 1.8부터 메서드와 디폴트 메서드를 사용할 수 있게 되었다.
	
}

class SampleImplement implements SampleInterface, SampleInterface2{
//class SampleImplement implements 에 여러개의 interface를 상속 받으려면 ,후에 interface 이름을 입력
//인터페이스는 메서드에 내용이 없기 때문에 메서드 명이 중복되어도 구분할 필요가 없다.
//여러개의 메서드를 상속받을 수 있다. (다중 상속이 가능하다.)
//
	@Override
	public void method1() {
		System.out.println(NUM1);
		
	}

	@Override
	public void method2() {
		System.out.println(SampleImplement.NUM2);
		
	}

	@Override
	public void method3() {
		
		
	}
	
}

interface SampleInterface2{
	void method1();
	void method3();
}






























