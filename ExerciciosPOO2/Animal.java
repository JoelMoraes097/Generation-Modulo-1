package ExerciciosPOO2;

public class Animal {

	private String nome, idade;

	public void som() {
		System.out.println("Emitir som...");
	}

	public void agir() {
		System.out.println("Agindo");

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

}