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
		return (float)(((kor + eng + math) / 3f * 10 + 0.5f) / 10f);
	}
	
	Student (String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
	//질문 : Student s = new Student("홍길동",1,1,100,60,76); 에서 만든
	// 것은 클래스호출??
	//Student (String name, int ban, int no, int kor, int eng, int math){
	//가 필요한 이유
	
	String info(){
		return name + "," + ban + "," + no + "," + kor
				 + "," + eng + "," + math + "," + getTotal()
				 + "," + getAverage();
	}
	
}
