package chap01;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("�ڸ��� ���ϴ� ���α׷�.");
		int num;

		// ���� ���� �Ǻ�
		do {
			System.out.println("���� ���ڸ� �Է��ϼ��� : ");

			num = stdIn.nextInt();
		} while (num <= 0);

		// �ڸ��� �Ǻ�
		int cnt = 0;
		while (num != 0) {
			num = num / 10;
			cnt++;
		}
		System.out.println(cnt + "�ڸ� �Դϴ�.");
	}
}

/*
 * int position = 1; int flag = 0; int res=num; do { res = num / position;
 * System.out.println("num : "+num); flag++; position *= 10;
 * System.out.println("�ڸ��� :"+position); } while (res > 10); // �ڸ��� ���ϱ�
 * System.out.println(num + "�� " + flag + "�ڸ� �Դϴ�."); } }
 */
