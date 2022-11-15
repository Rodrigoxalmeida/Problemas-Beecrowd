package application;

import java.util.Locale;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double notas[] = new double[2];
		int cont = 0;
		int repeat = 0;

		while (repeat == 0) {
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
			
			int opcao = -1;
			do {

				System.out.println("novo calculo (1-sim 2-nao)");
				opcao = sc.nextInt();
				
				if (opcao == 2) {
					System.exit(0);
				}
				
			} while (validaOpcao(opcao) != 0);

			cont = 0;
		}

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

	public static int validaOpcao(int opcao) {
		if (opcao == 1) {
			return 0;

		} else {
			return 1;
		}
	}

}
