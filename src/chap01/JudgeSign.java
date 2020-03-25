package chap01;

import java.util.Scanner;

//입력한 정숫값이 양수인지 음수인지 0 인지 판별합니다.

public class JudgeSign {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int n = stdIn.nextInt();
		
		if(n>0)
			System.out.println("양수");
		else if(n<0)
			System.out.println("음수");
		else 
			System.out.println("0");
	}
}
