package Lista3;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		// 6- Escrever um programa que receba vários números inteiros no teclado. E no
		// final imprimir a média dos números múltiplos de 3. Para sair digitar
		// 0(zero).(DO...WHILE)

		Scanner in = new Scanner(System.in);

		int num, soma = 0, media, total = 0;

		do {
			System.out.print("Digite um numero ou digite 0 para sair: ");
			num = in.nextInt();

			if (num % 3 == 0) {
				soma += num;
				total++;
			}

		} while (num != 0);

		media = soma / (total - 1);

		System.out.println("Média dos números múltiplos de 3 é: " + media);
	}
}
