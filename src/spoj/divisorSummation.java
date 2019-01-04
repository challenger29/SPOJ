package spoj;

import java.util.Scanner;

public class divisorSummation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int i = 0 ; i < testCases;i++){
			int num = sc.nextInt();
			if(isValid(num)){
				int sum = 1;
				for(int j = 2 ; j <= Math.sqrt(num) ; j++){
					if(num % j == 0)
						sum += j + ( num /j );
				}
				System.out.println(sum);
			}
			else{
				System.out.println("0");
			}
		}
		sc.close();
		
	}

	private static boolean isValid(int num) {
		if(num > 0 && num <= 500000)
			return true;
		return false;
	}
}
