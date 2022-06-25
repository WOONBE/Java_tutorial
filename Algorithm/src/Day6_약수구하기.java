import java.util.Scanner;

public class Day6_약수구하기 {

	public static void main(String[] args) {

		int i, j, num, L = 0;
		int[] A = new int[100];

		System.out.println("<숫자입력> ");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		for (j = 1; j <= num; j++) {
			if (num % j == 0) {
				L++;
				A[L] = j;
			}
		}
		System.out.println("약수갯수는 " + L);
		for (i = 1; i <= L; i++) {
			System.out.println(i + "번" + A[i]);// A[i]만드는게 관
		}



	}


}
//개수는 쉬운데 배열에 저장에서 좀 햇갈렸
