package ExercicioPOO.Exercicio2;

public class Exercicio2ModeloAviao {

	public String Modelo, cor;
	public Boolean decolagem;


	public void status() {

		System.out.println("Modelo: " + Modelo);
		System.out.println("Cor: " + cor);
		System.out.print("Avi�o decolou? " );
		if (decolagem == true) {
			System.out.print(" Esta descolando.");
		} else {
			System.out.print(" Ainda n�o decolou.");
		}

	}

}
