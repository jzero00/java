package f_oop2.test;

import f_oop2.AccessModifier;

public class AccessTest /*extends AccessModifier 상속받으면 protected 를 사용할 수 있음*/{

	public static void main(String[] args) {

		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
//		System.out.println(am.protectedVar);
//		am.protectedMethod();
		
//		System.out.println(am.defaultVar);
//		am.defaultMethod();
		
//		System.out.println(am.privateVar);
//		am.privateMethod();
		
//		AccessTest at = new AccessTest();
//		System.out.println(at.protectedVar);
//		at.protectedMerhod();				//상속 받았을때만 사용 가능
	}

}
