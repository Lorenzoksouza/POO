package associacao;

public class Roda {

	private String modelo;
	private int tamanho;
	private String fabricante;
	
	public Roda(String modelo, int tamanho, String fabricante) {
		super();
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.fabricante = fabricante;
	}

	public Roda() {
		super();
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "\nRoda"
				+ "\nModelo=" + modelo 
				+ "\nTamanho=" + tamanho 
				+ "\nFabricante=" + fabricante;
	}
	
	
	
}
