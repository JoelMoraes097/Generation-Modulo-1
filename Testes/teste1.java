package Testes;

import java.util.Scanner;

public class teste1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int num, soma = 0;

		do {
			System.out.print("Digite um numero par ou 0 para finalizar. ");
			num = in.nextInt();

			if (num % 2 == 0) {
				soma += num;
			}
			else
				System.out.println("*Atenção! Digite apenas numeros PAR*");

		} while (num != 0);

		System.out.println("A somas dos valores PARES é: " + soma);
	}
}
