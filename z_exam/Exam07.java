package z_exam;

public class Exam07 {

	public static void main(String[] args) {

		//예외 문제 : 1 2 14 18 19 21 22 23 25~

		/*[7-3] 오버라이딩의 정의와 필요성에 대해서 설명하시오.*/



		/*[7-4] 다음 중 오버라이딩의 조건으로 옳지 않은 것은? (모두 고르시오)
		a. 조상의 메서드와 이름이 같아야 한다.
		b. 매개변수의 수와 타입이 모두 같아야 한다.
		c. 접근 제어자는 조상의 메서드보다 좁은 범위로만 변경할 수 있다.
		d. 조상의 메서드보다 더 많은 수의 예외를 선언할 수 있다.*/


		/*[7-5] 다음의 코드는 컴파일하면 에러가 발생한다. 그 이유를 설명하고 에러를 수정하기
		위해서는 코드를 어떻게 바꾸어야 하는가?*/
		//Product 클래스에 기본 생성자가 없는데 TV 클래스에서 기본 생성자를 이용해 클래스를
		//생성하려고 하기 때문에 에러 발생
//		Tv t = new Tv();


		/*[7-6] 자손 클래스의 생성자에서 조상 클래스의 생성자를 호출해야하는 이유는 무엇인
		가?*/


/*		[7-7] 다음 코드의 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오.*/
//		Child c = new Child();
//		System.out.println("x="+c.getX());

/*		[7-8] 다음 중 접근제어자를 접근범위가 넓은 것에서 좁은 것의 순으로 바르게 나열한
		것은?
		a. public-protected-(default)-private
		b. public-(default)-protected-private
		c. (default)-public-protected-private
		d. private-protected-(default)-public*/


/*		[7-9] 다음 중 제어자 final을 붙일 수 있는 대상과 붙였을 때 그 의미를 적은 것이다.
		옳지 않은 것은? (모두 고르시오)
		a. 지역변수 - 값을 변경할 수 없다.
		b. 클래스 - 상속을 통해 클래스에 새로운 멤버를 추가할 수 없다.
		c. 메서드 - 오버로딩을 할 수 없다.
		d. 멤버변수 - 값을 변경할 수 없다.*/


/*		[7-10] MyTv2클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할
		수 없도록 제어자를 붙이고 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록
		getter와 setter메서드를 추가하라.*/

//		MyTv2 t = new MyTv2();
//		t.setChannel(10);
//		System.out.println("CH:"+t.getChannel());
//		t.setVolume(20);
//		System.out.println("VOL:"+t.getVolume());
	}

}


class Product
{
	int price; 				// 제품의 가격
	int bonusPoint; 		// 제품구매 시 제공하는 보너스점수
	Product(int price) {
		this.price = price;
		bonusPoint =(int)(price/10.0);
	}
}
class Tv extends Product {

	Tv() {
		super(0);			// 추가된 것
	}

	public String toString() {
		return "Tv";
	}
}

class Parent {
	int x=100;
	Parent() {
		this(200);
	}
	Parent(int x) {
		this.x = x;
	}
	int getX() {
		return x;
	}
}
class Child extends Parent {
	int x = 3000;
	Child() {
		this(1000);
	}
	Child(int x) {
		this.x = x;
	}
}

class MyTv2 {

	private boolean isPowerOn;
	private int channel;
	private int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public boolean isPowerOn() {
		return isPowerOn;
	}
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
}