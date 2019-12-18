package Homework;

import java.util.ArrayList;
import java.util.Collections;

public class Score_usingMethod {

	public static void main(String[] args) {

		title();
		score_info si = new score_info();

		ArrayList<Object> students = new ArrayList<>();
		students.add("김지선");
		students.add("이누리");
		students.add("박종민");
		students.add("정대석");
		students.add("정재영");
		students.add("강현철");
		students.add("주향한");
		students.add("윤창훈");
		students.add("연은주");
		students.add("김령환");
		students.add("구한나");
		students.add("백종빈");
		students.add("이병훈");
		students.add("강현지");
		students.add("김경운");
		students.add("이지형");
		students.add("이지형");
		students.add("이예림");
		students.add("이승재");
		students.add("민태홍");
		students.add("정보람");
		students.add("박진영");

		for(int i = 0 ; i < students.size(); i++){

			si.getJava();
			si.getOracle();
			si.getHtml();
			si.getCss();
			si.getJquery();
			si.getJsp();
			si.getSum();
			si.getAvg();
			si.getRank();
		}
		
		for(int i = 0 ; i < students.size() ; i++){
			System.out.print(students.get(i) + "\t");
			System.out.print(score_info.getJava() + "\t");
			System.out.print(score_info.getOracle() + "\t");
			System.out.print(score_info.getHtml() + "\t");
			System.out.print(score_info.getCss() + "\t");
			System.out.print(score_info.getJquery() + "\t"); 
			System.out.print(score_info.getJsp() + "\t"); 
			System.out.print(score_info.getSum() + "\t"); 
			System.out.print(score_info.getAvg() + "\t");
			Collections.sort(score_info.getAvg());
//			System.out.print(score_info.getRank() + "\t");
			System.out.println();
		}




	}



	static void title() {
		ArrayList<Object> title = new ArrayList<>();
		title.add("이름");
		title.add("Java");
		title.add("Oracle");
		title.add("HTML");
		title.add("CSS");
		title.add("JQuery");
		title.add("JSP");
		title.add("총점");
		title.add("평균");
		title.add("석차");
		for (int i = 0 ; i < title.size(); i++){
			System.out.print(title.get(i) + "\t");	

		}
		System.out.println();
	}

}

