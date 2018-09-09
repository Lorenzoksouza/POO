package listaexercicio2;

public class Cozinha {

	public static void main(String[] args) {
		Ex1_geladeira geladeira = new Ex1_geladeira();
		geladeira.setFabricante("Samsung");
		geladeira.setModelo("Side by Side");
		geladeira.setCapacidade(765);
		geladeira.setConsumoEletrico(1526.4);
		
		Ex2_microondas microondas = new Ex2_microondas();
		microondas.setFabricante("Brastemp");
		microondas.setModelo("BMS45CRANA ");
		microondas.setCapacidade(32);
		microondas.setConsumoEletrico(33.6);
		
		Ex3_fogao fogao = new Ex3_fogao();
		fogao.setFabricante("Electrolux");
		fogao.setModelo("76XGE");
		fogao.setBocas(5);
		fogao.setConsumoEletrico(1.0);
		
		Ex4_lavaLouca lavaLouca = new Ex4_lavaLouca();
		lavaLouca.setFabricante("Brastemp");
		lavaLouca.setModelo("BLF08");
		lavaLouca.setCapacidade(15);
		lavaLouca.setConsumoEletrico(18.72);
		
		Ex9_forno forno = new Ex9_forno();
		forno.setFabricante("Electrolux");
		forno.setModelo("Fb54X");
		forno.setCapacidade(44);
		forno.setConsumoEletrico(43.2);
		
		System.out.println("Geladeira:");
		System.out.println("Fabricante: " + geladeira.getFabricante());
		System.out.println("Modelo: "+ geladeira.getModelo());
		System.out.println("Capacidade: " + geladeira.getCapacidade() + " L");
		System.out.println("Consumo eletrico: " + geladeira.getConsumoEletrico() + " Kw/d");
		
		System.out.println("\nMicroondas:");
		System.out.println("Fabricante: " + microondas.getFabricante());
		System.out.println("Modelo: "+ microondas.getModelo());
		System.out.println("Capacidade: " + microondas.getCapacidade() + " L");
		System.out.println("Consumo eletrico: " + microondas.getConsumoEletrico() + " Kw/d");
		
		System.out.println("\nFogão:");
		System.out.println("Fabricante: " + fogao.getFabricante());
		System.out.println("Modelo: "+ fogao.getModelo());
		System.out.println("Numero de bocas: " + fogao.getBocas());
		System.out.println("Consumo eletrico: " + fogao.getConsumoEletrico() + " Kw/d");
		
		System.out.println("\nLava Louca:");
		System.out.println("Fabricante: " + lavaLouca.getFabricante());
		System.out.println("Modelo: "+ lavaLouca.getModelo());
		System.out.println("Capacidade: " + lavaLouca.getCapacidade() + " L");
		System.out.println("Consumo eletrico: " + lavaLouca.getConsumoEletrico() + " Kw/d");
		
		System.out.println("\nForno:");
		System.out.println("Fabricante: " + forno.getFabricante());
		System.out.println("Modelo: " + forno.getModelo());
		System.out.println("Capacidade: " + forno.getCapacidade() + " L");
		System.out.println("Consumo eletrico: " + forno.getConsumoEletrico() + " Kw/d");

		System.out.println("\nConsumo eletrico da cozinha:");
		System.out.println("Consumo mensal: "+ (geladeira.calculaConsumo() + microondas.calculaConsumo() + fogao.calculaConsumo() + lavaLouca.calculaConsumo() + forno.calculaConsumo()) + " Kw");
		System.out.println("Consumo de 10 dias: " + (geladeira.calculaConsumo(10) + microondas.calculaConsumo(10) + fogao.calculaConsumo(10) + lavaLouca.calculaConsumo(10) + forno.calculaConsumo(10)) + " Kw");
		System.out.println(forno.calculaConsumo());
	}

}
