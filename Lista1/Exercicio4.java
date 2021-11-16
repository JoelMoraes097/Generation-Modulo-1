package Lista1;

import java.util.Scanner;

public class Exercicio4 {

	// 4. Escreva um sistema que leia três números inteiros e positivos
	// (A, B, C) e calcule a seguinte expressão:

	public static void main(String[] args) {

		int D, R, S, A, B, C;

		Scanner in = new Scanner(System.in);
		System.out.print("Insira o valor de A: ");

		A = in.nextInt();

		System.out.print("Insira o valor de B: ");

		B = in.nextInt();

		System.out.print("Insira o valor de C: ");

		C = in.nextInt();

		R = (A + B) * (A + B);
		S = (B + C) * (B + C);
		D = (R + S) / 2;

		System.out.println("O valor de D é: " + D);
	}
}
