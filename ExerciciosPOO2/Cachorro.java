package ExerciciosPOO2;

public class Cachorro extends Animal {

	@Override
	public void som() {
		System.out.println("Au! Au! Au!");
	}

	@Override
	public void agir() {
		System.out.println("Correndo...");
	}
}
