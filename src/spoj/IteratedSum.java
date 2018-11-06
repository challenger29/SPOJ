package spoj;
import java.util.Scanner;

public class IteratedSum {
	private static int sumOfSquares(int num) {
		return (num * (num + 1) * (2 * num + 1)) / 6;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(sumOfSquares(b) - sumOfSquares(a - 1));
		sc.close();
	}
}
