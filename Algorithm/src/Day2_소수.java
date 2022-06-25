import java.util.Scanner;

public class Day2_소수 {

	public static void main(String[] args) {
		int num, j;
		Boolean isPrime = true;

		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		for(j=2; j<num ; j++) {
			if(num % j == 0) {
				isPrime = false;
				break;
			}//if
		}//for
		if(isPrime) {
			System.out.println("소수");
		}

		else {
			System.out.println("소수가 아님");
		}

	}// main

}// class
