package application;

import java.util.Scanner;

import service.PrintService;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("Quantos valores? ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			Integer valor = sc.nextInt();
			ps.addValor(valor);
		}
		
		ps.print();
		System.out.print("\nFirst: " + ps.first());
	}

}
