package Lista1;

import java.util.Scanner;

public class Exercicio7 {
	// 7. Um sistema de equações lineares do tipo:
	// pode ser resolvido segundo mostrado abaixo :

	public static void main(String[] args) {

		double a, b, c, d, e, f, x, y;

		Scanner in = new Scanner(System.in);
		System.out.print("Digite o valor de 'a': ");
		a = in.nextDouble();

		System.out.print("Digite o valor de 'b': ");
		b = in.nextDouble();

		System.out.print("Digite o valor de 'c': ");
		c = in.nextDouble();

		System.out.print("Digite o valor de 'd': ");
		d = in.nextDouble();

		System.out.print("Digite o valor de 'e': ");
		e = in.nextDouble();

		System.out.print("Digite o valor de 'f': ");
		f = in.nextDouble();

		x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		y = ((a * f) - (c * d)) / ((a * e) - (b * d));

		System.out.println("\nO valor de x é: " + x + "\nO valor de y é: " + y);

	}

}
