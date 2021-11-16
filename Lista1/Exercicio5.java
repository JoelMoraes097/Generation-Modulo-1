package Lista1;

import java.util.Scanner;

public class Exercicio5 {

	// 5. Faça um sistema que leia as 3 notas de um aluno e calcule a
	// média final deste aluno. Considerar que a média é
	// ponderada e que o peso das notas é: 2,3 e 5, respectivamente:

	public static void main(String[] args) {

		double nota1, nota2, nota3, media;

		Scanner in = new Scanner(System.in);
		System.out.print("Insira o valor da Nota 1: ");

		nota1 = in.nextDouble();

		System.out.print("Insira o valor da  Nota 2: ");

		nota2 = in.nextDouble();

		System.out.print("Insira o valor da  Nota 3: ");

		nota3 = in.nextDouble();

		media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;

		System.out.print("O valor da média ponderada é: " + media);
	}

}
