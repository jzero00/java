package a_variable;

//주석 : 프로그램 코드로 인식하지 않는 문장 (주로 코드를 설명하는 데 사용한다.)
//한줄 주석 : 단축키 : Ctrl + Shift + c
/* 범위 주석 : 단축키  Ctrl + Shift + / (해제 : \)*/ 
// package는 폴더 이름 이 클래스가 어떤 폴더에 위치해 있는 지 알려줌. public 접근 제어자 class 이름이 나옴
// 클래스(class) : 데이터와 처리내용의 집합
// 사용 하고 싶은 클래스, 데이터, 처리내용 들이 있는 경우 선언을 통해 의사표현을 해야한다.
// 선언 : 사용하고자 하는 것의 종류와 이름을 컴퓨터에게 알려주는 것.
// main method 를 선언한 것

public class ABC {
	//{} : 블럭(내용의 범위)
	
	//변수 : 데이터
int variable;  //;(세미콜론) : 문장의 마침표


    //메서드(method) : 기능 (처리) 
    // main method : 프로그램의 시작과 끝.
	public static void main(String[] args) {
		// 블럭이 시작되면 Tab(탭) 1칸으로 계층을 표현 (계층을 쉽게 구분하기 위해)
		//코드는 기본적을 위에서 아래로 왼쪽에서 오른쪽으로 실행된다.
		//실행할 문장을 method 안에 넣는다.
		System.out.println("Hello"); //괄호안에 있는 내용을 콘솔창에 출력하는 method
		System.out.print("Hello"); //줄바꿈을 하지 않는다.
		System.out.print("Hello"); 
		//코딩 : 코드를 작성하는 것
		//main method의 마지막 문장까지 수행되면 프로그램은 종료된다.
		
		//예약어(키워드) : 자바에서 사용하는 특별한 의미와 기능을 가진 단어
		
	}

}
