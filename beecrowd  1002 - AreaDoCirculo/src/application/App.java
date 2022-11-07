package application;

import java.util.Locale;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double n = 3.14159;

		double raio = sc.nextDouble();

		double area = n * (raio * raio);

		System.out.print("A=" + String.format("%.4f", area) + "\n");

		sc.close();
	}

}
