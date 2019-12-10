package sem_e_oop;

public class SampleParent {

	String var;
	{
		var = "초기화 블럭을 물려주지 않는다.. 내꺼다!.";
	}
	
	SampleParent(){
		var = "생성자도 물려주지 않는다.. 이것도 내꺼다.";
	}
	
	int method (int a, int b){
		return a + b;
	}
}
