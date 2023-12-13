package edu.training.it.prakticheskoe_zanyatie;

public class Main04 {

	public static void main(String[] args) {

		int count = 0;

		double n1 = 0.5;
		double n2 = 0.7;
		double n3 = 2;
		double n4 = -1;
		double n5 = 1;
		double n6 = 1;
		double n7 = 0.3;
		double n8 = 3;

		if (((n1 >= -2 && n1 <= 0) && (n2 >= 2 && n2 <= 0)) || ((n1 >= 0 && n1 <= 2) && (n2 >= -1 && n2 <= 1))) {
			count++;
		}
		
		if (((n3 >= -2 && n3 <= 0) && (n4 >= 2 && n4 <= 0)) || ((n3 >= 0 && n3 <= 2) && (n4 >= -1 && n4 <= 1))) {
			count++;
		}
		
		if (((n5 >= -2 && n5 <= 0) && (n6 >= 2 && n6 <= 0)) || ((n5 >= 0 && n5 <= 2) && (n6 >= -1 && n6 <= 1))) {
			count++;
		}
		
		if (((n7 >= -2 && n7 <= 0) && (n8 >= 2 && n8 <= 0)) || ((n7 >= 0 && n7 <= 2) && (n8 >= -1 && n8 <= 1))) {
			count++;
		}

		System.out.println("Количество точек, попавших в заданную область = " + count);
	}
}