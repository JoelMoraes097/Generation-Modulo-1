package Lista3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos
		// de
		// 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		// idade for =-99. (WHILE)

		Scanner in = new Scanner(System.in);

		int idade = 0, idademenor = 0, idademaior = 0;
		while (idade != 99) {

			System.out.print("Digite sua idade:");
			idade = in.nextInt();

			if (idade < 21) {

				idademenor++;
			}

			else if (idade > 50) {
				idademaior++;
			}

		}

		System.out.println("Total de pessoas com menos de 21 anos: " + idademenor);
		System.out.println("Total de pessoas com mais de 50 anos: " + idademaior);

	}

}
