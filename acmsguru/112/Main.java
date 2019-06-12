import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(solve(a, b));

		sc.close();
	}

	static BigInteger solve(int a, int b) {
		return BigInteger.valueOf(a).pow(b).subtract(BigInteger.valueOf(b).pow(a));
	}
}
