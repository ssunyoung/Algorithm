package chap01;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("b-a�� ���� ������[�� a < b]");
		int a, b;
		
		do {
			System.out.println("a : ");
			a = stdIn.nextInt();
			System.out.println("b : ");
			b = stdIn.nextInt();
			//System.out.println("a < b �̿��� �մϴ�.");
		} while (a >= b);
		
		int result=0;
		
		result = b-a;
		
		System.out.println(b+"-"+a+"�� ���� :"+result);
	}
}
