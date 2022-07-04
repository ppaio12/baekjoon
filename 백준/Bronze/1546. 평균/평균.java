import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = 0;	//과목갯수
		
		N = sc.nextInt();
		
		int[] all = new int[N];	// 점수 보관
		
		double sum = 0;	// 총합
		
		double M = 0;	//맥스점수
		
		for(int i = 0; i < all.length; i++) {
			all[i] = sc.nextInt();
			if(M < all[i]) M = all[i];
		} 	
		
		for(int i = 0; i < all.length; i++) {
			sum += (all[i] / M) * 100;
		}
		
		System.out.println(sum / N);
		
		sc.close();

	}
}
