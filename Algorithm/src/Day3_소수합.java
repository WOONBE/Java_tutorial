import java.util.Scanner;

public class Day3_소수합 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sum = 0;
		int K = 2;

		do {
			int J = 2;

			while (K % J != 0) {
				J++;
			}
			if (K == J) {
				sum += K;
				System.out.print(K + "\t");
			}
			if (K < num) {
				K++;
			} else
				break;

		} while (true);
		System.out.println("\n");
		System.out.println("입력한 " + num + "까지의소수" + sum);

	}

}
