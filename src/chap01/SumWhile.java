package chap01;

import java.util.Scanner;

//1���� n������ ��
public class SumWhile {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1���� n������ ���� ���Ѵ�.");
		System.out.println("n�� �� : ");
		int n = stdIn.nextInt();

		int sum = 0;
		int i = 1;

		while (i <= n) {
			sum = sum + i;
			i++;
		}

		System.out.println("1���� " + n + "������ ���� ->" + sum + "****i�� ���� : " + i);
	}
}
