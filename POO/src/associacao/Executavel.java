package associacao;

public class Executavel {

	public static void main(String[] args) {
		
		Motor m1 = new Motor(8,560,"Ferrari");
		
		Roda r1 = new Roda("P200",20,"Brigestone");
		Roda r2 = new Roda("P200",20,"Brigestone");
		Roda r3 = new Roda("P200",20,"Brigestone");
		Roda r4 = new Roda("P200",20,"Brigestone");
		Roda r5 = new Roda("P200",20,"Brigestone");
		Roda[] rodas = {r1,r2,r3,r4,r5};
		
		Carro c1 = new Carro();
			c1.setModelo("California");
			c1.setFabricante("Ferrari");
			c1.setAno(2019);
			c1.setQuilometragem(0);
			c1.setMotor(m1);
			c1.setRodas(rodas);
		
		System.out.println(c1);
	}

}
