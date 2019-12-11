package f_oop2;

public class SampleChild extends SampleParent { //상속 클래스 쓰는 방법 : 자식 클래스 이름 + extends + 부모 클래스 이름
	//상속 왜해? : 클래스를 만드는데 변수나 메서드가 중복이 된다. 클래스들간에 공통적인 변수나 메서드를 모든 클래스에 넣는것보다 부모클래스에 넣어서
	//			상속시키면 변수나 메서드를 중복하지 않아도 됨
	
	void childMethod(){
		//상속받은 변수와 메서드를 사용할 수 있다.
		System.out.println(var);
		int result = method(7,13);
		System.out.println(result);
	}
	public static void main(String[] args) {
		
		SampleChild sc = new SampleChild();	//업캐스팅 자식타입에서 부모타입으로 형변환
		System.out.println(sc.var);
		int result = sc.method(7,13);
		System.out.println(result);
		
		sc.test(10);
		
		SampleParent sp = new SampleChild();
		//부모타입이 가지고 있는 멤버만 사용할 수 있다.
		System.out.println("sp.var : " + sp.var);
		System.out.println("sc.var : " + sc.var);
		System.out.println("sp.method() : " + sp.method(5, 10));	//오버라이딩된 메서드만 실행됨 자식클래스의 메서드가 실행된단 얘기
		System.out.println("sc.method() : " + sc.method(5, 10));
//		sp.childMethod();	→ 사용할수없음 : SampleParent 클래스에 childMethod()와 test()가 없기 때문에 사용할 수 없음
//		sp.test();
	}
	
	//오버라이딩 : 상속받은 메서드의 내용**(이게 중요) 을 재정의하는 것.
	@Override 						//어노테이션
	int method (int a, int b){		//리턴타입 메서드명 리턴타입이 모두 같아야 한다.
		return a * b;
	}
	
	int var;
	
	void test(double var){
		System.out.println(var);		//지역변수
		System.out.println(this.var);	//인스턴스변수
		System.out.println(super.var);	//부모클래스의 인스턴스 변수
		//super : 부모 클래스의 멤버와 자식클래스의 멤버가 이름이 중복될 때 둘을 구분하기 위해 사용한다.
		System.out.println(this.method(10, 20));
		System.out.println(super.method(10, 20));
	}
	
	SampleChild(){
		super();
		//super()를 사용해 부모 클래스의 객체도 생성한다.
		//super()가 없으면 컴파일러가 자동으로 super()를 넣어준다.
	}
	
	
}
