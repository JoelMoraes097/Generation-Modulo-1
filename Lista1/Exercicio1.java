package Lista1;

import java.util.Scanner;

public class Exercicio1 {

	// 1. Fa�a um sistema que leia a idade de uma pessoa e
	// xpressa em anos, meses e dias e mostre-a expressa apenas em dias:

	public static void main(String[] args) {

		int meses, dias, resp, anos;

		Scanner in = new Scanner(System.in);
		System.out.print("Quantos anos voc� tem? ");

		anos = in.nextInt();

		System.out.print("Quantos meses voc� tem? ");

		meses = in.nextInt();

		System.out.print("Quantos dias voc� tem? ");

		dias = in.nextInt();
		resp = (anos * 365 + meses * 30 + dias);

		System.out.println("Voc� tem " + resp + " dias.");
	}
}