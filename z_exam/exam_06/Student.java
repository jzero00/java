package z_exam.exam_06;

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
	// 것은 클래스호출?? 00
	//Student (String name, int ban, int no, int kor, int eng, int math){
	//가 필요한 이유
	//String name은 생성자 내의 name을 가리키고 this.name은 public class에서 String name
	//을 가리킴. 이름이 같기 때문에 정확하게 지칭하려고 this를 사용			
	
	String info(){
		return name + "," + ban + "," + no + "," + kor
				 + "," + eng + "," + math + "," + getTotal()
				 + "," + getAverage();
	}
	
}
