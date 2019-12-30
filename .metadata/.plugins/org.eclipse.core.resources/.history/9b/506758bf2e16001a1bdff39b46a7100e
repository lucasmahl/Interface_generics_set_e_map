package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// o <> é pra informar q é do tipo generics
		// pode ser colocado tipo, como Integer, dentro
		//PrintService<Integer> ps = new PrintService<>();

		//não é necessário mudar na classe
		//apenas descomentar abaixo
		PrintService<String> ps = new PrintService<>();
		
		System.out.print("Quantos valores? ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			String val = sc.nextLine();
			//sc.nextLine();

			ps.addValue(val);
		}

		ps.print();
		System.out.println("First: " + ps.first());

		sc.close();
	}

}
