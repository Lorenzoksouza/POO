package listaexercicio2;

public class Ex3_fogao extends Eletrodomesticos{

	private String modelo;
	private String fabricante;
	private double bocas;
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
	
	public double getBocas() {
		return bocas;
	}
	public void setBocas(double bocas) {
		this.bocas = bocas;
	}
	
	public double getConsumoEletrico() {
		return consumoEletrico;
	}
	public void setConsumoEletrico(double consumoEletrico) {
		this.consumoEletrico = consumoEletrico;
	}
	Ex3_fogao fogao = new Ex3_fogao();
	public Ex3_fogao() {
		
	}
}
