package Lista3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		// 2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

		int num, numPar = 0, numImpar = 0;

		for (num = 0; num <= 10; num++)
			;
		{

			for (int x = 0; x < 10; x++) {
				Scanner in = new Scanner(System.in);
				System.out.print("Digite o " + (x + 1) + "� n�mero : ");
				num = in.nextInt();

				if (num % 2 == 0) {
					numPar++;
				}

				else
					numImpar++;

			}
			System.out.println("O  total de  numeros pares s�o: " + numPar);
			System.out.println("O  total de  numeros impares s�o: " + numImpar);

		}
	}

}
