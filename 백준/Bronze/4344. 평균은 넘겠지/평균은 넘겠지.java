import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();			// 테스트 케이스 개수
		
		
		
		for (int i = 0; i < C; i++) {
			
			int sum = 0;
			double avg = 0;
			int cnt = 0;
			
			int N = sc.nextInt();				// N = 학생 명수
			
			int[] arr = new int[N];
			
			for (int j = 0; j < N; j++) {
				int tmp = sc.nextInt();
				arr[j] = tmp;					// 점수 넣기
				sum += tmp;						// sum에 점수 넣기
			}
			
			avg = sum / N;						// 평균
			
			for(int k = 0; k < N; k++) {
				if(avg < arr[k]) cnt++;			// 점수가 평균보다 높으면 cnt증가
			}
			
			 System.out.printf("%.3f%%\n", (100.0 / N) * cnt);
		}
		sc.close();
	}
}