
public class Day5_배수구하기 {

	public static void main(String[] args) {

		int cnt = 0;
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				cnt++;
				sum += i;
			}

		}
		System.out.println("개수합계는" + cnt);

		System.out.print("총합은" + sum);

	}

}
//안보고 그냥 풀었