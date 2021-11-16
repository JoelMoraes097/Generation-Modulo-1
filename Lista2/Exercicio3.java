package Lista2;

import java.util.Scanner;

public class Exercicio3 {

	// 3. Faça um programa que receba a idade de uma pessoa e mostre na saída em
	// qual
	// categoria ela se encontra:

	//  10-14 infantil
	//  15-17 juvenil
	//  18-25 adulto

	public static void main(String[] args) {

		int idade;

		Scanner in = new Scanner(System.in);
		System.out.print("Insira sua idade:  ");
		idade = in.nextInt();

		if (idade >= 10 && idade <= 14) {
			System.out.print("A categoria é infantil  ");
		
		} else if (idade >= 15 && idade <= 17) {
			System.out.print("A categoria é juvenil  ");
		
		} else if (idade >= 18 && idade <= 25) {
			System.out.print("A categoria é adulto ");
		
		} else {
			System.out.print("Informe a idade entre 10 e 25 anos!");

		}
	}
}
