package Lab6;

import java.util.Scanner;
import java.math.BigInteger;

public class Lab6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long s1 = sc.nextLong();
		long s2 = sc.nextLong();
		long s3 = sc.nextLong();

		long num1 = sc.nextLong();
		long num2 = sc.nextLong();

		for (int i = 0; i <= s1; i++) {

			if (power(s2, i, s1) == s3) {

				long p1 = power(num1, s1 - 1 - i, s1);
				long num = multiply(p1, num2, s1);
				System.out.println(num);
				break;

			}

		}

	}

	public static long power(long k, long k1, long k2) {

		if (k1 == 0)
			return 1;
		else if (k1 % 2 == 0) {
			long x = power(k, k1 / 2, k2);
			return multiply(x, x, k2);
		} else {
			long x = power(k, k1 / 2, k2);
			long one = multiply(x, x, k2);
			return multiply(one, k, k2);
		}
	}

	public static long multiply(long z, long t, long time) {

		if (t == 0)
			return 0;
		else if (t % 2 == 0) {
			long x1 = multiply(z, t / 2, time);
			return (x1 + x1) % time;
		} else {
			long x1 = multiply(z, t / 2, time);
			return (x1 + x1 + z) % time;
		}
	}

}
