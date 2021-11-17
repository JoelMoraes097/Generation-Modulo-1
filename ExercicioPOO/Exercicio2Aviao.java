package ExercicioPOO;

public class Exercicio2Aviao {
	public static void main(String[] args) {

		Exercicio2ModeloAviao a1 = new Exercicio2ModeloAviao();

		System.out.print("O avião: ");
		a1.Modelo = ("A200EM ");
		System.out.print(a1.Modelo);
		a1.cor = ("Preto ");
		System.out.print(a1.cor);
		a1.decolagem = false;
		a1.decolando();

	}
}
