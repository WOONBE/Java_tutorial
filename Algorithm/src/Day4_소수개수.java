import java.util.Scanner;

public class Day4_소수개수 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int count = 0;
		int K=2;
		do {
			int J = 2;
			while(K%J !=0) {
				J ++;
			}
			if (K==J) {
				count++;
				System.out.print(K+"\t");
			}
			if (K < num)
				K++;
				
			else
				break;
			

		}while(true);
		System.out.println();
		System.out.println("입력한 " + num + "까지의 소수 갯수 :" + count);

	}

}
