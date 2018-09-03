package exemploOO;

public class Pessoa {

	private String nome;
	private int idade;
	private String CPF;
	private Bens meusBens;
	private double capacidadeFinanceira;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	
	public Bens getMeusBens() {
		return meusBens;
	}
	public void setMeusBens(Bens meusBens) {
		this.meusBens = meusBens;
	}
	
	public double getCapacidadeFinanceira() {
		return capacidadeFinanceira;
	}
	public void setCapacidadeFinanceira(double capacidadeFinanceira) {
		this.capacidadeFinanceira = capacidadeFinanceira;
	}
	
	
	
}
