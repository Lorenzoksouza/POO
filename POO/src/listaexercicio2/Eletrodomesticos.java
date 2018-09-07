package listaexercicio2;

public class Eletrodomesticos {
	
	private String modelo;
	private String fabricante;
	private double consumoEletrico;
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public double getConsumoEletrico() {
		return consumoEletrico;
	}
	public void setConsumoEletrico(double consumoEletrico) {
		this.consumoEletrico = consumoEletrico;
	}
	
	public double calculaConsumo() {
		return this.consumoEletrico * 30;
	}
	public double calculaConsumo(int dias) {
		return this.consumoEletrico * dias; 
	}
}
