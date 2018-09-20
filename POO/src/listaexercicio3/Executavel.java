package listaexercicio3;

public class Executavel {

	public static void main(String[] args) {
		
		Endereco enderecoSenac = new Endereco("Rua Silava Jardim", 360, "Centro", "Florian�polis", "SC");
		Endereco enderecoAna = new Endereco("Rua das Ac�cias", 200, "Campinas", "S�o J�se", "SC");
		Endereco enderecoCarla = new Endereco("Rua das Margaridas", 34, "Ingelses", "Florian�polis", "SC");
		Endereco enderecoCintia = new Endereco("Rua das Rosas", 1150, "Ariri�", "Palho�a", "SC");
		Endereco enderecoBruna = new Endereco("Rua das Esmeraldas", 522, "Pedra branca", "Palho�a", "SC");
		Endereco enderecoZeca = new Endereco("Rua das Figueiras", 16, "Estreito", "Florian�polis", "SC");
		Endereco enderecoPedro = new Endereco("Rua dos Eucaliptos", 1255, "Barreiros", "S�o J�se", "SC");
		Endereco enderecoPaulo = new Endereco("Rua dos Diamantes", 9, "Centro", "Bigua�u", "SC");

		Pessoa funcionario1RH = new Pessoa("Ana", 23, "07158483828", "F", enderecoAna);
		Pessoa funcionario2RH = new Pessoa("Carla", 45, "01155083679", "F", enderecoCarla);		
		Pessoa funcionario3RH = new Pessoa("Cintia", 32, "22751485899", "F", enderecoCintia);
		Pessoa[] funcionariosRH = {funcionario1RH, funcionario2RH, funcionario3RH};
		
		Pessoa funcionario1Comercial = new Pessoa("Bruna", 29, "09876456781", "F", enderecoBruna);
		Pessoa funcionario2Comercial = new Pessoa("Zeca", 21, "02518492468", "M", enderecoZeca);		
		Pessoa funcionario3Comercial = new Pessoa("Pedro", 33, "00137512290", "M", enderecoPedro);
		Pessoa funcionario4Comercial = new Pessoa("Paulo", 41, "31277448765", "M", enderecoPaulo);
		Pessoa[] funcionariosComercial = {funcionario1Comercial, funcionario2Comercial, funcionario3Comercial, funcionario4Comercial};

		Departamento depRh = new Departamento();
		depRh.setArea("RH");
		depRh.setPessoas(funcionariosRH);
		Departamento depComercial = new Departamento();
		depComercial.setArea("Comercial");
		depComercial.setPessoas(funcionariosComercial);
		Departamento[] departamentos = {depRh, depComercial};
		
		Empresa senac = new Empresa();
		senac.setNome("Senac");
		senac.setCnpj("123456667890123456");
		senac.setSite("www.sc.senac.br");
		senac.setDepartamentos(departamentos);
		senac.setEnderecoEmpresa(enderecoSenac);
		
		int idadeRH = 0;
		int idadeComercial = 0;
		for (int i = 0; i < senac.getDepartamentos().length; i++) {
			if (senac.getDepartamentos()[i].getArea() == "RH") {
				for (int j = 0; j < senac.getDepartamentos()[i].getPessoas().length; j++) {
					idadeRH = idadeRH + senac.getDepartamentos()[i].getPessoas()[j].getIdade();
					System.out.println(idadeRH);
				}
			}else {
				for (int j = 0; j < senac.getDepartamentos()[i].getPessoas().length; j++) {
					idadeComercial = idadeComercial + senac.getDepartamentos()[i].getPessoas()[j].getIdade();
					System.out.println(idadeComercial);
				}
			
			
		
	
	
	
			}
	
		}
		}
	}

