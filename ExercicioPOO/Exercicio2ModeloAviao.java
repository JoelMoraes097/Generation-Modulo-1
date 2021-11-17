package ExercicioPOO;

public class Exercicio2ModeloAviao {

	public String Modelo, cor;
	public Boolean decolagem;

	public void decolando() {

		if (decolagem == true) {
			System.out.println("esta descolando.");
		} else {
			System.out.println("ainda não decolou.");
		}

	}

}
