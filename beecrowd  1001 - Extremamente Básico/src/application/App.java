package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		int X = A + B;

		System.out.print("X = " + X + "\n");
		
		sc.close();

	}

}
