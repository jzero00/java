package h_useful;

public class Objectclass {

	public static void main(String[] args) {
		
		//toString : 객체에 대한 정보를 문자열로 제공한다.
		Objectclass oc = new Objectclass();
		System.out.println(oc);
	}

	@Override
	public String toString() {
		return "toString() 메소드 호출";
	}

}
