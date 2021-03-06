class Conta {
  private int numero;
  private String dono;
  private double saldo;

	public Conta(int numero, String dono, double saldo){
		this.numero = numero;
		this.dono = dono;
		this.saldo = saldo;
		}
		
	public double getSaldo(){
		return this.saldo;
		}

	public boolean sacar(double valor){
		if(valor <=0){
			System.out.println("Valor Inválido");
			return false;
		}
		if(this.saldo>=valor){
			this.saldo-=valor;
			System.out.println("\n\tDébito na Conta: "+this.numero+"\n\tValor: "+valor+"\n\tSaldo final: "+ this.saldo+"\n");
			return true;
		} else{
			System.out.println("\n\t\tValor selecionado maior que o saldo da conta!\n");
			return false;
		}
	}
	
	public boolean depositar(double valor){
		if(valor <=0){
			System.out.println("Valor Inválido");
			return false;
		}else{
			this.saldo+=valor;
			System.out.println("\n\tCrédito na Conta: "+this.numero+"\n\tValor: "+valor+"\n\tSaldo final: "+ this.saldo+"\n");
			return true;
		}
	}
	
	public void transferirPara(Conta c, double valor){
		if(this.sacar(valor))
			c.depositar(valor);
	}	
	
	public String toString(){
		return "\nConta: "+this.numero+"\nTitular: "+this.dono+"\nSaldo: "+this.saldo+"\n";	
	}

}
