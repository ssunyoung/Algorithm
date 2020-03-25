package chap01;

import java.util.Scanner;

//1부터 n까지의 합 (양수만 입력)
public class SumForPos {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구한다.");

		int n;

		do {
			System.out.println("n의 값 : ");
			n = stdIn.nextInt();
		} while (n <= 0);

		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("1부터 " + n + "까지의 합은 ->" + sum);

	}

}
