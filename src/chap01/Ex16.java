package chap01;

import java.util.Scanner;

//n���� �Ƕ�̵� ���
public class Ex16 {
	static void spira(int n) {
		// i�࿡�� (i-1)*2+1 ���� ���� *�� ��µǰ�
		// �������࿡�� (n-1) * 2 + 1�� ���� ���
		int last = 0;
		last = (n - 1) * 2 + 1;
		last = (last - 1) / 2;

		for (int i = 1; i <= n; i++) { // 1 2 3 4
			for (int a = 1; a <= last; a++) { // 3 2 1
				System.out.print("^");
			}
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
				System.out.print("*");
			}
/*			for (int a = 1; a <= last; a++) { // 3 2 1
				System.out.print("^");
			}*/
			System.out.println(); // �� �� enter

			last--;
		}

	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		do {
			System.out.println("�� �� �Է� : ");
			n = stdIn.nextInt();
		} while (n <= 0);
		spira(n);
	}

}
