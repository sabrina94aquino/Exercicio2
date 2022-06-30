package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double PI = 3.14159;
		
		System.out.println("Entre com o valor: ");
		double C = sc.nextDouble();
		double A = PI * C * C;
		
		System.out.printf("Area: %.4f%n", A);
		

		sc.close();
		
	}

}
