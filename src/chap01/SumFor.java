package chap01;

import java.util.Scanner;

//1부터 n까지의 합
public class SumFor {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구한다.");
		System.out.println("n의 값 : ");
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

		System.out.println("1부터 " + n + "까지의 합은 ->" + sum);

	}

}
