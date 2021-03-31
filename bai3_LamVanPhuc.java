import java.util.Scanner;

public class bai3_LamVanPhuc {

	public static void main(String[] args) {
		int n = inputNumber();
		printSquare(n);
	}

	static int inputNumber() {
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("nhap vao so dong cua hinh");
			int n = scan.nextInt();
			if (isValid(n))
				return n;
		}
	}

	static void printSquare(int n) {
		int count = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++)
				System.out.printf("%02d ", count++);
			System.out.println();
		}
	}

	static boolean isValid(int n) {
		return n > 0;
	}
}
