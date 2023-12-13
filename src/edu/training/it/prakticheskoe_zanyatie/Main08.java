package edu.training.it.prakticheskoe_zanyatie;

public class Main08 {

	public static void main(String[] args) {

		double x = 0.1;
		double z = 0.1;
		double rezult;

		while (x <= 10) {

			rezult = Math.pow(x, 2) - Math.pow(Math.E, 2 * x) + 4;

			if (rezult < -10) {
				break;
			}

			x += z;

			System.out.println(rezult);

		}
	}

}