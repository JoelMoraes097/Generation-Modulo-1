package Lista1;

import java.util.Scanner;

public class Exercicio8 {

	// 8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
	// percentagem
	// do distribuidor e dos impostos (aplicados ao custo de f�brica)
	// Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
	// escrever um sistema que
	// leia o custo de f�brica de um carro e escreva o custo ao consumidor:

	public static void main(String[] args) {

		int custoC, custoF, dis, imp;

		Scanner in = new Scanner(System.in);
		System.out.print(" Qual o custo de fabrica��o do veiculo?: ");

		custoF = in.nextInt();

		dis = (custoF * 28) / 100;
		imp = (custoF * 45) / 100;

		System.out.print("O custo ao consumidor � no total de: R$" + (custoF + dis + imp));
	}

}
