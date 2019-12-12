package f_oop2.ex_abstract.ex_interface;

public class Starcraft {

	public static void main(String[] args) {
		SCV scv = new SCV();
		
		Tank tank = new Tank();
		Marine marine = new Marine();
		Dropship dropship = new Dropship();
		scv.repair(tank);
//		scv.repair(marine);	//marine은 기계가 아니라 컴파일 에러 발생 Repairable로 인터페이스 상속받지 못해 에러발생
		scv.repair(dropship);
	}

}
// 관계를 없는 것들끼리 관계를 만들어줄때.. 인터페이스를 사용
// Tank와 Dropship SCV는 기계라 SCV가 수리 가능
class Unit{
	int hp;				//현재 체력
	final int MAX_HP;	//최대 체력
	
	Unit(int hp){
		MAX_HP = hp;
		this.hp = MAX_HP;
	}
}

class Marine extends Unit{
	Marine(){
		super(40);
	}
}

class Tank extends Unit implements Repairable{
	Tank(){
		super(150);
	}
}

class Dropship extends Unit implements Repairable{
	Dropship(){
		super(125);
	}
}

class SCV extends Unit implements Repairable{
	SCV(){
		super(60);
	}
	
	void repair(Repairable r){	
		//Repairable 인터페이스를 상속받게 함으로써 수리가 가능한 유닛을 구분했다.
		//그러나 Repairable에는 멤버가 없기 때문에 아무것도 할 수 없다.
		//hp를 멤버로 가진 부모클래스 Unit으로 형변환해줘야 한다.
		if(r instanceof Unit){	//Unit으로 형변환이 가능한지 확인 intanceof 
			Unit u = (Unit)r;
			
			while(u.hp < u.MAX_HP){
				u.hp++;
			}
		}
	}	
}

interface Repairable{
	
}








