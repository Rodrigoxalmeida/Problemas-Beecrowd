package application;

import java.util.Locale;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double notas[] = new double[2];
		int cont = 0;

		while (cont < notas.length) {

			double nota = sc.nextDouble();

			if (validaNota(nota) == 1) {
				notas[cont] = nota;
				cont++;
			} else {
				System.out.println("nota invalida");
			}
		}

		double somaMedia = 0.0;

		for (double nota : notas) {
			double media = calculaMedia(nota);
			somaMedia = somaMedia + media;
		}

		System.out.println("media = " + String.format("%.2f", somaMedia));

		sc.close();
	}

	public static int validaNota(double nota) {
		if (nota < 0 || nota > 10) {
			return 0;
		} else {
			return 1;
		}
	}

	public static double calculaMedia(double nota) {
		return nota = (nota / 2);
	}

}
