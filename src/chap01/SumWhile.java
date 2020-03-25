package chap01;

import java.util.Scanner;

//1부터 n까지의 합
public class SumWhile {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구한다.");
		System.out.println("n의 값 : ");
		int n = stdIn.nextInt();

		int sum = 0;
		int i = 1;

		while (i <= n) {
			sum = sum + i;
			i++;
		}

		System.out.println("1부터 " + n + "까지의 합은 ->" + sum + "****i의 값은 : " + i);
	}
}
