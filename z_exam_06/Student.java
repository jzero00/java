package z_exam_06;

public class Student {

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int getTotal(){
		return kor + eng + math;
	}
	
	float getAverage(){
		return (float)((kor + eng + math) / 3f);
	}
}
