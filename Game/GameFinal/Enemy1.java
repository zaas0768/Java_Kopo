import java.util.Random;
import java.util.Scanner;

public class Enemy1 extends Enemy {
	Enemy1() {
		this.name = "준하형";
		this.hp = 10;
		System.out.println("야생의 " + this.name + "이 나타났다!!!!!");
	}
	public int getAttackPower() {
		return 10;
	}
	public void beUnderAttak(int attackPower) {
		Random r = new Random();
		int p = r.nextInt(10);
		if (p == 0) {
			System.out.println("엣큥☆");
			this.hp -= attackPower;
			System.out.println(this.hp);
		} else {
			String m1 = "F : Fine \nT : Thank You \nA : And You?\n";
			String m2 = "아 : 아버지 \n나 : 나를 낳으시고 \n바 : 바지적삼 \n다 : 다 적시셨네..\n";
			String m3 = "굴 : 굴뚝에 빠진 산타 할아버지 \n전 : 전두환\n";
			String m4 = "에 : 에야 에야 \n너 : 너 저 얼마 있어? \n지 : 지져서 나오면 10원에 백 대야\n";
			String m5 = "박 : 박식하기 그지없고 \n명 : 명석한 두뇌를 가진 \n수 : 수재요!\n";
			String m6 = "관 : 관세음보살 \n자 : 자비를 베푸소서\n";
			String m7 = "남 : 남자는 \n미 : 미쳤다\n";
			String m8 = "새 : 새엄마보다 \n우 : 우리 엄마가 좋다\n";
			String m9 = "광 : 광어 \n주 : 주이소!\n";
			String m10 = "대 : 대자도 돼요? \n구 : 구이도 돼요?\n";
			String m11 = "서 : 서민들을 위한 \n울 : 울산\n";
			String m12 = "연 : 연못속에 빠진 \n구 : 구준엽\n";
			String m13 = "이 : 이번 역은 \n신 : 신들린 \n우 : 우장산역\n";
//			int select = r.nextInt(10);
//			if (select == 0) {
			System.out.println(m1);
//			} else if (select == 1) {
			System.out.println(m2);
//			} else if (select == 2) {
			System.out.println(m3);
//			} else if (select == 3) {
			System.out.println(m4);
//			} else if (select == 4) {
			System.out.println(m5);
//			} else if (select == 5) {
			System.out.println(m6);
//			} else if (select == 6) {
			System.out.println(m7);
//			} else if (select == 7) {
			System.out.println(m8);
//			} else if (select == 8) {
			System.out.println(m9);
//			} else if (select == 9) {
			System.out.println(m10);
//			}
			System.out.println(m11);
			System.out.println(m12);
			System.out.println(m13);
		}
	}
}