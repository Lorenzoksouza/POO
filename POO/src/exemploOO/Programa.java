package exemploOO;

public class Programa {

	public static void main(String[] args) {

		Carro carro = new Carro();
		carro.setFabricante("Ford");
		carro.setModelo("Mustang GT");
		carro.setAno(2018);
		carro.setCor("Preto");
		
		Bens meusBens = new Bens();
		meusBens.setCarro(carro);
		
		System.out.println(meusBens.getCarro().getModelo());
		System.out.println(meusBens.getCarro().getAno());
	
	}

}
