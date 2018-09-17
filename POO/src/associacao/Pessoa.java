package associacao;

import java.util.Arrays;

public class Pessoa {

	private String nome;
	private int idade;
	private Documento doc;
	private Endereco[] enderecos;
	private Carro[] carros;
	
	public Pessoa(String nome, int idade, Documento doc, Endereco[] enderecos, Carro[] carros) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.doc = doc;
		this.enderecos = enderecos;
		this.carros = carros;
	}
	
	public Pessoa() {
		super();
	}
	
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
	public Documento getDoc() {
		return doc;
	}
	public void setDoc(Documento doc) {
		this.doc = doc;
	}
	public Endereco[] getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(Endereco[] enderecos) {
		this.enderecos = enderecos;
	}
	public Carro[] getCarros() {
		return carros;
	}
	public void setCarros(Carro[] carros) {
		this.carros = carros;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", doc=" + doc + ", enderecos="
				+ Arrays.toString(enderecos) + ", carros=" + Arrays.toString(carros) + "]";
	}
	
}
