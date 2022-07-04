import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = A * B;
		
		System.out.println((B % 10) * A);
		B /= 10;
		System.out.println((B % 10) * A);
		B /= 10;
		System.out.println((B % 10) * A);
		System.out.println(C);
		
	}	
}
