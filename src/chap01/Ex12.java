package chap01;

public class Ex12 {
	public static void main(String[] args) {

		System.out.printf("    |");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println("");
		
		for (int i = 1; i <= 9; i++) {
			if (i == 1) {
				System.out.println("----+------------------------------");
			}
			for (int j = 1; j <= 9; j++) {
				if (j == 1) {
					System.out.printf("%3d |%3d", i, i * j);
				} else {
					System.out.printf("%3d", i * j);
				}
			}

			System.out.println("\n");
		}
	}

}
