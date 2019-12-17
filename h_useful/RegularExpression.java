package h_useful;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {

		/*
		 * 정규 표현식 : 문자열의 패턴을 검사하는 표현식
		 * ^		뒷문자로 시작
		 * $		앞문자로 종료
		 * .		임의의 문자(줄바꿈 제외)
		 * *		앞 문자가 0개 이상
		 * +		앞 문자가 1개 이상
		 * ?		앞 문자가 없거나 1개
		 * []		문자의 집합이나 범위 ([a-z] : a부터 z까지, [^a-z] : a부터 z가 아닌것)
		 * ()		그룹화 (1개의 문자처럼 인식)
		 * |		OR 연산
		 * \s		공백, 탭, 줄바꿈
		 * \S		공백, 탭, 줄바꿈이 아닌 문자
		 * \w 		알파벳이나 숫자
		 * \W		알파벳이나 숫자가 아닌 문자
		 * \d		숫자
		 * \D		숫자가 아닌 문자
		 * (?i)		뒷 문자의 대소문자 구분 안함
		 * \		정규표현식에서 사용되는 특수문자 표현
		 * 
		 */
		
		String id = 	"qwe123456";
		String email = 	"qwe123456@naver.com";
		String pn = 	"01012345678";
//		String regex = "[a-z]{3}[0-9]{1,3}";
//		String regex = "[a-z0-9]+";
//		String regex = "\\w*";
//		String regex = ".*";		//패턴을 찾을때 범위를 좁게 설정한다.
		
//		Pattern p = Pattern.compile(regex);
//		Matcher m = p.matcher(str);
//		System.out.println(m.matches());
		
		//아이디, 전화번호, 이메일 주소의 유효성을 검사하는 정규표현식을 만들어 주세요.
		
		String idcheck = 	"[a-z0-9_-]{5,20}";
		String emailcheck = "[a-z0-9_-]{5,20}@[a-zA-z]+\\.(?i)(com|net|org([a-z]{2}\\.kr))$";
		String pncheck = 	"[0-9]{11}";
		
		Pattern p_id = Pattern.compile(idcheck);
		Matcher m = p_id.matcher(id);
		System.out.println(m.matches());
		
		Pattern p_pw = Pattern.compile(emailcheck);
		m = p_pw.matcher(email);
		System.out.println(m.matches());
		
		Pattern p_pn = Pattern.compile(pncheck);
		m = p_pn.matcher(pn);
		System.out.println(m.matches());
		
		
	}

}
