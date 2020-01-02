package x_score.score;

import java.util.ArrayList;

public class rank_test {
	
	public static void main(String[] args) {
		
		title();
		rank();
		
	}


	private static void rank() {
		
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
		
		ArrayList<Integer> java = new ArrayList<>();
		for(int i = 0 ; i < students.size(); i++) {
			java.add((int)(Math.random() * 50 + 50));
		}
		
		ArrayList<Integer> oracle = new ArrayList<>();
		for(int i = 0 ; i < students.size(); i++) {
			oracle.add((int)(Math.random() * 50 + 50));
		}
		
		ArrayList<Integer> html = new ArrayList<>();
		for(int i = 0 ; i < students.size(); i++) {
			html.add((int)(Math.random() * 50 + 50));
		}
		
		ArrayList<Integer> css = new ArrayList<>();
		for(int i = 0 ; i < students.size(); i++) {
			css.add((int)(Math.random() * 50 + 50));
		}
		
		ArrayList<Integer> jquery = new ArrayList<>();
		for(int i = 0 ; i < students.size(); i++) {
			jquery.add((int)(Math.random() * 50 + 50));
		}
		
		ArrayList<Integer> jsp = new ArrayList<>();
		for(int i = 0 ; i < students.size(); i++) {
			jsp.add((int)(Math.random() * 50 + 50));
		}
		
		ArrayList<Integer> sum = new ArrayList<>();
		for(int i = 0 ; i < students.size(); i++) {
			sum.add(java.get(i) + oracle.get(i) + html.get(i) + css.get(i) + jquery.get(i) + jsp.get(i));
		}
		

		for(int i = 0 ; i < sum.size() - 1 ; i++){
			for(int j = i + 1 ; j <  sum.size() ; j++){
				if (sum.get(i) < sum.get(j)){
					int temp1   = sum.get(i);
					sum.set(i, sum.get(j));
					sum.set(j, temp1);
					
					int temp2   = java.get(i);
					java.set(i, java.get(j));
					java.set(j, temp2);
					
					int temp3   = oracle.get(i);		
					oracle.set(i, oracle.get(j));
					oracle.set(j, temp3);
					
					int temp4   = css.get(i);	
					css.set(i, css.get(j));
					css.set(j, temp4);
					
					int temp5   = html.get(i);
					html.set(i, html.get(j));
					html.set(j, temp5);
					
					int temp6   = jquery.get(i);
					jquery.set(i, jquery.get(j));
					jquery.set(j, temp6);
					
					int temp7   = jsp.get(i);
					jsp.set(i, jsp.get(j));
					jsp.set(j, temp7);
					
					Object temp8 = students.get(i);
					students.set(i, students.get(j));
					students.set(j, temp8);
				}
			}
		}
		
		ArrayList<Object> avg = new ArrayList<>();
		for(int i = 0 ; i < students.size(); i++) {
			avg.add( Math.round(sum.get(i) / 6.0 * 100)/100.0 );
		}
		
		ArrayList<Integer> rank = new ArrayList<>();
		for(int i = 0 ; i < students.size(); i++) {
			rank.add(i + 1);
		}
		
		ArrayList<Object> table = new ArrayList<>();
		for(int i = 0 ; i < students.size() ; i++) {
			System.out.print(students.get(i) + "\t" + java.get(i) + "\t" + oracle.get(i) +
			 "\t" + html.get(i) +  "\t" + css.get(i) +  "\t" + jquery.get(i) +  "\t" + jsp.get(i)
					+ "\t" + sum.get(i) + "\t" + avg.get(i) + "\t" + rank.get(i) );
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
