package chap01;
//3개의 정수값 가운데 최댓값을 구하여 출련한다.

public class Max3m {
	// a, b, c의 최댓값을 구하여 반환한다.
	static int max3(int a, int b, int c) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		
		return max;
	}
	
	public static void main(String args[]) {
		System.out.println(max3(3,2,1));;
	}
}
