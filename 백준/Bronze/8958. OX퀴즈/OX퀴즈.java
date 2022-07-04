import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		int sum = 0;
		int total = 0;
		
		N = sc.nextInt();
		
		String[] arr = new String[N];
	
		for(int i = 0; i < N; i++) {
			arr[i] = sc.next();
		}

		for(int i = 0; i < N; i++) {
			for(int j = 0; j < arr[i].length(); j++) {
				char ch = arr[i].charAt(j);
				if(ch == 'O') {
					sum += 1;
					total += sum;
					continue;
				}
				sum = 0;
			}
			System.out.println(total);
			sum = 0;
			total = 0;						
		}
        sc.close();
		
	}
}
