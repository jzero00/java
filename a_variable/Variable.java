package a_variable;

public class Variable {
	
	public static void main(String[] args) {
		/*
		 * <변수>
		 * 하나의 데이터를 저장할 수 있는 메모리 상의 공간
		 * 
		 * <사용 가능한 기본형 데이터와 종류>
		 * - 정수 : byte, short, int, long
		 * - 실수 : float, double 
		 * - 문자 : char
		 * - 논리 : boolean
		 * 
		 * - byte는 8개의 bit로 이루어져 있다.
		 * - 데이터를 사용하기 위해서는 어떤 종류의 데이처를 사용할 것인지,
		 * 	  그것의 이름이 무엇인지 알려줘야 한다. 서로 구분하기 위해 붙여준다. 
		 * - 명명규칙은 자바의 정석 25~26쪽 참조
		 */
		
//		변수 선언 방법 : 데이터 타입  + 변수 이름
		byte abc;
		char moonja;
		
		//모든 기본형 타입을 사용해서 8개의 변수를 선언해주세요.
		byte a;
		short b;
		int c;
		long d;
		float e;
		double f;
		char g;
		boolean h;
		
		//선언한 이후 변수를 사용할  떄는 변수의 이름으로 사용한다.
//		System.out.println(a); //컴파일 에러 발생 (문법이 틀렸다)
		//변수에 값을 저장하지 않으면 변수의 값을 찹조할 수 없다.
		
		//=(대입 연산자) : 대입 연산자 오른쪽의 값을 왼쪽 (변수)에 저장한다.
		a = 127; // 타입에 맞는 값을 저장해야 한다.
		b = 30000;
		c = 20;
		d = 900L; // long 접미사 : L
		e = 3.14f; // float 접미사 : f
		f = 3.14; //double 접미사 : d (생략가능)
		g = '가';
		h = true; 
		//초기화 : 변수에 처음으로 값을 저장하는 것.
		
		System.out.println(c);
		//Ctrl + F11 : 프로그램 실행
		//F11 : 디버그 모드로 실행
		
		c = 30;
		System.out.println(c);
		c = 30 + 40;
		System.out.println(c);
		c = b;
		System.out.println(c);
		
		//위에서 초기화한 변수에 새로운 값을 저장하고 출력해주세요.
		a = 62;
		b = 20000;
		c = 10;
		d = 600L;
		e = 6.02f;
		f = 6.02;
		g = '나';
		h = false;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		//String : 여러개의 문자를 편리하게 사용하기 위한 클래스
		//문자열 : ""(큰따옴표)로 감싸진 글자
		String _String = new String("abcd");
		System.out.println(_String);
		_String = "1234";
		System.out.println(_String);
		
		/*
		 * <<리터럴의 종류>>
		 * 숫자 : 0, 10, -5, 3.14
		 * 문자 : '가', 'a', '0', ' '
		 * 문자열 : "가나다", "abc", "123", " ", "" 
		 * 그 외: true, false, null(값이 없다)
		 * 
		 * <<참조형 타입>>
		 * - 기본형 타입을 제외한 모든 데이터 타입 (배열, 클래스)
		 * - ex) String, ABC, Variable
		 * - 값이 변수에 저장되지 않고 따로 저장되며, 그 주소가 변수에 저장된다.
		 * - 변수의 크기는 4byte 이다.
		 */
		//기본값 : 전역변수에 아무것도 저장하지 않았을때 저장되어 있는 값 method 밖에 선언되어 있는 변수를 전역변수라고 말함
		
		final int MAX_NUMBER;
		MAX_NUMBER = 10;
//		MAX_NUMBER = 100; //컴파일 에러 발생
		
		/* 형변환 할때, byte수가 더 큰방향으로는 형변환 할 필요가 없다
		 * ex) int -> long 의 경우는 형변환이 필요 없다.
		 * 하지만 long -> int로 가는 경우에는 형변환이 필요하다.
		 */
		
	}
	
}
