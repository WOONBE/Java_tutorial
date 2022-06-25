import java.util.Scanner;

public class Day7_최대공약수_최소공배수 {

	public static void main(String[] args) {
		Double LCM = 0.0, GCM = 0.0, NMG, Big, Small, A, B;

		Scanner scanner = new Scanner(System.in);

		A = scanner.nextDouble();

		B = scanner.nextDouble();

		if (A >= B) {
			Big = A;
			Small = B;
		} else {
			Big = B;
			Small = A;
		}

		while (true) {
			NMG = (Big % Small);
			if (NMG == 0) {
				GCM = Small;
				LCM = ((A * B) / GCM);
				break;
			}
			else {
				Big = Small;
				Small = NMG;

			}
		}
		System.out.println("최대공약" + GCM);
		System.out.println("최공배" + LCM);
	}
}// else부분은 혼 생각해
