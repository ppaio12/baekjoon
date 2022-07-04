import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int MAX = 0, cnt = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(MAX < arr[i]) {
				MAX = arr[i];
				cnt = i + 1;
			}
		}
		System.out.printf("%d\n%d", MAX, cnt);
	}
}
