package edu.training.it.prakticheskoe_zanyatie;

public class Main07 {

	public static void main(String[] args) {

		double xStart = 1.0;
		double zStart = 0.5;
		int n = 10;
		int m = 7;
		double hX = 0.5;
		double hZ = 0.6;
		
		for (int i = 0; i < n; i++) {
			double x = xStart + i * hX;
			
			for (int j = 0; j < m; j++) {
				double z = zStart + j * hZ;
				
				double result = Math.sqrt(Math.pow(z, 2) + Math.pow(x, 2)) * Math.log(z) + (Math.abs(Math.log(z) / Math.sqrt(Math.pow(x, 2) - Math.pow(z, 2) + 3.2)));
				System.out.print("Значение функции для x = " + x + "	");
				System.out.println("Значение функции для z = " + z);

			}
		}
		
	}

}
