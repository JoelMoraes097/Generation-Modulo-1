package ProjetoZoo;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		String entrada;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o nome de um Animal: ");
		entrada = in.next();
	
		////////////////////////////////////////////////
		
		//AVES

		//ARARA-AZUL
		
		AraraAzul AA = new AraraAzul();
		
		AA.setNome("Arara-Azul");
		AA.setExpcVida(50);
		AA.setHabitat("terrestre");
		AA.setExtincao(true);
		AA.setPesoMax(1.3);
		AA.setTamanhoMax(100);
		AA.setComida("Sementes");
		
		
		//Pica-pau-do-parnaiba
		
		PicaPauParnaiba PPP = new PicaPauParnaiba();
		
		PPP.setNome("Pica-pau-do-parnaiba");
		PPP.setExpcVida(15);
		PPP.setHabitat("terrestre");
		PPP.setExtincao(true);
		PPP.setPesoMax(95);
		PPP.setTamanhoMax(27);
		PPP.setComida("Insetos");
		
		//////////////////////////////////////////////
		
		if(entrada.equalsIgnoreCase("Arara-Azul")) {
			System.out.println("Nome: " + AA.getNome() + " | Tamanho: " + AA.getTamanhoMax() +
			"\nExpc. Vida: " + AA.getExpcVida() + " | Peso Max: " + AA.getNome() + 
			"\nAmeaçado de Ex: " + AA.isExtincao() + " | Habitat: " + AA.getHabitat() + " | Comida: " +
			AA.getComida());
		} else if (entrada.equalsIgnoreCase("Pica-Pau")) {
			System.out.println("Nome: " + PPP.getNome() + " | Tamanho: " + PPP.getTamanhoMax() +
			"\nExpc. Vida: " + PPP.getExpcVida() + " | Peso Max: " + PPP.getNome() + 
			"\nAmeaçado de Ex: " + PPP.isExtincao() + " | Habitat: " + PPP.getHabitat() + " | Comida: " +
			PPP.getComida());
		}
		
		////////////////////////////////////////////
		in.close();
	}

}
