package c_statement;

import java.util.Scanner;


public class ConditionalStatement {

	public static void main(String[] args) {{
		/*
		 * << if 문>>
		 * - if 		: 조건식의 결과가  true이면 블럭 안의 문장을 수행한다.
		 * - else if 	: 다수의 조건이 필요할 때 if 뒤에 추가한다.
		 * - else 		: 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다.
		 */
		
		int a = 10;
		 
		if (a < 100) {
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}
		
		if (a < 10){
			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");
		}
		
		int regNo = 1;				 	//주민번호 뒷자리의 첫자리
		String gender = null; 			//성별
		if (regNo == 1){
			gender = "남자";
		}
		else if (regNo == 2){ 			//if블럭 뒤에 else if로 조건을 추가할 수 있다.
			gender = "여자";
		}
		else if (regNo == 3){
			gender = "남자";
		}
		else if (regNo == 4){
			gender = "여자";
		}
		else {							//true인 조건식이 하나도 없을때 수행된다.
			gender = "확인불가";
		}
		System.out.println("당신의 성별은 " + gender + "입니다.");
		
		//수행할 내용이 동일한 경우 논리연산자를 사용해 조건식을 결합할 수 있다. 수행하는 문장이 한문장일 경우에만 {}를 생략 가능
		if (regNo == 1 || regNo == 3) 
			gender = "남자";
		else if (regNo == 2 && regNo == 4)
			gender = "여자";
		else
			gender = "확인불가";
		System.out.println("당신의 성별은 " + gender + "입니다.");
		
		//성적에 등급을 부여하는 프로그램을 만들어보자.
		int score = 80;
		String grade = null;
		
		if (score >= 90){
			grade = "A";
		}
		else if (80 <= score){
			grade = "B";
		}
		else if (70 <= score){
			grade = "C";
		}
		else if (60 <= score){
			grade = "D";
		}
		else{
			grade = "F";
		}
		System.out.println(score + "점에 해당하는 등급은 " + grade + "입니다.");
		
		//등급 안에서 +와 -를 나누어보자.
	    score = 67;
	    grade = null;
	    
	    if (score >= 90){
	    	grade = "A";
	    	if(97 <= score){
	    		grade += "+";
	    	}
	    	else if (score <= 93){
	    		grade += "-";
	    	}
	    }
	    else if(score >= 80){
	    	grade = "B";
	    	if(87 <= score){
	    		grade += "+";
	    	}
	    	else if (score <= 83){
	    		grade += "-";
	    	}
	    }
	    else if(score >= 70){
	    	grade = "C";
	    	if(77 <= score){
	    		grade += "+";
	    	}
	    	else if (score <= 73){
	    		grade += "-";
	    	}
	    }
	    else if(score >= 60){
	    	grade = "D";
	    	if(67 <= score){
	    		grade += "+";
	    	}
	    	else if (score <= 63){
	    		grade += "-";
	    	}
	    }
	    else {
	    	grade = "F";
	    }
	    System.out.println(score + "점에 해당하는 등급은 " + grade + "입니다.");
	    		
		
		/*
		 * <<switch문>>
		 * - 조건식과 일치하는 case문 이후의 문장을 수행한다.
		 * - 조건식의 결과는 정수와 문자열만 (JDK1.7부터 문자여 허용) 허용한다.
		 */
	    regNo = 2;
	    gender = null;
	    
	    switch(regNo){ 					//조건식의 연산결과는 정수와 문자열만 허용한다.
		    case 1 : case 3 :			//case문의 값은 리터럴과 상수만 사용할 수 있다.
		    	gender = "남자";
		    	break; 					//break를 만나면 switch문을 빠져나간다.
		    case 2 : case 4 :
		    	gender = "여자";
		    	break;
		    default :
		    	gender = "확인불가";
		 }
	    System.out.println("당신의 성별은 " + gender + "입니다.");
		
		score = 95;
		grade = null;
		switch(score / 10){
			case 10 : case 9 :
				grade = "A";
				break;
			case 8 :
				grade = "B";
				break;
			case 7 :
				grade = "C";
				break;
			case 6 : 
				grade = "D";
				break;
			default :
				grade = "F";
		}
		System.out.println(score + "점에 해당하는 등급은 " + grade + "입니다.");
		
/*		//콘솔창에서 입력받는 방법
		Scanner s = new Scanner(System.in);
		//package c_statement; 뒤에 import java.util.Scanner;을 입력해야 위치로 지정가능 Ctrl+Shift+o 로 입력 가능
		System.out.println("문자열을 입력해주세요>");
		String input1 = s.nextLine(); 		//사용자에게 입력받은 문자열을 반환한다.
		System.out.println("입력받은 문자열 : " + input1);
		
		System.out.println("숫자를 입력해주세요>");
//		s.nextInt();						//버그가 있기 떄문에 사용하지 말자!!
		int input2 = Integer.parseInt(s.nextLine());
		System.out.println("입력받은 숫자 : " + input2);
		
		//문자열을 입력받고 입력받은 문자열을 출력해주세요.
		System.out.println("문자열을 입력해주세요>");
		String input3 = s.nextLine();
		System.out.println("입력받은 문자열은 " + input3 + "입니다.");
		
		//숫자를 입력받고 입력받은 숫자를 출력해주세요.
		System.out.println("숫자를 입력해주세요 >");
		int input4 = Integer.parseInt(s.nextLine());
		System.out.println("입력받은 숫자 : " + input4);*/
		
		//숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요
/*		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요> ");
		int input =  Integer.parseInt(s.nextLine());
		if (input ==0){
			System.out.println("0입니다.");
			}
		else {
			System.out.println("0이 아닙니다.");*/
		
		//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
/*		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요>");
		int input = Integer.parseInt(s.nextLine());
		if (input % 2 == 0){
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");*/
		
		//점수 3개를 입력받아 총점, 평균 , 등급을 출력해주세요
		Scanner s = new Scanner(System.in);
		System.out.println("국어 점수를 입력해주세요>");
		int x1 = Integer.parseInt(s.nextLine());
		System.out.println("수학 점수를 입력해주세요>");
		int x2 = Integer.parseInt(s.nextLine());
		System.out.println("영어 점수를 입력해주세요>");
		int x3 = Integer.parseInt(s.nextLine());
		int tot = x1 + x2 + x3;
		float avg = tot / 3;
		grade = null;
		if (avg >= 90){
			grade = "A";
		}
		else if (avg >= 80) {
			grade = "B";
		}
		else if (avg >= 70) {
			grade = "C";
		}
		else {
			grade = "F";
		}
		System.out.println("총점은" + tot + "이고, 평균은" + avg + "이고, 등급은 " + grade + "입니다.");
		
		
		}
		
	}
}