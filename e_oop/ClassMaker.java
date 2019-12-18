package e_oop;

public class ClassMaker {

	// 전역 변수 하나를 선언 및 초기화 해주세요

	int a = 0;

	// 리턴타입과 파라미터가 없는 메서드 하나를 만들어 주세요
	// 메서드 안에서 전역변수를 출력해주세요.
	void method1() {
		System.out.println(a);
	}

	// 전역변수와 동일한 타입의 리턴타입이 있고 파라미터가 없는 메서드 하나를 만들어 주세요.
	int method2() {
		return a;
	}

	// 리턴타입은 없고 파라미터가 하나 있는 메서드를 만들어주세요.
	// 메서드 안에서 파라미터를 출력해주세요
	void method3(String name) {
		System.out.println(name);
	}

	// int타입의 리턴 타입과 int 타입의 파라미터가 두개가 있는 메서드를 만들어 주세요.
	// 메서드 안에서 두 파라미터를 곱한 결과를 리턴해주세요.
	int multiple(int x, int y) {
		return x * y;
	}
	
	int multiple(int x, int y, int z) {
		return x * y * z;
	}
}
