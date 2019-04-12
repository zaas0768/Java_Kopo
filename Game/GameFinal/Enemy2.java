import java.util.Random;

public class Enemy2 extends Enemy{
	Enemy2() {
		this.name = "피카츄";
		this.hp = 100000;
		System.out.println("내 친구"+ this.name +"이(가) 출현했습니다.");
	}
	public int getAttackPower() {
		return 10;
	}	
	public void beUnderAttak(int attackPower) {
		
		Random random = new Random();
		int hitNumber = random.nextInt(5);
		if (hitNumber == 3) {
			this.hp = this.hp*10;  //공격받을 때마다 hp 1/10 씩 감소 
			System.out.println(this.name + "이(가) " + 9*hp+ "의 피해를 입었습니다.");
			// 겉보기에는 값을 크게 준다.
		} else {
			System.out.println(this.name + "이(가) 회피했습니다.");
		}
	}
}
