package edu.training.it.prakticheskoe_zanyatie;

public class Main03 {

	public static void main(String[] args) {

		double x = 0.5;
		int n = 20;
		int sum = 0;

		for (int k = 1; k <= 20; k++) {

			double a = (Math.sin((k * x) / 2.0) + Math.sin((k * x - 1) / 2.0) / (Math.pow(Math.E, (x - 1) / k)));

			sum += a;
		}
		
		double rezult = Math.sqrt(n * Math.PI) * sum;

		System.out.println(rezult);
	}

}
