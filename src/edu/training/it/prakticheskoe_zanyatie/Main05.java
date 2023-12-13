package edu.training.it.prakticheskoe_zanyatie;

public class Main05 {

	public static void main(String[] args) {

		double y;
		double a = 1.0;
		double x = -2.0 * a;
		double dx = a / 5.0;
		int n = 6;

		for (int i = 0; i < n; i++) {

			x += dx;

			if (x <= 0) {
				y = a / 2.0 * (Math.pow(Math.E, x / a) + Math.pow(Math.E, -x / a));
			} else {
				y = 4 * Math.pow(a, 3) / (Math.pow(x, 2) + 4 * Math.pow(a, 2));
			}

			System.out.println("y = " + y);

		}
	}

}
