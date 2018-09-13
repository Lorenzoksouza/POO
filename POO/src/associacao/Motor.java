package associacao;

public class Motor {

	private int quantidadeValvulas;
	private double potencia;
	private String fabricante;
	
	public Motor(int quantidadeValvulas, double potencia, String fabricante) {
		super();
		this.quantidadeValvulas = quantidadeValvulas;
		this.potencia = potencia;
		this.fabricante = fabricante;
	}

	public Motor() {
		super();
	}

	public int getQuantidadeValvulas() {
		return quantidadeValvulas;
	}

	public void setQuantidadeValvulas(int quantidadeValvulas) {
		this.quantidadeValvulas = quantidadeValvulas;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "\nMotor "
				+ "\nQuantidadeValvulas=" + quantidadeValvulas 
				+ "\nPotencia=" + potencia 
				+ "\nFabricante=" + fabricante;
	}
	
}
