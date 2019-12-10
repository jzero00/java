package sem_e_oop;

import java.util.Scanner;

public class SimLiTest {

	public static void main(String[] args) {
		new SimLiTest().question1();
	}
	
	String[] questions = {
			"나는 금사빠다.(Y/N)",
			"연애할 때 끌려다니는 타입이다.(Y/N)",
			"데이트 코스는 미리 짜는게 편하다.(Y/N)",
			"감정기복이 크지 않다.(Y/N)",
			"감정 표현에 솔직한 편이다.(Y/N)",
			"활동적인 데이트가 좋다.(Y/N)",
			"연락이 없어도 믿고 기다리는 편이다.(Y/N)",
			"이성친구는 존재할 수 없다.(Y/N)",
			"아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.(Y/N)"
	};
	
	String[] results = {
		"TypeA : 서로에 대한 신뢰감이 깊고, 존중해주는 어른스러운 연애를 하는 타입!",
		"TypeB : 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!",
		"TypeC : 이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!",
		"TypeD : 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!"
	};
	
	Scanner s = new Scanner(System.in);
	
	void question1(){
		System.out.println(questions[0]);
		String answer = s.nextLine();
		if(answer.equals("Y")){
			question2();
		}else if(answer.equals("N")){
			question4();
		}
	}
	
	void question2(){
		System.out.println(questions[1]);
		String answer = s.nextLine();
		if(answer.equals("Y")){
			question5();
		}else if(answer.equals("N")){
			question3();
		}
	}
	
	void question3(){
		System.out.println(questions[2]);
		String answer = s.nextLine();
		if(answer.equals("Y")){
			question6();
		}else if(answer.equals("N")){
			question5();
		}
	}
	
	void question4(){
		System.out.println(questions[3]);
		String answer = s.nextLine();
		if(answer.equals("Y")){
			question7();
		}else if(answer.equals("N")){
			question5();
		}
	}
	
	void question5(){
		System.out.println(questions[4]);
		String answer = s.nextLine();
		if(answer.equals("Y")){
			question8();
		}else if(answer.equals("N")){
			question6();
		}
	}
	
	void question6(){
		System.out.println(questions[5]);
		String answer = s.nextLine();
		if(answer.equals("Y")){
			question8();
		}else if(answer.equals("N")){
			question9();
		}
	}
	
	void question7(){
		System.out.println(questions[6]);
		String answer = s.nextLine();
		if(answer.equals("Y")){
			System.out.println(results[0]);
		}else if(answer.equals("N")){
			question8();
		}
	}
	
	void question8(){
		System.out.println(questions[7]);
		String answer = s.nextLine();
		if(answer.equals("Y")){
			question9();
		}else if(answer.equals("N")){
			System.out.println(results[1]);
		}
	}
	
	void question9(){
		System.out.println(questions[8]);
		String answer = s.nextLine();
		if(answer.equals("Y")){
			System.out.println(results[3]);
		}else if(answer.equals("N")){
			System.out.println(results[2]);
		}
	}

}




