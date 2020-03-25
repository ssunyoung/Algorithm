package chap01;

import java.util.Scanner;

//1부터 n까지의 합
public class Exercise01_2 {
	// 정수 a,b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드 작성
	// 단 대소 관계없이 합을 구하세요.
	static int sumof(int a, int b) {
		int sum = 0;
		int min=a, max=b;
		if(a>b) {
			min = b;
			max = a;
		}
		for (int i = min; i <= max; i++) {
			sum = sum + i;
		}
		return sum;
	}

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
		// 가우스의 덧셈
		// (1+10) * 5
		// (1+6) * 3 21
		// (1+7) * 3.5
		System.out.println("가우스 덧셈 방법");
		float sum2 = 0;
		int answer = 0;
		sum2 = (1 + n) * ((float) n / 2);
		// (1 + n) * n / 2
		// answer = (1 + n) * n / 2 + (n % 2 == 1 ? (n + 1) / 2 : 0);

		System.out.println("가우스 소거법의 합은 : " + sum2);
		
		
		//정수 a,b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드 작성.
		System.out.println("sumof(1,5) 사이의 합은 "+sumof(48,1));
	}

}
