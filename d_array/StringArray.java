package d_array;

import java.util.Scanner;

public class StringArray {
	public static void main(String[] args) {
		
		/*
		 * String s = new String("ABCD0"); //참조형 타입을 초기화 하는 방법 모든 참조형 타입을 초기화 할때 데이터 타입
		 * 앞에 new를 써준다. String str = "ABCD"; //문자열만 써도 초기화가 됨
		 * 
		 * char[] charArray = str.toCharArray(); System.out.println(charArray);
		 * //char배열은 특별히 배열의 내용이 출력된다.
		 * 
		 * //String 클래스 내부에 문자배열을 다루는 여러가지 메서드가 정의되어 있다.
		 * 
		 * 
		 * <<String의 주요 메서드>> - equals.() : 문자열의 내용이 같은지 확인한다. - length.() : 문자열의 길이를
		 * 반환한다. - charAt() : 문자열에서 해당 위치에 있는 문자를 반환한다. - substring(): 문자열에서 해당 범위에 있는
		 * 문자열을 반환한다. - indexOf() : 문자열 내의 특정 문자열의 인덱스를 반환한다. - replace() : 문자열 내의 특정
		 * 문자열을 원하는 문자열로 변경해 반환한다.
		 * 
		 * for (int i = 0; i < str.length(); i++){ System.out.println(str.charAt(i));
		 * //charArray[i] }
		 * 
		 * String revStr = ""; //str을 거꾸로 담을 변수 //뒤에서부터 한글자씩 가져와서 새로운 변수에 더한다. for (int
		 * i = str.length() - 1; i >= 0; i--){ revStr += str.charAt(i); }
		 * System.out.println(revStr);
		 * 
		 * str = "0123456789"; String sub1 = str.substring(3); //3번 인덱스부터 끝까지 잘라서 반환한다.
		 * 메서드 안에 들어간 수를 파라미터라 부름 System.out.println(sub1); String sub2 =
		 * str.substring(5,8); System.out.println(sub2);
		 * 
		 * str = "치킨 피자 돈까스 떡볶이"; int idx = str.indexOf("피자"); //피자의 시작 인덱스를 반환한다.
		 * System.out.println(idx);
		 * 
		 * idx = str.indexOf("햄버거"); System.out.println(idx); //해당되는 문자열이 없는 경우 -1을
		 * 반환한다.
		 * 
		 * String[] menus = { "치킨 18000원", "피자 9900원", "돈까스 8000원", "떡볶이 500원" };
		 * 
		 * for (String menu : menus){ String name = menu.substring(0,
		 * menu.indexOf(" ")); System.out.println(name); //가격만 분리시켜 int형 변수에 담아주세요. int
		 * price = Integer.parseInt( menu.substring(menu.indexOf(" ") + 1 ,
		 * menu.indexOf("원"))); System.out.println(price); }
		 * 
		 * str = "12345678910"; str = str.replace("3", "짝"); System.out.println(str);
		 * str = str.replace("6", "짝"); System.out.println(str); str = str.replace("9",
		 * "짝"); System.out.println(str);
		 * 
		 * String pn = "010-2363-3647"; //하이픈(-)을 제거해서 출력해주세요. → 01023633647 pn =
		 * pn.replace("-",""); //개수에 상관없이 전부다 바꿔줌 System.out.println(pn);
		 * 
		 * //4-9 str = "12345"; int sum = 0; for(int i= 0; i < str.length(); i++) { sum
		 * += str.charAt(i) - 48;
		 * 
		 * } System.out.println("sum="+sum);
		 * 
		 * 
		 * String value = "12o34"; char ch = ' '; boolean isNumber = true; // 반복문과
		 * charAt(int i)를 이용해서 문자열의 문자를 // 하나씩 읽어서 검사한다. for(int i=0; i < value.length()
		 * ;i++) { ch = value.charAt(i); System.out.println(ch); isNumber = 0 <= ch &&
		 * ch <= 9; } if (isNumber) { System.out.println(value + "는 숫자입니다."); } else {
		 * System.out.println(value + "는 숫자가 아닙니다."); }
		 */

	/*
	 * 숫자를 입력받아 입력받은 숫자에 3자리마다 콤마(,)를 붙여 출력해주세요 123456789 → 123,456,789 index no →
	 * 012345678910 12345 → 12,345 index no → 012345
	 */
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요 (숫자 3자리씩 끊어주기): ");
		String number = s.nextLine();
		String comStr = "";


		//3단위로 잘라서 콤마 추가.
		for (int i = 0; i <= number.length() - 1; i++) {
			comStr += number.charAt(i);
			if (number.length() % 3 == 0) {
				for (int j = 0 ; j <number.length() / 3; j++) {
					if (i == 3 * j + 2 && i < number.length()- 1 ) {
						comStr = comStr + ",";
					}
				}
			}
			else if (number.length() % 3 == 1) {
				for (int j = 0 ; j <number.length() / 3; j++) {
					if (i == 3 * j  && i < number.length()- 1 ) {
						comStr = comStr + ",";
					}
				}
			}
			else if (number.length() % 3 == 2) {
				for (int j = 0 ; j <number.length() / 3; j++) {
					if (i == 3 * j + 1 && i < number.length()- 1 ) {
						comStr = comStr + ",";
					}
				}
			}
		}
		System.out.println(comStr);
		
		
		
//		sem 답
/* 		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요 (숫자 3자리씩 끊어주기): ");
		number = sc.nextLine();
		int count = 0;
		String newNumber = "";
		for (int i = number.length() - 1 ; i >=0; i--){
			newNumber = number.charAt(i) + newNumber;
			count++;
			if( count % 3 == 0 && count != number.length()){
				newNumber = "," + newNumber;
			}
		}
		System.out.println(newNumber);*/
		
	}
}



