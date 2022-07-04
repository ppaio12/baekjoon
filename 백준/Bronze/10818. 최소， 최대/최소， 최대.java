import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int MAX = -1000000, MIN = 1000000;
		
		int[] arr = new int[N];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(MAX < arr[i]) MAX = arr[i];
			if(MIN > arr[i]) MIN = arr[i];
		}
		System.out.printf("%d %d", MIN, MAX);
				
	}
}
