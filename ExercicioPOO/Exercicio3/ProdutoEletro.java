package ExercicioPOO.Exercicio3;

public class ProdutoEletro {

	public static void main(String[] args) {

		ProdutoEletroMain TV = new ProdutoEletroMain();

		TV.setModelo("OLEDM65");
		TV.setMarca("LG");
		TV.setCor("Preto");
		TV.setPre�o(5000.00);
		TV.ligado = false;

		System.out.println("TV: " + TV.getModelo() + "\nMarca: " + TV.getMarca() + "\nValor: " + TV.getPre�o());
		TV.ligar();
		TV.TrocarCanal();
	}
}
