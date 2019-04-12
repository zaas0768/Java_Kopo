import java.util.Random;

public class Player2 extends Player {
	  //방어력을 추가하여 준다.
	Player2() {
		
		this.hp = 100;
		this.name = "아구몬";
		System.out.println(this.name + " : 태일아~~! 피카추 잡으러가자~~");
	}
	public int getAttackPower() {
		Random r = new Random(1000); 
		int attackPower = r.nextInt();
//		int attackPower = 20;
		if( attackPower > 500) {
			return attackPower;			
		} else if( 1 <= attackPower && attackPower <= 2) {
			attackPower = -attackPower; 
			System.out.println("헤헤 속았지. 회복되지롱~");
			return attackPower;
		} else {
			attackPower  =  attackPower * 100;
			return attackPower;
		}
	}
	public void beUnderAttak(int attackPower) {
		
		Random random = new Random();
		int hitNumber = random.nextInt(10);

				
		if (hitNumber > 1) {
				if (attackPower - 0 < 0) { //방어력을 셈하여 공격값을 계산한다.
					attackPower = 0;
				} else {
					attackPower = attackPower - 3 ; // 방어력과 힐링값을 셈하여 공격값을 계산한다.
				}
			hp = hp - attackPower;
			System.out.println(this.name + "이(가) " + attackPower + "의 데미지를 입었습니다.");
			System.out.println(this.hp + "이(가) 입니다.");

			// 겉보기에는 값을 크게 준다.
		} else {
			System.out.println(this.name + "이(가) 회피했습니다.");
		}
		
		
		
	}
}
