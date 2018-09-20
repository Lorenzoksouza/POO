package associacao;


public class Executavel {

	public static void main(String[] args) {
		
		Motor m1 = new Motor(8,560,"Ferrari");
		Roda r1 = new Roda("P200",20,"Brigestone");
		Roda r2 = new Roda("P200",20,"Brigestone");
		Roda r3 = new Roda("P200",20,"Brigestone");
		Roda r4 = new Roda("P200",20,"Brigestone");
		Roda r5 = new Roda("P200",20,"Brigestone");
		Roda[] rodas1 = {r1,r2,r3,r4,r5};
		Carro c1 = new Carro();
			c1.setModelo("California");
			c1.setFabricante("Ferrari");
			c1.setAno(2019);
			c1.setQuilometragem(0);
			c1.setMotor(m1);
			c1.setRodas(rodas1);
		Motor m2 = new Motor(8,670,"Ford");
		Roda r6 = new Roda("V82",20,"Michelin");
		Roda r7 = new Roda("V82",20,"Michelin");
		Roda r8 = new Roda("V82",20,"Michelin");
		Roda r9 = new Roda("V82",20,"Micehlin");
		Roda[] rodas2 = {r6,r7,r8,r9};
		Carro c2 = new Carro("Mustang", "Ford", 2017, 2052, m2, rodas2);
		Carro[] carros = {c1, c2};
		Endereco end1 = new Endereco();
		end1.setRua("Rua do senac");
		end1.setNumero(500);
		end1.setBairro("Centro");
		Endereco end2 = new Endereco("Rua da minha casa", 512, "Jardim Cidade");
		Endereco[] enderecos = {end1, end2};
		Documento doc = new Documento();
		doc.setCpf("12345678901");
		doc.setRg("1234568");
		Pessoa p1 = new Pessoa("Lorenzo", 19, doc, enderecos, carros);
		
		Motor m3 = new Motor(4,60,"Fiat");
		Roda r10 = new Roda("T300",15,"Rodando");
		Roda r11 = new Roda("T300",15,"Rodando");
		Roda r12 = new Roda("T300",15,"Rodando");
		Roda r13 = new Roda("T300",15,"Rodando");
		Roda r14 = new Roda("T300",15,"Rodando");
		Roda[] rodas3 = {r10,r11,r12,r13,r14};
		Carro c3 = new Carro("Uno", "Fiat", 2001, 65120, m3, rodas3);
		Motor m4 = new Motor(4,80,"Fiat");
		Roda r15 = new Roda("T300",15,"Rodando");
		Roda r16 = new Roda("T300",15,"Rodando");
		Roda r17 = new Roda("T300",15,"Rodando");
		Roda r18 = new Roda("T300",15,"Rodando");
		Roda r19 = new Roda("T300",15,"Rodando");
		Roda[] rodas4 = {r15,r16,r17,r18,r19};
		Carro c4 = new Carro("Fiorino", "Fiat", 1998, 205123, m4, rodas4);
		Carro[] carros2 = {c3,c4};
		Endereco end3 = new Endereco("Rua Lavrada", 1001, "Roçado");
		Endereco end4 = new Endereco("Rua Surja", 1470, "Roçado");
		Endereco[] enderecos2 = {end3, end4};
		Documento doc2 = new Documento("98765432107", "98765432");
		Pessoa p2 = new Pessoa("Judite", 32, doc2, enderecos2, carros2);
		
		Pessoa[] pessoas = {p1,p2};
		
		String modelo = "";
		int ano = 0;
		for(int i = 0; i < pessoas.length; i++) {
			for(int j = 0; j < pessoas[i].getCarros().length; j++) {
				if(pessoas[i].getCarros()[j].getAno() > ano) {
					ano = pessoas[i].getCarros()[j].getAno();
					modelo = pessoas[i].getCarros()[j].getModelo();
				}
			}
		}
		System.out.println("Carro mais novo: " + "\nModelo: " + modelo + "\nAno: " + ano);
		
		double potencia = 0;
		String modelo1 = "";
		String nomePessoa = "";
		for(int i = 0; i < pessoas.length; i++) {
			for(int j = 0; j < pessoas[i].getCarros().length; j++) {
				if(pessoas[i].getCarros()[j].getMotor().getPotencia() > potencia) {
					potencia = pessoas[i].getCarros()[j].getMotor().getPotencia();
					modelo1 = pessoas[i].getCarros()[j].getModelo();
					nomePessoa = pessoas[i].getNome();
				}
			}
		}
		System.out.println("\nCarro com maior potencia:" + "\nDono: " + nomePessoa + "\nModelo do carro: " + modelo1 + "\nPotencia do motor: " + potencia);		
		
		int idade = 200;
		String rg = "";
		String cpf = "";
		for(int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].getIdade() < idade) {
				idade = pessoas[i].getIdade();
				nomePessoa = pessoas[i].getNome();
				rg = pessoas[i].getDoc().getRg();
				cpf = pessoas[i].getDoc().getCpf();	
			}
		}
		System.out.println("\nPessoa mais nova:" + "\nNome: " + nomePessoa + "\nRG: " + rg + "\nCPF: " + cpf);
		
		int idadeZero = 0;
		String rua = "";
		String bairro = "";
		int numero = 0;
		for(int i = 0; i < pessoas.length; i++) {
			for(int j = 0; j < pessoas[i].getEnderecos().length; j++)
				if(pessoas[i].getIdade() > idadeZero) {
					idadeZero = pessoas[i].getIdade();
					nomePessoa = pessoas[i].getNome();
					rua = pessoas[i].getEnderecos()[j].getRua();
					bairro = pessoas[i].getEnderecos()[j].getBairro();
					numero = pessoas[i].getEnderecos()[j].getNumero();
			}
		}
		System.out.println("\nPessoa mais velha:" + "\nNome: " + nomePessoa + "\nEndereço" + "\nRua: " + rua + "\nBairro: " + bairro + "\nNúmero: " + numero);

	}
}
