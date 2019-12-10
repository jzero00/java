package x_practice;

public class e_oop_6_20 {

	int iv = 10;
	static int cv = 20;

	int iv2 = cv;
	//	static int cv2 = iv;
	static int cv2 = new e_oop_6_20().iv;

	static void staticMethod1(){
		System.out.println(cv);
		//		System.out.println(iv);
		e_oop_6_20 s = new e_oop_6_20();
		System.out.println(s.iv);
	}

	void instanceMethod1(){
		System.out.println(cv);
		System.out.println(iv);
	}

	static void staticMethod2(){
		//		instanceMethod1();
		e_oop_6_20 s = new e_oop_6_20();
		s.instanceMethod1();
	}

	void instanceMethod2(){
		staticMethod1();
		instanceMethod1();
	}


}
