package Lista2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		//4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
		//  n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
		//  �mpar exiba o n�mero elevado ao quadrado.

		int num;

		Scanner in = new Scanner(System.in);
		System.out.print("Insira um numero:  ");

		num = in.nextInt();

		if (num % 2 != 0) {
			System.out.print("O numero " + num + " � IMPAR. ");
			System.out.println("\nO numero " + num + " elevado ao quadrado � " + Math.pow(num, 2));
		}

		else
			System.out.print("O numero " + num + " � PAR. ");
		System.out.println("\nA Raiz quadrado do numero " + num + " � " + Math.sqrt(num));
	}
}
