package quizquiz;
import java.util.Scanner;

public class Game1 {
	public static void main(String[] args) {
		Player P = new Player();
		Enemy E = new Enemy();
		P.HP = 100;
		E.HP = 100;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			if (!E.status()) {
				System.out.println("적 주금");
				break;
			}
			System.out.println("턴 진행은 엔터를 입력하세요.");
			scanner.nextLine();
			E.beUnderAttack(P);
			if (!P.status()) {
				System.out.println("플레이어 주금");
				break;
			}
			System.out.println("턴 진행은 엔터를 입력하세요.");
			scanner.nextLine();
			P.beUnderAttack(E);
		}
	}
}