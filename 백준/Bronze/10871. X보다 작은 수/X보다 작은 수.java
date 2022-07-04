import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, X, A;
		
		N = sc.nextInt();
		X = sc.nextInt();		
		
		for(int i = 0; i < N; i++) {
			A = sc.nextInt();
			if(A < X) System.out.print(A + " ");
		}
		
		sc.close();
	}
}
