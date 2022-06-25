import java.util.Scanner;

public class Day9_최대_최소합구하기 {

	public static void main(String[] args) {
		int i = 0, Max = 0, Min = 100;

		int[] J = new int[5];

		System.out.println("숫자 5개in");

		Scanner scanner = new Scanner(System.in);

		for (i = 0; i < 5; i++) // 핵심
			J[i] = scanner.nextInt();
		
		for (i = 0; i < 5; i++) {
			if (J[i] > Max)
				Max = J[i];
		}
		for (i = 0; i < 5; i++) {
			if (J[i] < Min)
				Min = J[i];
				}
				System.out.println("최대와 최소합은" + (Max + Min));
		

}
}
