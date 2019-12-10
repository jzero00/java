package sem_e_oop;

public class SampleChild extends SampleParent { //상속받을 클래스 이름은 클래스 이름 + extends 부모 클래스 이름
	
	void childMethod(){
		//상속받은 변수와 메서드를 사용할 수 있다.
		System.out.println(var);
		int result = method(7,13);
		System.out.println(result);
	}
	public static void main(String[] args) {
		SampleChild sc = new SampleChild();
		System.out.println(sc.var);
		int result = sc.method(7,13);
		System.out.println(result);
	}
}
