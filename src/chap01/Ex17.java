package chap01;

import java.util.Scanner;

public class Ex17 {

	static void npira(int n) {
		// i�࿡�� (i-1)*2+1 ���� ���� *�� ��µǰ�
		// �������࿡�� (n-1) * 2 + 1�� ���� ���
		// i�� ��� ���ڴ� i % 10
		int last = 0;
		last = (n - 1) * 2 + 1;
		last = (last - 1) / 2;

		for (int i = 1; i <= n; i++) { // 1 2 3 4 5 6 7 ...
			for (int a = 1; a <= last; a++) { // 3 2 1
				System.out.print("^");
			}
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
				System.out.print(i%10);
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
		npira(n);
	}

}
