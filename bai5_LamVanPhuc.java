import java.util.Scanner;

public class bai5_LamVanPhuc {

	public static void main(String[] args) {
		int l, w;
		do {
			w = inputLW("rong");
			l = inputLW("dai");

		} while (isValid(w, l));
		printSquare(w, l);
	}

	static int inputLW(String name) {
		Scanner scan = new Scanner(System.in);
		System.out.println("nhap vao chieu " + name + " cua hinh");
		return scan.nextInt();
	}

	static boolean isValid(int l, int w) {
		return l > w && w > 0;
	}

	static void printSquare(int w, int l) {
		for (int i = 1; i <= w; i++) {
			for (int j = 1; j <= l; j++) {
				if (i == 1 || j == 1 || i == w || j == l) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();

		}
	}
}
