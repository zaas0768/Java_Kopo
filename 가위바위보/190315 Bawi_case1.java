import java.util.Random;
import java.util.Scanner;

public class Bawi {
	public static void main(String[] args) {
		int gawiBawiBoComputer;

		Random rand = new Random();
		gawiBawiBoComputer = rand.nextInt(3);
		String gawiBawiBoComputerString = "";
		if (gawiBawiBoComputer == 0) {
			gawiBawiBoComputerString = "����";
		} else if (gawiBawiBoComputer == 1) {
			gawiBawiBoComputerString = "����";
		} else if (gawiBawiBoComputer == 2) {
			gawiBawiBoComputerString = "��";
		}

		Scanner scan = new Scanner(System.in);
		System.out.print("������������ �Է����ּ���.\n");
		String gawiBawiBoUserString;
		gawiBawiBoUserString = scan.nextLine();

		if (gawiBawiBoComputerString.equalsIgnoreCase(gawiBawiBoUserString)) {
			System.out.print("�����ϴ�.");
		} else if (gawiBawiBoComputerString.equalsIgnoreCase("����") && gawiBawiBoUserString.equalsIgnoreCase("����")) {
			System.out.print("����ڰ� �̰���ϴ�.");
		} else if (gawiBawiBoComputerString.equalsIgnoreCase("����") && gawiBawiBoUserString.equalsIgnoreCase("��")) {
			System.out.print("��ǻ�Ͱ� �̰���ϴ�.");
		} else if (gawiBawiBoComputerString.equalsIgnoreCase("����") && gawiBawiBoUserString.equalsIgnoreCase("����")) {
			System.out.print("��ǻ�Ͱ� �̰���ϴ�.");
		} else if (gawiBawiBoComputerString.equalsIgnoreCase("����") && gawiBawiBoUserString.equalsIgnoreCase("��")) {
			System.out.print("����ڰ� �̰���ϴ�.");
		} else if (gawiBawiBoComputerString.equalsIgnoreCase("��") && gawiBawiBoUserString.equalsIgnoreCase("����")) {
			System.out.print("����ڰ� �̰���ϴ�.");
		} else if (gawiBawiBoComputerString.equalsIgnoreCase("��") && gawiBawiBoUserString.equalsIgnoreCase("����")) {
			System.out.print("��ǻ�Ͱ� �̰���ϴ�.");
		} else {
			System.out.println("�߸��� ���ڿ��� �Է��߽��ϴ�.");
		}
	}
}
