import java.util.Scanner;

public class Gerente extends Empregado{
	
	public double definirBeneficios(double total){
		double bonus = 0.0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o valor do bônus: ");
		bonus = scan.nextDouble();
		
		total += bonus;
		
		return total;
		
		}
		
	public void listarProjetos(){
		System.out.println("Listando os projetos do gerente");
		}
	
	}

