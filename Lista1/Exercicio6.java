package Lista1;

import java.util.Scanner;

public class Exercicio6 {

	// 6. Construa um programa em c que, tendo como dados de entrada dois pontos
	// quaisquer
	// no plano, P(x1, y1) e P(x2, y2), escreva a distância entre
	// eles. A fórmula que efetua tal cálculo é:

	public static void main(String[] args) {

		double x1, x2, y1, y2, d, raiz;

		Scanner in = new Scanner(System.in);
		System.out.print("Digite o valor do x1: ");
		x1 = in.nextDouble();

		System.out.print("Digite o valor do x2: ");
		x2 = in.nextDouble();

		System.out.print("Digite o valor do y1: ");
		y1 = in.nextDouble();

		System.out.print("Digite o valor do y2: ");
		y2 = in.nextDouble();

		d = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);

		raiz = Math.sqrt(d);

		System.out.println("A distância entre os pontos é: " + raiz);
	}

}
