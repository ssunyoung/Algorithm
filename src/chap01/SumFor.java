package chap01;

import java.util.Scanner;

//1���� n������ ��
public class SumFor {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1���� n������ ���� ���Ѵ�.");
		System.out.println("n�� �� : ");
		int n = stdIn.nextInt();

		int sum = 0;
		int i;

		for (i = 1; i <= n; i++) {
			sum += i;

			if (i == n)
				System.out.print(i);
			else
				System.out.print(i + " + ");
		}
		System.out.println(" = " + sum);

		System.out.println("1���� " + n + "������ ���� ->" + sum);

	}

}
