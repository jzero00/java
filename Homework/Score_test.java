package Homework;

import java.util.ArrayList;

public class Score_test {

	
	public static void main(String[] args) {

		title();
		table();

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


	private static void table() {
		score_info si = new score_info();
		ArrayList<Object> students = new ArrayList<>();
		
		students.add("김지선"+ "\t" + si.getJava() + "\t" + si.getOracle() + "\t"
				+ si.getHtml() + "\t" + si.getCss() + "\t" + si.getJquery() + "\t" 
				+ si.getJsp() + "\t" + si.getSum()
				+ "\t" + si.getAvg() + "\t" + si.getRank());
		
		students.add("이누리"+ "\t" + si.getJava() + "\t" + si.getOracle() + "\t"
				+ si.getHtml() + "\t" + si.getCss() + "\t" + si.getJquery() + "\t" 
				+ si.getJsp() + "\t" + si.getSum()
				+ "\t" + si.getAvg() + "\t" + si.getRank());
		
		students.add("박종민"+ "\t" + si.getJava() + "\t" + si.getOracle() + "\t"
				+ si.getHtml() + "\t" + si.getCss() + "\t" + si.getJquery() + "\t" 
				+ si.getJsp() + "\t" + si.getSum()
				+ "\t" + si.getAvg() + "\t" + si.getRank());
		
		students.add("정대석"+ "\t" + si.getJava() + "\t" + si.getOracle() + "\t"
				+ si.getHtml() + "\t" + si.getCss() + "\t" + si.getJquery() + "\t" 
				+ si.getJsp() + "\t" + si.getSum()
				+ "\t" + si.getAvg() + "\t" + si.getRank());
		
		students.add("정재영" + "\t" + si.getJava() + "\t" + si.getOracle() + "\t"
				+ si.getHtml() + "\t" + si.getCss() + "\t" + si.getJquery() + "\t" 
				+ si.getJsp() + "\t" + si.getSum()
				+ "\t" + si.getAvg() + "\t" + si.getRank());
		
		students.add("강현철"  + "\t" + si.getJava() + "\t" + si.getOracle() + "\t"
				+ si.getHtml() + "\t" + si.getCss() + "\t" + si.getJquery() + "\t" 
				+ si.getJsp() + "\t" + si.getSum()
				+ "\t" + si.getAvg() + "\t" + si.getRank());
		
		students.add("주향한" + "\t" + si.getJava() + "\t" + si.getOracle() + "\t"
				+ si.getHtml() + "\t" + si.getCss() + "\t" + si.getJquery() + "\t" 
				+ si.getJsp() + "\t" + si.getSum()
				+ "\t" + si.getAvg() + "\t" + si.getRank());
	
		students.add("윤창훈" + "\t" + si.getJava() + "\t" + si.getOracle() + "\t"
				+ si.getHtml() + "\t" + si.getCss() + "\t" + si.getJquery() + "\t" 
				+ si.getJsp() + "\t" + si.getSum()
				+ "\t" + si.getAvg() + "\t" + si.getRank());
	
		students.add("연은주" + "\t" + si.getJava() + "\t" + si.getOracle() + "\t"
				+ si.getHtml() + "\t" + si.getCss() + "\t" + si.getJquery() + "\t" 
				+ si.getJsp() + "\t" + si.getSum()
				+ "\t" + si.getAvg() + "\t" + si.getRank());
	
		students.add("김령환" + "\t" + si.getJava() + "\t" + si.getOracle() + "\t"
				+ si.getHtml() + "\t" + si.getCss() + "\t" + si.getJquery() + "\t" 
				+ si.getJsp() + "\t" + si.getSum()
				+ "\t" + si.getAvg() + "\t" + si.getRank());
	
		students.add("구한나" + "\t" + si.getJava() + "\t" + si.getOracle() + "\t"
				+ si.getHtml() + "\t" + si.getCss() + "\t" + si.getJquery() + "\t" 
				+ si.getJsp() + "\t" + si.getSum()
				+ "\t" + si.getAvg() + "\t" + si.getRank());
	
		students.add("백종빈" + "\t" + si.getJava() + "\t" + si.getOracle() + "\t"
				+ si.getHtml() + "\t" + si.getCss() + "\t" + si.getJquery() + "\t" 
				+ si.getJsp() + "\t" + si.getSum()
				+ "\t" + si.getAvg() + "\t" + si.getRank());
	
		students.add("이병훈" + "\t" + si.getJava() + "\t" + si.getOracle() + "\t"
				+ si.getHtml() + "\t" + si.getCss() + "\t" + si.getJquery() + "\t" 
				+ si.getJsp() + "\t" + si.getSum()
				+ "\t" + si.getAvg() + "\t" + si.getRank());
	
		students.add("강현지" + "\t" + si.getJava() + "\t" + si.getOracle() + "\t"
				+ si.getHtml() + "\t" + si.getCss() + "\t" + si.getJquery() + "\t" 
				+ si.getJsp() + "\t" + si.getSum()
				+ "\t" + si.getAvg() + "\t" + si.getRank());
	
		students.add("김경운" + "\t" + si.getJava() + "\t" + si.getOracle() + "\t"
				+ si.getHtml() + "\t" + si.getCss() + "\t" + si.getJquery() + "\t" 
				+ si.getJsp() + "\t" + si.getSum()
				+ "\t" + si.getAvg() + "\t" + si.getRank());
	
		students.add("이지형" + "\t" + si.getJava() + "\t" + si.getOracle() + "\t"
				+ si.getHtml() + "\t" + si.getCss() + "\t" + si.getJquery() + "\t" 
				+ si.getJsp() + "\t" + si.getSum()
				+ "\t" + si.getAvg() + "\t" + si.getRank());
	
		students.add("이지형" + "\t" + si.getJava() + "\t" + si.getOracle() + "\t"
				+ si.getHtml() + "\t" + si.getCss() + "\t" + si.getJquery() + "\t" 
				+ si.getJsp() + "\t" + si.getSum()
				+ "\t" + si.getAvg() + "\t" + si.getRank());
	
		students.add("이예림" + "\t" + si.getJava() + "\t" + si.getOracle() + "\t"
				+ si.getHtml() + "\t" + si.getCss() + "\t" + si.getJquery() + "\t" 
				+ si.getJsp() + "\t" + si.getSum()
				+ "\t" + si.getAvg() + "\t" + si.getRank());
	
		students.add("이승재" + "\t" + si.getJava() + "\t" + si.getOracle() + "\t"
				+ si.getHtml() + "\t" + si.getCss() + "\t" + si.getJquery() + "\t" 
				+ si.getJsp() + "\t" + si.getSum()
				+ "\t" + si.getAvg() + "\t" + si.getRank());
	
		students.add("민태홍" + "\t" + si.getJava() + "\t" + si.getOracle() + "\t"
				+ si.getHtml() + "\t" + si.getCss() + "\t" + si.getJquery() + "\t" 
				+ si.getJsp() + "\t" + si.getSum()
				+ "\t" + si.getAvg() + "\t" + si.getRank());
	
		students.add("정보람" + "\t" + si.getJava() + "\t" + si.getOracle() + "\t"
				+ si.getHtml() + "\t" + si.getCss() + "\t" + si.getJquery() + "\t" 
				+ si.getJsp() + "\t" + si.getSum()
				+ "\t" + si.getAvg() + "\t" + si.getRank());
	
		students.add("박진영" + "\t" + si.getJava() + "\t" + si.getOracle() + "\t"
				+ si.getHtml() + "\t" + si.getCss() + "\t" + si.getJquery() + "\t" 
				+ si.getJsp() + "\t" + si.getSum()
				+ "\t" + si.getAvg() + "\t" + si.getRank());
		
		ArrayList<Object> score = new ArrayList<>();
		
		for(int i = 0 ; i < students.size() ; i++){
			System.out.print(students.get(i) + "\t");
//			System.out.print(score_info.getJava() + "\t");
//			System.out.print(score_info.getOracle() + "\t");
//			System.out.print(score_info.si.getHtml() + "\t");
//			System.out.print(score_info.si.getCss() + "\t");
//			System.out.print(score_info.si.getJquery() + "\t"); 
//			System.out.print(score_info.si.getJsp() + "\t"); 
//			System.out.print(score_info.si.getSum() + "\t"); 
//			System.out.print(score_info.getAvg() + "\t");
//			Collections.sort(score_info.getAvg());
//			System.out.print(score_info.si.getRank() + "\t");
			System.out.println();
		}
		
	}



}
