import java.util.Scanner;

public class Programador extends Empregado{
	
	public double definirBeneficios(double total){
		double produtividade = 0.0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o percentual de produtividade: ");
		produtividade = scan.nextDouble();
		
		total+= (total * produtividade)/100;
		
		return total;
		
		}
	
	}
