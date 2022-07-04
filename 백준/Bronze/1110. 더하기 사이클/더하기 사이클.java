import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		
		int N = sc.nextInt();
		int copy = N;
		
		while(true) {
			N = ((N % 10) * 10) + ((N / 10 + N % 10) % 10);	
			cnt++;
			if(copy == N) break;
		}
		sc.close();
		System.out.println(cnt);
		

	}
}
