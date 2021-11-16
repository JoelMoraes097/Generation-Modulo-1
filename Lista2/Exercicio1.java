package Lista2;

import java.util.Scanner;

public class Exercicio1 {

	// 1. Faça um programa que receba três inteiros e diga qual deles é o maior.

	public static void main(String[] args) {

		int num1, num2, num3;

		Scanner in = new Scanner(System.in);
		System.out.print("Insira o primeiro numero:  ");

		num1 = in.nextInt();

		System.out.print("Insira o segundo numero:  ");

		num2 = in.nextInt();

		System.out.print("Insira o terceiro numero:  ");

		num3 = in.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.print("Insira primeiro numero é o maior." + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.print("Insira segundo numero é o maior." + num2);
		} else {
			System.out.print("Insira terceiro numero é o maior." + num3);

		}
	}
}
