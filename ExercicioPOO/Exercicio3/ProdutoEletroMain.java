package ExercicioPOO.Exercicio3;

public class ProdutoEletroMain {

	private static final String String = null;
	private String Marca, Modelo, cor;
	private Double Pre�o;
	public Boolean ligado;

	public void ligar() {

		if (ligado == true) {
			System.out.print("\nO Produto esta ligado...");
		} else {
			System.out.print("\nO Produto esta desligado...");
		}
	}

	public void TrocarCanal() {
		if (ligado == true)

			System.out.println("\nTrocando de canal...");
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Double getPre�o() {
		return Pre�o;
	}

	public void setPre�o(Double pre�o) {
		Pre�o = pre�o;
	}
}
