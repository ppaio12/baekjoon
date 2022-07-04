import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1;
		int n2;
		int n3;
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		if(n1 == n2 && n1 == n3) {
			System.out.println(10000 + (n1 * 1000));
		}
		else if(n1 == n2 || n1 == n3 || n2 == n3) {
			if(n1 == n2) System.out.println(1000 + (n1 * 100));
			else if(n1 == n3) System.out.println(1000 + (n1 * 100));
			else System.out.println(1000 + (n2 * 100));
		}
		else {
			if (n1 >= n2 && n1 >= n3) System.out.println(n1 * 100);
			else if (n2 >= n1 && n2 >= n3) System.out.println(n2 * 100);
			else System.out.println(n3 * 100);
		}
				
	}
}
