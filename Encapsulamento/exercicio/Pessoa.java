class Pessoa{
	private int idade;
	private float peso;
	private String nome;
	
	public Pessoa(int idade, float peso, String nome){
		this.idade = idade;
		this.peso = peso;
		this.nome = nome;
		}
	
	public String getNome(){
		return this.nome;
		}
	
	public String toString(){
		return "\nIdade: "+this.idade+"\nPeso: "+this.peso+"\nNome: "+this.nome+"\n";	
	}
	
	
	
}
