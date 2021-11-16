package Lista1;

import java.util.Scanner;

public class Exercicio3 {

	// 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
	// expressa em segundos e mostre-o expresso em horas, minutos e segundos:

	public static void main(String[] args) {

		int horas, minutos, segundos, total;

		Scanner in = new Scanner(System.in);
		System.out.print("Quantos segundos teve a duração do evento? ");

		segundos = in.nextInt();

		horas = (segundos / 3600);
		minutos = (segundos - horas * 3600) / 60;
		total = (segundos % 60);

		System.out.println("O evento teve o total de: " + horas + "h" + minutos + "m" + total + "s");
	}
}
