package b_operator;

public class Etc {

	public static void main(String[] args) {
		/*
		 * << 비트 연산자 >>
		 * - | (OR) 	: 피연산자 중 한쪽이라도 값이 1이면, 1을 그 외는 0을 결과로 얻는다
		 * - & (AND)	: 피연산자 양 쪽이 모두 1이어야만 1을 그외는 0을 결과로 얻는다.
		 * - ^ (XOR)	: 피연산자의 값이 서로 다를 때만 1을 같을 때는 0을 결과로 얻는다.
		 * - ~ (비트전환)	: 피연산자의 0은 1로 1은 0으로 바꾼다.
		 * - <<(쉬프트)	: 피연산자의각 자리를 왼쪽으로 이동시킨다. 빈칸은 0으로 채운다.
		 * - >>(쉬프트)	: 피연산자의각 자리를 오른쪽으로 이동시킨다. 빈칸은 앞자리와 동일한 값으로 채운다.		이런게 있구나 하고 넘어가기(비트연산자 전부)
		 * 
		 * <<기타연산자>>
		 * .(참조연산자)	: 특정 범위 내에 속해있는 멤버를 지칭할 때 사용한다. ??? .equals
		 * (type)		: 형변환(casting)
		 * ?:(삼항연산자)	: 조건식 ? 조건식이 참일 경우 수행할 문장 : 조건식이 거짓을 경우 수행할 문장
		 * instanceof	: 참조형타입 확인
		 */
		
		//1바이트는 8비트로 이루어져 있고 1비트는 0 또는 1을 표현할 수 있다.
		//즉, 1바이트는 8개의 0과 1을 표현할 수 있다.
		/*
		 * - 10진수 → 2진수 : 10진수 값을 몫이 1이 될때까지 2로 나눈다.
		 * 10
		 * 5	0
		 * 2	1
		 * 1	0
		 * → 1010
		 * 
		 * 15를 2진수로 만들어주세요.
		 * 15
		 * 7	1
		 * 3	1
		 * 1	1
		 * → 1111
		 * 
		 * - 2진수 → 10진수 : 각 자리에 1, 2, 4, 8, 16, 32...를 곱한 값을 더한다.
		 * 1 0 1 0
		 * 8 4 2 1
		 * 8+0+2+0 = 10
		 * 
		 * 1111을 10진수로 만들어주세요
		 * 1 1 1 1
		 * 8+4+2+1 = 15
 		 */
		
		//00001010 : 10
		//00001111 : 15
		
		//| : 00001111
		System.out.println(10 | 15);
		//& : 00001010
		System.out.println(10 & 15);
		//^ : 00000101
		System.out.println(10 ^ 15);
		//~ : 11110101
		System.out.println(~10);			/*맨 앞자리는 양수 음수를 나타내는데 1이면 음수 0이면 양수*/
		//<<00010100
		System.out.println(10 << 1);
		//>>00000101
		System.out.println(10 >> 1);
		
		int x = 10;
		int y = 20;
		int result = x < y ? x : y;
		System.out.println(result);
		//true : int result = x;
		//false : int result = y;
		
		//시험점수가 60점 이상이면 합격 미만이면 불합격
		int score = 50;
		String res = 60 <= score ? "합격" : "불합격";
		System.out.println(score + "점은" + res + "입니다.");
		
		//주민등록번호 뒷자리 첫번째 숫자가 1이면 남자 2면 여자
		int regNO = 3; //주민등록번호 첫자리
		String gender = regNO == 1 ? "남자" : "여자";
		System.out.println("당신의 성별은 " + gender + "입니다.");
		
		gender = regNO == 1 ? "남자" : (regNO == 2 ? "여자" : "확인불가");
		System.out.println("당신의 성별은 " + gender + "입니다.");
		
		//두개의 변수에 저장된 수 중에 큰 숫자를 출력해주세요
		int a1 = 12;
		int a2 = 21;
		int result2 = a1 < a2 ? a2 : a1;
		System.out.println(result2);
		
		//변수에 저장된 수의 절대값을 출력해주세요
		int a = -12;
		int z = a >=0 ? a : -a;
		System.out.println(z);
		
		//변수에 저장된 주민번호 뒷자리의 첫번째 숫자가 1이나 3이면 남자를
		//2나 4면 여자를 출력해주세요.
		//그외의 숫자는 확인불가를 출력해주세요
		int regNo = 5;
//		String gender_ = regNo == 1 ? "남자" : (regNo == 2 ? "여자" : (regNo == 3 ? "남자" : (regNo == 4 ? "여자" : "확인불가")));
		String gender_ = regNo == 1 || regNo == 3 ? "남자" 
					  : (regNo == 2 || regNo == 4 ? "여자" : "확인불가");
		System.out.println("당신의 성별은 " + gender_ + "입니다.");
	}

}
