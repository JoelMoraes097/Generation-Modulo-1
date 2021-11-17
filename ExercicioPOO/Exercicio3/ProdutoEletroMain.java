package ExercicioPOO.Exercicio3;

public class ProdutoEletroMain {

	private static final String String = null;
	private String Marca, Modelo, cor;
	private Double Preço;
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

	public Double getPreço() {
		return Preço;
	}

	public void setPreço(Double preço) {
		Preço = preço;
	}
}
