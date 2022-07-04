import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int cmp;
		
		for(int i = 0; i < 10; i++) {
			int A = sc.nextInt();
			arr[i] = A % 42;
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					cmp = arr[j];
					arr[j] = arr[i];
					arr[i] = cmp;
				}
			}
		}
		
		int count = 0;
		for(int i = 0; i < arr.length -1; i++) {
			if(arr[i] == arr[i+1]) {
				count++;
			}
		} 
		System.out.println(10 - count);
	}
}