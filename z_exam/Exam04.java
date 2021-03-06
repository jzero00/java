package z_exam;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		// TODO 4-9 , 4-12, 4-13 제외
		
//		[4-1] 다음의 문장들을 조건식으로 표현하라.
//		1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식 		(x > 10 && x < 10)
//		2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식			(ch != ' ' && ch != '/t')
//		3. char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식			(ch == 'x' || ch == 'X')
//		4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식		(ch >= '0' && ch <= '9')
//		5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식 	(ch >= 'a' && ch <='z' || ch >= 'A' && ch <= 'Z')
//		6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 
//		100으로 나눠떨어지지 않을 때 true인 조건식					(year % 400 == 0 ||( year % 4 == 0 && year % 100 != 0))
//		7. boolean형 변수 powerOn가 false일 때 true인 조건식		(powerOn == false) (!powerOn)
//		8. 문자열 참조변수 str이 “yes”일 때 true인 조건식			(str.equals("yes"))

//		[4-2] 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
/*		int sum = 0;
		for (int i = 1; i <= 20; i++){
			if (i % 2 != 0 || i % 3 !=0){
				sum += i;
			}
		}
		System.out.println(sum);*/
		
//		[4-3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
//		= 1*10+ 2*9+ 3*8+ 4*7+ ....
/*		int j = 0;
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			j = i * (11 - i);
			sum += j;
		System.out.println(sum);
		}
		System.out.println(sum);*/
		
//		[4-4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이
//		100이상이 되는지 구하시오.
		
/*		int sum = 0;
		int i = 0;
		while (true) {
			if (sum >= 100)
				break;
			++i;
			if (i % 2 == 0 ) {
				sum += i;
			}
			else {
				sum -= i;
			}
		}
		System.out.println("100 이상이 되기까지 더해야 하는 수  = " + i);
		System.out.println("총합 = " + sum);*/

//		[4-5] 다음의 for문을 while문으로 변경하시오.

/*		for(int i=0; i<=10; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/

/*		int i = 0;
		while (i <= 10) {
			int j = 0;
			while ( j <= i ) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}*/
		
		

		
			
/*		[4-6] 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프
		로그램을 작성하시오.
		for (int i = 1; i <= 6; i++){
			for (int j = 1; j <= 6; j++){
				if (i + j == 6){
					System.out.println(i + " "+ j);
				}
			}
		}*/
			
		
/*		[4-7] Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는
		코드를 완성하라. (1)에 알맞은 코드를 넣으시오.
		

		int value = (int) (Math.random() * 6) + 1; 
		//Math.random() : 0이상 1미만의 랜덤 수를 발생
		System.out.println("value:"+value);
*/
		
		
//		[4-8] 방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는
//		0<=x<=10, 0<=y<=10 이다.

/*
		for(int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				if (2 * x + 4 * y == 10) {
					System.out.println(x + " " +  y);
				}
			}
		}
*/
		
		/*
		 * [4-10] int 타입의 변수 num 이 있을 때 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
		 * 만일 변수 num의 값이 12345라면 ,‘1+2+3+4+5’의 결과인 15를 출력하라
		 * (1) 에 알맞은 코드를 넣으시오.
		주의 [ ] 문자열로 변환하지 말고 숫자로만 처리해야 한다.*/

		
/*		int num = 12345; int sum = 0;
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println("sum="+sum);*/

		
/*		[4-14] 다음은 숫자맞추기 게임을 작성한 것이다. 1과 100사이의 값을 반복적으로 입력
		해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다. 사용자가 값을 입력하면, 컴퓨터는 자
		신이 생각한 값과 비교해서 결과를 알려준다. 사용자가 컴퓨터가 생각한 숫자를 맞추면
		게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다. (1)~(2)에 알맞은 코드를 넣어 프
		로그램을 완성하시오.*/
		
/*		int answer = (int)(Math.random() * 100 ) + 1;
				//1~100 사이의 랜덤수를 발생시킨다.
				int input = 0;
				int count = 0;
				Scanner s = new Scanner(System.in);
				
				do {
					count++;
					System.out.print("1과 100사이의 값을 입력하세요 : ");
					input = s.nextInt(); // 입력받은 값을 변수 input에 저장한다.
					
					if (answer < input){
						System.out.println(input + " 보다 작습니다.");
					}else if(answer > input){
						System.out.println(input + " 보다 큽니다.");
					}else{
						System.out.println("정답입니다!!");
						break;
					}
				}
				while (true);*/
				
				
/*		int number = 12321;
		int tmp = number;
		int result =0; // 변수 number를 거꾸로 변환해서 담을 변수
		while(tmp !=0) {
			result = result * 10;
			result = result + tmp % 10;
			tmp = tmp / 10;
		}
		if(number == result)
			System.out.println( number + "는 회문수 입니다.");
		else
			System.out.println( number + "는 회문수가 아닙니다.");*/

	}
}
