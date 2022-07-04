import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour;
		int minute;
		
		hour = sc.nextInt();
		minute = sc.nextInt();
		
		if(hour != 0) {
			if(minute >= 45) System.out.println(hour + " " + (minute - 45));
			else System.out.println(hour - 1 + " " + ((60 + minute) - 45));
		}
		else {
			if(minute >= 45) System.out.println(hour + " " + (minute - 45));
			else System.out.println(23 + " " + ((60 + minute) - 45));
		}
	}	
}
