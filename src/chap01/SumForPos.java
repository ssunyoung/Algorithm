package chap01;

import java.util.Scanner;

//1���� n������ �� (����� �Է�)
public class SumForPos {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1���� n������ ���� ���Ѵ�.");

		int n;

		do {
			System.out.println("n�� �� : ");
			n = stdIn.nextInt();
		} while (n <= 0);

		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("1���� " + n + "������ ���� ->" + sum);

	}

}
