package Lista2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		//4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
		//  número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
		//  ímpar exiba o número elevado ao quadrado.

		int num;

		Scanner in = new Scanner(System.in);
		System.out.print("Insira um numero:  ");

		num = in.nextInt();

		if (num % 2 != 0) {
			System.out.print("O numero " + num + " é IMPAR. ");
			System.out.println("\nO numero " + num + " elevado ao quadrado é " + Math.pow(num, 2));
		}

		else
			System.out.print("O numero " + num + " é PAR. ");
		System.out.println("\nA Raiz quadrado do numero " + num + " é " + Math.sqrt(num));
	}
}
