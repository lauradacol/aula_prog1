import java.util.ArrayList;

public class Programa {
	public static void main(String[] args) {

		ArrayList<Animal> museu = new ArrayList<Animal>();
		
		museu.add(new Mamifero("Mamífero",150, 4,"Amarelo","Terra",2.0,"Camelo","", ""));
		museu.add(new Peixe("Peixe", 300, 0, "Cinzento", "Mar", 1.5, "Tubarão", "Barbatanas e Cauda"));
		museu.add(new Mamifero("Mamífero", 180, 4, "Vermelho","Terra", 0.5, "Uso do Canadá", "" ,"Mel"));
		
		for(Animal a : museu){
			a.setDados();
			}
		
		

/*
		Mamifero camelo = new Mamifero("Mamífero",150, 4,"Amarelo","Terra",2.0,"Camelo","", "");
		Peixe tubarao = new Peixe("Peixe", 300, 0, "Cinzento", "Mar", 1.5, "Tubarão", "Barbatanas e Cauda");
		Mamifero ursoDoCanada = new Mamifero("Mamífero", 180, 4, "Vermelho","Terra", 0.5, "Uso do Canadá", "" ,"Mel");
		
		camelo.setAlimento("Feno");
		System.out.println(camelo.getAlimento());
		camelo.setDadosMamifero();
		
		tubarao.setCaracteristica("Carnivoro");
		tubarao.getDadosPeixe();
	*/	
	}

}

