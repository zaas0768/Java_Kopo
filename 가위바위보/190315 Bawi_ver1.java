import java.util.Random;
import java.util.Scanner;

public class Bawi {
	public static void main(String[] args) {
		int gawiBawiBo1;
		int gawiBawiBo2;
		
		Random rand = new Random();
		gawiBawiBo1 = rand.nextInt(3);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������������ �Է����ּ���.\n ������ 0, ������ 1, ���� 2 �Դϴ� : ");
		gawiBawiBo2 = scan.nextInt();
		gawiBawiBo2 = gawiBawiBo2 % 3;
		
		if (gawiBawiBo1 == gawiBawiBo2) {
			System.out.print("�����ϴ�.");
		} else if (gawiBawiBo1 == 0 && gawiBawiBo2 == 1) {
			System.out.print("����ڰ� �̰���ϴ�.");
		} else if (gawiBawiBo1 == 0 && gawiBawiBo2 == 2) {
			System.out.print("��ǻ�Ͱ� �̰���ϴ�.");
		} else if (gawiBawiBo1 == 1 && gawiBawiBo2 == 0) {
			System.out.print("��ǻ�Ͱ� �̰���ϴ�.");
		} else if (gawiBawiBo1 == 1 && gawiBawiBo2 == 2) {
			System.out.print("����ڰ� �̰���ϴ�.");
		} else if (gawiBawiBo1 == 2 && gawiBawiBo2 == 0) {
			System.out.print("����ڰ� �̰���ϴ�.");
		} else if (gawiBawiBo1 == 2 && gawiBawiBo2 == 1) {
			System.out.print("��ǻ�Ͱ� �̰���ϴ�.");
		}
	}
}
