package listaexercicio2;

public class Ex2_microondas extends Eletrodomesticos{

	private String modelo;
	private String fabricante;
	private double capacidade;
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
	
	public double getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}
	
	public double getConsumoEletrico() {
		return consumoEletrico;
	}
	public void setConsumoEletrico(double consumoEletrico) {
		this.consumoEletrico = consumoEletrico;
	}
	Ex2_microondas microondas = new Ex2_microondas();
	public Ex2_microondas() {
		
	}
}