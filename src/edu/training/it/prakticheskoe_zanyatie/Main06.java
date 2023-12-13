package edu.training.it.prakticheskoe_zanyatie;

public class Main06 {

	public static void main(String[] args) {

		double a = 1000;
		double b = 60000;
		double m = 4;
		int count = 0;

		double t1 = Math.sqrt(a + b + m);
		double t2 = Math.sqrt(a + b);
		double t3 = Math.sqrt(a * b * m);
		double t4 = Math.sqrt(a * b);

		for (int k = -30; k <= 60; k++) {
			double f = (Math.pow(k, 3) - 25 * Math.pow(k, 2) + 50 * k + 1000);

			if (f >= t1 && f <= t2 || f >= t3 && f <= t4) {
				System.out.println("f(" + k + ") = " + f);
			} else
				count++;
		}
		System.out.println("Количество значений, не удовлетворяющих условию: " + count);
	}
}