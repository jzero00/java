package f_oop2.ex_abstract;

public abstract class Animal {

	void run(){
		System.out.println("달려가~~~~~~~~~~~~");
	}
	
	abstract void sound();				// 동물이 내는 소리는 각각 다르다.
	
}

class Dog extends Animal{

	@Override
	void sound() {
		System.out.println("왈왈~~!!");
	}
	
}

class Cat extends Animal{

	@Override
	void sound() {
		System.out.println("미야옹~~~ 불럿냥");
	}
	
}

class Frog extends Animal{

	@Override
	void sound() {
		System.out.println("개굴개굴 깨꾸링");
	}
	
}