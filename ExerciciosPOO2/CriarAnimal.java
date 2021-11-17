package ExerciciosPOO2;

public class CriarAnimal {

	public static void main(String[] args) {

		Cachorro Cachorro = new Cachorro();

		System.out.println("||  CACHORRO  ||");

		Cachorro.setNome("Móliver.");
		Cachorro.setIdade("10 anos.");

		System.out.println("Nome: " + Cachorro.getNome() + "\nIdade: " + Cachorro.getIdade());
		Cachorro.som();
		Cachorro.agir();

		Cavalo Cavalo = new Cavalo();

		System.out.println("||  CAVALO  ||");
		
		Cavalo.setNome("Carpeado.");
		Cavalo.setIdade("20 anos.");

		System.out.println("Nome: " + Cavalo.getNome() + "\nIdade: " + Cavalo.getIdade());
		Cavalo.som();
		Cavalo.agir();

		Preguica Preguica = new Preguica();
		
		System.out.println("||  PREGUIÇA  ||");
		
		Preguica.setNome("Piguiça.");
		Preguica.setIdade("4 anos.");

		System.out.println("Nome: " + Preguica.getNome() + "\nIdade: " + Preguica.getIdade());
		Preguica.som();
		Preguica.agir();


	}

}
