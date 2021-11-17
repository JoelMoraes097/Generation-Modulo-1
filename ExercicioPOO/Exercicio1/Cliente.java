package ExercicioPOO.Exercicio1;

public class Cliente extends ClienteMain {

	public static void main(String[] args) {

		ClienteMain c1 = new ClienteMain();
		c1.Valor = 50.00;
		c1.ValorCompra();
		c1.Cartao = false;
		c1.Debito = false;
		c1.maquinacartao();
	}

}
