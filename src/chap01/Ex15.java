package chap01;

import java.util.Scanner;

public class Ex15 {
	// ���� �Ʒ��� ������ �̵ �ﰢ��
	static void triangleLB(int n) {
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�.");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}

	}

	// ���� ���� ������ �̵ �ﰢ��
	static void triangleLU(int n) {
		System.out.println("���� ���� ������ �̵ �ﰢ���� ����մϴ�.");

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}

	}

	// ������ ���� ������ �̵ �ﰢ��
	static void triangleRU(int n) {
		System.out.println("������ ���� ������ �̵ �ﰢ���� ����մϴ�.");

		for (int i = n; i >= 1; i--) { // 4,3,2,1
			for (int k = 1; k <= n - i; k++) { // ����
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) { // 1,2,3,4

				System.out.print("*");
			}
			System.out.println();
		}

	}

	// ������ �Ʒ��� ������ �̵ �ﰢ��
	static void triangleRB(int n) {
		System.out.println("������ �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�.");

		for (int i = 1; i <= n; i++) {
			for (int k = n - i; k >= 1; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		do {
			System.out.println("�� �� �ﰢ���Դϱ�?");
			n = stdIn.nextInt();
		} while (n <= 0);

		triangleLB(n);
		triangleLU(n);
		triangleRU(n);
		triangleRB(n);
		System.out.println("=========the end=======");

	}

}
