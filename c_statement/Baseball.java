package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		//숫자야구게임을 만들어 주세요.

		int ans1 = 0;			// 정답 100의 자리수
		int ans2 = 0;			// 정답 10의 자리수
		int ans3 = 0;			// 정답 1의 자리수
//		int ans = 0;			// 정답
		int input = 0;			// 내가 쓴 답
		int a = 0;				// 100의 자리수
		int b = 0;				// 10의 자리수
		int c = 0;				// 1의 자리수
		int ball = 0;
		int strk = 0;
		int out  = 0;
		//		1~9까지 겹치치 않는 숫자를 만든다.
		do{
			ans1 = (int)(Math.random() * 9 + 1);
			ans2 = (int)(Math.random() * 9 + 1);
			ans3 = (int)(Math.random() * 9 + 1);
		}
		while(((ans1 == ans2) || (ans2 == ans3) || (ans3 == ans1)));
		int ans = ans1 * 100 + ans2 * 10 + ans3;
//		System.out.println(ans);
//		대답

//		사용자 입력을 맞출때 까지 입력 (반복문)
		do {
			do {
				ball = 0;
				strk = 0;
				out  = 0;
				System.out.println("숫자를 입력해주세요> ");
				Scanner s = new Scanner(System.in);
				input =  Integer.parseInt(s.nextLine());


				a = input / 100;			//123의 경우 1
				b = (input / 10) % 10;		//123의 경우 2
				c = input % 10;				//123의 경우 3
			}while(((ans1 == ans2) || (ans2 == ans3) || (ans3 == ans1)));

//			첫번째 숫자 비교
			if (a == ans1) 		strk++;
			else if (a == ans2)	ball++;
			else if(a == ans3)	ball++;
			else 				out++;
//			2번째 숫자 비교
			if (b == ans1)		ball++;
			else if (b == ans2)	strk++;
			else if(b == ans3)	ball++;
			else 				out++;
			
//			3번쨰 숫자 비교
			if (c == ans1)		ball++;
			else if (c == ans2)	ball++;
			else if(c == ans3)	strk++;
			else 				out++;
		
			System.out.println(input + " → " + ball + " ball " + strk + "strike " + out + "out 입니다.");
		}
		while (strk != 3);

		System.out.println("정답입니다.");
	}
}











