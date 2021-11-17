package ExercicioPOO;

public class Exercicio1ModeloCliente {

	// atributos

	public String Nome;
	public Double Valor;
	public Boolean Cartao;
	public Boolean Debito;
	public Double Troco;

	// metodos

	public void ValorCompra() {
		System.out.println("O valor da compra é: " + Valor);
	}

	public void maquinacartao() {
		if (Cartao == true) {

			if (Debito == true) {

				System.out.println("A compra sera paga no Debito. ");
			} else {
				System.out.println("A compra sera paga Credito. ");
			}
		} else {
			System.out.println("A Compra sera paga no dinheiro. ");

		}

	}
}
