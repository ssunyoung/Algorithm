package chap01;
//3���� ������ ��� �ִ��� ���Ͽ� ����Ѵ�.

public class Max3m {
	// a, b, c�� �ִ��� ���Ͽ� ��ȯ�Ѵ�.
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
