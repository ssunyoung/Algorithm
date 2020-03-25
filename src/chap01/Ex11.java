package chap01;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("자릿수 구하는 프로그램.");
		int num;

		// 양의 정수 판별
		do {
			System.out.println("양의 숫자를 입력하세요 : ");

			num = stdIn.nextInt();
		} while (num <= 0);

		// 자릿수 판별
		int cnt = 0;
		while (num != 0) {
			num = num / 10;
			cnt++;
		}
		System.out.println(cnt + "자리 입니다.");
	}
}

/*
 * int position = 1; int flag = 0; int res=num; do { res = num / position;
 * System.out.println("num : "+num); flag++; position *= 10;
 * System.out.println("자릿수 :"+position); } while (res > 10); // 자릿수 구하기
 * System.out.println(num + "은 " + flag + "자리 입니다."); } }
 */
