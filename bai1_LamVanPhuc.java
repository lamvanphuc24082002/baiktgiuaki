import java.util.Scanner;


public class bai1_LamVanPhuc {

	public static void main(String[] args) {
		String str=inputString();
		char c = 0;
		output(str, c);

	}
		
	static String inputString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao mot chuoi");
		return sc.nextLine();
	}
	static void output(String str,char c) {
		for(int i=0;i<=str.length();i++) {
			if(i%2==0) {
				System.out.println(c);
			}
		}
	
	
	}

}
