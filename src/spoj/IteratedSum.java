package spoj;

import java.io.IOException;
import java.util.Scanner;

public class IteratedSum {
	private static int sumOfSquares(int num){
		return (num * (num +1) *(2*num +1))/6;
		
	}
	public static void main(String[] args) {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		try {
//			int a = br.read();
//			int b = br.read();
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(sumOfSquares(b) - sumOfSquares(a -1));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
