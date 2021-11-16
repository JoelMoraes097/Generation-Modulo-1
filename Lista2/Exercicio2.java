package Lista2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		int num1, num2, num3;

		Scanner in = new Scanner(System.in);
		System.out.print("Insira o primeiro numero:  ");

		num1 = in.nextInt();

		System.out.print("Insira o segundo numero:  ");

		num2 = in.nextInt();

		System.out.print("Insira o terceiro numero:  ");

		num3 = in.nextInt();

		if (num1 > num2 && num2 > num3) {
			System.out.print("Insira primeiro numero é o maior. " + num3 + ", " + num2 + ", " + num1);
		}

		else if (num1 < num2 && num2 < num3) {
			System.out.print("Insira primeiro numero é o maior. " + num1 + ", " + num2 + ", " + num3);
		}

		else if (num1 > num3 && num3 > num2) {
			System.out.print("Insira segundo numero é o maior. " + num2 + ", " + num3 + ", " + num1);
		}

		else if (num1 < num3 && num3 < num2) {
			System.out.print("Insira segundo numero é o maior. " + num1 + ", " + num3 + ", " + num2);
		}

		else if (num2 > num1 && num1 > num3) {
			System.out.print("Insira segundo numero é o maior. " + num2 + ", " + num1 + ", " + num3);

		} else if (num2 < num1 && num1 < num3) {
			System.out.print("Insira segundo numero é o maior. " + num2 + ", " + num1 + ", " + num3);

		} else if (num2 < num3 && num1 < num3) {
			System.out.print("Insira segundo numero é o maior. " + num2 + ", " + num3 + ", " + num1);

		} else if (num3 > num1 && num1 > num2) {
			System.out.print("Insira segundo numero é o maior. " + num3 + ", " + num1 + ", " + num2);

		} else if (num3 < num1 && num1 < num2) {
			System.out.print("Insira segundo numero é o maior. " + num3 + ", " + num1 + ", " + num2);

		} else if (num3 > num1 && num1 > num2) {
			System.out.print("Insira segundo numero é o maior. " + num3 + ", " + num1 + ", " + num2);

		} else if (num3 < num1 && num1 < num2) {
			System.out.print("Insira segundo numero é o maior. " + num3 + ", " + num1 + ", " + num2);

		}
	}
}
