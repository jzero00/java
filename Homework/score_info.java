package Homework;

import z_exam.exam_06.Student;

public class score_info {

	private String name;
	private static int rank;
	private static int java;
	private static int oracle;
	private static int html;
	private static int css;
	private static int jquery;
	private static int jsp;
	private static int sum;
	private static double avg;
	
	
	
	public score_info(){
		
	}
	
	public score_info (int rank, String name, int java, int oracle, int html,
			int css, int jquery, int jsp, int sum, double avg){
		this.name = name;
		this.java = java;
		this.oracle = oracle;
		this.html = html;
		this.css = css;
		this.jquery = jquery;
		this.jsp = jsp;
		this.sum = sum;
		this.avg = avg;
		this.rank = rank;
	}

	public static int getJava() {
		java = (int)(Math.random() * 50 + 50);
		return java;
	}

	public static int getOracle() {
		oracle = (int)(Math.random() * 50 + 50);
		return oracle;
	}


	public static int getHtml() {
		html = (int)(Math.random() * 50 + 50);
		return html;
	}

	public static int getCss() {
		css = (int)(Math.random() * 50 + 50);
		return css;
	}

	public static int getJquery() {
		jquery = (int)(Math.random() * 50 + 50);
		return jquery;
	}

	public static int getJsp() {
		jsp = (int)(Math.random() * 50 + 50);
		return jsp;
	}

	public static int getSum() {
		sum = java + oracle + html + css + jquery + jsp;
		return sum;
	}

	public static double getAvg() {
		avg = sum / 6;
		return avg;
	}

//	public int getRank() {
//		int n;
//		int sum_max = 
//		if (sum > )
//		return n;
//	}






	
	
}
