package ch7;

public class RepairableTest {

	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		
		System.out.println("드랍쉽의 현재 hp는 " + dropship.hitPoint + "입니다.");
		System.out.println("탱크의 현재 hp는 " + tank.hitPoint + "입니다.");
		
		dropship.hitPoint--;
		tank.hitPoint--;
		dropship.hitPoint--;
		tank.hitPoint--;
		
		System.out.println("전투중");
		System.out.println("드랍쉽의 현재 hp는 " + dropship.hitPoint + "입니다.");
		System.out.println("탱크의 현재 hp는 " + tank.hitPoint + "입니다.");
		
		System.out.println("수리중");
		scv.repair(dropship);
		scv.repair(tank);
		System.out.println("드랍쉽의 현재 hp는 " + dropship.hitPoint + "입니다.");
		System.out.println("탱크의 현재 hp는 " + tank.hitPoint + "입니다.");
	}

}

interface Repairable{}

class Unit_RepairableTest {
	int hitPoint;
	final int MAX_HP;
	Unit_RepairableTest(int hp){
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit_RepairableTest{
	GroundUnit(int hp){
		super(hp);
	}
}

class AirUnit extends Unit_RepairableTest{
		AirUnit(int hp){
			super(hp);
		}
}

class Tank extends GroundUnit implements Repairable{
	Tank(){
		super(150);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}
}

class Dropship extends AirUnit implements Repairable{
	Dropship(){
		super(125);
		hitPoint = MAX_HP;
	}
	
	public String toString () {
		return "Dropship";
	}
}

class Marine extends GroundUnit{
	Marine(){
		super(40);
		hitPoint = MAX_HP;
	}
}

class SCV extends GroundUnit implements Repairable{
	SCV(){
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {
		if(r instanceof Unit_RepairableTest) {
			Unit_RepairableTest u = (Unit_RepairableTest)r;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다.");
		}
	}
}