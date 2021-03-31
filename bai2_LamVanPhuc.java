import java.util.Scanner;

public class bai2_LamVanPhuc {

	public static void main(String[] args) {
		int n = getInputNumber();

		getOddNumbers(n);
		getSumOddNumbers(n);

	}

	static int getInputNumber() {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("nhap vao gia tri n");
			int n = sc.nextInt();
			if (isPositive(n))
				return n;
		}
	}

	static boolean isPositive(int n) {
		return n > 0;

	}

	static void getOddNumbers(int n) {
		int i;
		for (i = 1; i <= n; i++) {
			if (i % 2 != 0)
				System.out.print(" " + i);
		}
		System.out.println();

	}

	static void getSumOddNumbers(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0)
				sum += i;

		}
		System.out.println("tong day so le =" + sum);

	}
}
