import java.util.Scanner;

public class Day8_최대_최소값구하기 {

	public static void main(String[] args) {
		int s = 0, Max = 0;
		int[] J = new int[5];
		System.out.println("숫자 5개in");
		Scanner scanner = new Scanner(System.in);
		
		for (s = 0; s < 5; s++) // 핵심
			J[s] = scanner.nextInt();
		
		for(int i = 0; i<5; i++) {
			if (J[i] > Max)
				Max = J[i];
				
			}
			System.out.println("최대값은:" + Max + "입니다.");
		}
		

	}
//최소값은 거의 유사한데 초기 값을 100으로 잡고, if문 부등호만 바꾼


