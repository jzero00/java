package f_oop2.ex_abstract;

public abstract class SampleAbstractParent {		//SampleAbstractParent는 부모 클래스 역할만 함

	/*
	 * << 추상 메서드 >>
	 * - 구현부다 없이 선언부만 존재하는 메서드이다.				→ 구현부 : 내용 내용이 없는 메서드 중괄호 없이 세미콜론으로 끝남
	 * - abstract 리턴타입 메서드명();
	 * - 클래스 구현에 도움을 주기 위해 사용한다.
	 * 
	 * << 추상 클래스 >>
	 * - 추상메서드를 가진 클래스를 추상 클래스라고 한다.			→ 추상 메서드를 하나라도 갖고 있으면 추상 클래스
	 * - abstract class 클래스명{	}					
	 * - 추상 클래스는 객체를 생성할 수 없고, 부모 클래스의 역할만 할 수 있다.
	 * 		→ 추상 메서드는 이름만 있고 내용은 없음. 상속받으면 이름만 있고 오버라이딩해서 내용을 사용할 수 있음
	 */
	
	void method(){
		
	}
	
	abstract void abstrcatMethod();					//→ 추상 메서드
}

/*class SampleAbstractChild extends SampleAbstractParent{

}				이렇게 쓰면 오버라이딩을 안해서 컴파일 에러가 발생
*/

class SampleAbstractChild extends SampleAbstractParent{
	// 추상 메서드를 상속받으려면 반드시 구현해야 한다.
	// 상속받은 추상메서드를 추상메서드로 남겨두려면 클래스를 추상클래스로 변경해야한다.
	// 부모 클래스가 자식 클래스가 여러개 있는데 공통적으로 들어가는 메서드 변수를 묶기 위해 사용
	// 그중에서 메서드의 이름이 동일한 메서드가 있는데 일부 자식 클래스의 내용이 다르다.
	// 부모 클래스에서 내용을 일일이 만들어 줄 수 없음. 자식 클래스에서 만들어라 이얘기......
	@Override
	void abstrcatMethod() {

		
	}
	
}

