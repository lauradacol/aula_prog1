import java.util.Scanner;

public class FolhaPagamento{
	
	public double calcularFolha(Empregado emp){
		double total = 0.0;
		total = emp.definirSalario();
		total = emp.definirBeneficios(total); // chamada polimórfica
		return total;
		}
	
	public static void main(String[] args){
		FolhaPagamento folha = new FolhaPagamento();
		Empresa company = new Empresa();
		Empregado emp = null;
		
		while(true){
			System.out.println("1 - Programador");
			System.out.println("2 - Analista");
			System.out.println("3 - Gerente");
			System.out.println("4 - Sair");									
			System.out.println("Escolha a opção:");
			Scanner scan = new Scanner(System.in);
			int opcao = scan.nextInt();
			
			if(opcao == 4){
				System.exit(0);
				}
			
			switch(opcao){
				case 1:
					emp = new Programador(); 
					break;
				case 2:
					emp = new Analista();
					break;
				case 3:
					emp = new Gerente();
					break;
				default:
					System.out.println("Opção inválida");
				}
				company.registrar(emp); //passando um objeto que sofreu upcast
				System.out.println("Salário total: " + folha.calcularFolha(emp)); //passando um objeto que sofreu upcast		
			}
		}	
	}
