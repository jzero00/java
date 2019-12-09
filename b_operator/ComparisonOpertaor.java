package b_operator;

public class ComparisonOpertaor {

	public static void main(String[] args) {
		/*
		 * <<비교연산자>>
		 * - < 	: 작다
		 * - > 	: 크다
		 * - <= : 작거나 같다
		 * - >= : 크거나 같다
		 * - == : 같다
		 * - != : 같지 않다 
		 */
		boolean b = 10 < 20;	//비교연산자의 연산결과는 boolean이다.
		/*System.out.println(b);
		b = 10 < 20 - 15;
		System.out.println(b);	//산술연산 후 비교연산을 수행한다.
		
		b = 10 <= 10.0;
		System.out.println(b);
		b = 65 >= 'B';
		System.out.println(b);
		
		b = 10.0f == 10.0;
		System.out.println(b);
		b = 10.1f == 10.1;
		System.out.println(b);
		System.out.printf("%21.20f%n", 10.1f);
		System.out.printf("%21.20f%n", 10.1);
		//prntf는 format을 정해주는 것 앞의 숫자가 총 자리수.소수점 자리수 표현 
		
		//float과 double은 정밀도가 달라 float을 double로 형변환하면 소수점을 정확하게 비교할 수 없다.
		//double을 float으로 형변환해야 정확하게 비교할 수 있다.
		b = 10.1f == (float)10.1;
		System.out.println(b);
		
		//대소비교는 boolean을 제외한 기본형 타입만 비교할 수 있지만
		//등가비교는 모든 타입을 비교할 수 있다.
		b = 'A' == 65;
		System.out.println(b);
		b = true != false;
		System.out.println(b);*/
		
		b = "abc" == "abc";				//abc가 들어가있는 주소를 비교한다.
		System.out.println(b);
		b = "abc" == new String("abc");	//new는 새로운 주소를 생성한다.
		System.out.println(b);
		//new string을 사용하면 기존과는 다른 주소에 문자열을 저장하기 때문에 false
		//참조형 타입은 저장된 메모리 주소를 비교하기 때문에 String은 등가비교 내용을 비교할 수 없다.
		
		b = "abc".equals(new String("abc"));
		//equals를 사용하면 String의 내용을 비교할 수 있다.
		System.out.println(b);
		b = !"abc".equals("ABC");
		//같지 않다의 결과를 얻기 위해서는 ! (NOT)을 앞에 붙여준다.
		
		//다음의 문장들을 코드로 작성후 연산결과를 출력해주세요
		//1보다 2가 큰가?
		boolean c = 1 < 2;
		System.out.println(c);
		
		//0은 100보다 작거나 같은가?
		c = 0 <= 100;
		System.out.println(c);
		
		//3.14f와 3.14는 다른가?
		c = 3.14f != 3.14;
		System.out.println(c);
		
		c = !"남자".equals(new String("여자"));
		System.out.println(c);
	
	
		
	}

}
