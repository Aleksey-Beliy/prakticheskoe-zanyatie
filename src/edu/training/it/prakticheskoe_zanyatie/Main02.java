package edu.training.it.prakticheskoe_zanyatie;

public class Main02 {

	public static void main(String[] args) {

		double a = 0.5;
		double b = 1.0;
		int n = 1;

		for (; a <= b; n++) {
			a += 0.05;
			
			double x = a;

			double rezult = Math.sqrt(Math.pow(Math.E, 2.2 * x)) - Math.abs(Math.sin((Math.PI * x) / (x + 2.0 / 3.0)))
					+ 1.7;

			System.out.print("[" + n + "] = ");
			System.out.printf("%f6", rezult);
			System.out.println();

		}
	}
}