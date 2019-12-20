package x_Homework;

import java.util.Scanner;

public class SimliTest {
	Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		
		new SimliTest().q1();
		//메서드에서 질문 출력 후 Y나 N을 입력받는다.
		
	}
	void q1(){
		System.out.println("나는 금사빠다. **금방 사랑에 빠진다");
		String ans = s.nextLine();
		if(ans.equals("Y") || ans.equals("y")){
			q2();
		}
		else if(ans.equals("N") || ans.equals("n")){
			q4();
		}
		else{
			q1();
		}
	}
	
	void q2(){
		System.out.println("연애할 때 끌려다니는 타입이다.");
		String ans = s.nextLine();
		if(ans.equals("Y") || ans.equals("y")){
			q5();
		}
		else if(ans.equals("N") || ans.equals("n")){
			q3();
		}
		else{
			q2();
		}
	}
	
	void q3(){
		System.out.println("데이트 코스는 미리 짜는게 편하다");
		String ans = s.nextLine();
		if(ans.equals("Y") || ans.equals("y")){
			q6();
		}
		else if(ans.equals("N") || ans.equals("n")){
			q5();
		}
		else{
			q3();
		}
	}
	
	void q4(){
		System.out.println("감정 기복이 크지 않다");
		String ans = s.nextLine();
		if(ans.equals("Y") || ans.equals("y")){
			q6();
		}
		else if(ans.equals("N") || ans.equals("n")){
			q4();
		}
	}
	
	void q5(){
		System.out.println("감정 표현이 솔직한 편이다");
		String ans = s.nextLine();
		if(ans.equals("Y") || ans.equals("y")){
			q8();
		}
		else if(ans.equals("N") || ans.equals("n")){
			q6();
		}
		else{
			q5();
		}
	}
	
	void q6(){
		System.out.println("활동적인 데이트가 좋다");
		String ans = s.nextLine();
		if(ans.equals("Y") || ans.equals("y")){
			q9();
		}
		else if(ans.equals("N") || ans.equals("n")){
			q8();
		}
		else{
			q6();
		}
	}
	
	void q7(){
		System.out.println("연락이 없어도 믿고 기다리는 편이다");
		String ans = s.nextLine();
		if(ans.equals("Y") || ans.equals("y")){
			answerA();
		}
		else if(ans.equals("N") || ans.equals("n")){
			q8();
		}
		else{
			q7();
		}
	}
	
	void q8(){
		System.out.println("이성 친구는 존재할 수 없다");
		String ans = s.nextLine();
		if(ans.equals("Y") || ans.equals("y")){
			q9();
		}
		else if(ans.equals("N") || ans.equals("n")){
			answerB();
		}
		else{
			q8();
		}
	}
	
	void q9(){
		System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
		String ans = s.nextLine();
		if(ans.equals("Y") || ans.equals("y")){
			answerD();
		}
		else if(ans.equals("N") || ans.equals("n")){
			answerC();
		}
		else{
			q9();
		}
	}
	
	void answerA(){
		System.out.println("A타입 : 서로에 대한 신뢰감이 깊고, 존중해주는 어른스러운 연애를 하는 타입");
	}
	
	void answerB(){
		System.out.println("B타입 : 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입");
	}
	
	void answerC(){
		System.out.println("C타입 : 이것은 의리인가 사랑인가...의리인가 친구같이 편안한 연애를 하는 타입");
	}
	
	void answerD(){
		System.out.println("D타입 : 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입");
	}
	
	
}
