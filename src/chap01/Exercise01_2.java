package chap01;

import java.util.Scanner;

//1���� n������ ��
public class Exercise01_2 {
	// ���� a,b�� �����Ͽ� �� ������ ��� ������ ���� ���Ͽ� ��ȯ�ϴ� �޼��� �ۼ�
	// �� ��� ������� ���� ���ϼ���.
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
		// ���콺�� ����
		// (1+10) * 5
		// (1+6) * 3 21
		// (1+7) * 3.5
		System.out.println("���콺 ���� ���");
		float sum2 = 0;
		int answer = 0;
		sum2 = (1 + n) * ((float) n / 2);
		// (1 + n) * n / 2
		// answer = (1 + n) * n / 2 + (n % 2 == 1 ? (n + 1) / 2 : 0);

		System.out.println("���콺 �ҰŹ��� ���� : " + sum2);
		
		
		//���� a,b�� �����Ͽ� �� ������ ��� ������ ���� ���Ͽ� ��ȯ�ϴ� �޼��� �ۼ�.
		System.out.println("sumof(1,5) ������ ���� "+sumof(48,1));
	}

}
