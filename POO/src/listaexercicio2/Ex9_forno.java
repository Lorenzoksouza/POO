package listaexercicio2;

public class Ex9_forno extends Eletrodomesticos{

	private double capacidade;
	private double consumoEletrico;
	
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
		this.consumoEletrico = consumoEletrico + (consumoEletrico / 100 * 25);
	}
	
	public double calculaConsumo() {
		return this.consumoEletrico * 30;
	}
	public double calculaConsumo(int dias) {
		return this.consumoEletrico * dias; 
	}
}
