package chap01;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("사각형을 출력합니다.");
		System.out.println("단 수 : ");

		int n;
		n = stdIn.nextInt();

		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				System.out.printf("*");	
			}
			System.out.println();
		}
	}
}
