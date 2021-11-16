package Lista1;

import java.util.Scanner;

public class Exercicio2 {

	// 2. Faça um sistema que leia a idade de uma pessoa
	// expressa em dias e mostre-a expressa em anos, meses e dias:

	public static void main(String[] args) {

		int anos, meses, dias, resp;

		Scanner in = new Scanner(System.in);
		System.out.print("Quantos dias de idade você tem? ");

		dias = in.nextInt();

		anos = dias / 365;
		meses = (dias % 365) / 30;
		resp = (dias % 365) % 30;

		System.out.println("Você tem, " + anos + " anos " + meses + " meses e " + resp + " dias ");
	}
}
