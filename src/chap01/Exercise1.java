package chap01;
//page 19 연습문제

public class Exercise1 {
	// 네 값의 최댓값을 구하세요
	static int max4(int a, int b, int c, int d) {
		int max = a;

		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		if (d > max) {
			max = d;
		}
		
		return max;
	}

	// 세 값의 최솟값을 구하세요
	static int min3(int a, int b, int c) {
		int min = a;

		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}

		return min;
	}

	// 네 값의 최솟값을 구하세요
	static int min4(int a, int b, int c, int d) {
		int min = a;

		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		if (d < min) {
			min = d;
		}
		return min;
	}

	public static void main(String[] args) {

		System.out.println("max4(1,2,3,4): " + max4(1, 2, 3, 4));
		System.out.println("min3(1,2,3): " + min3(1, 2, 3));
		System.out.println("min4(1,2,3,4): " + min4(1, 2, 3, 4));
		System.out.println("min4(8,7,5,5): " + min4(8, 7, 5, 5));

	}
}
