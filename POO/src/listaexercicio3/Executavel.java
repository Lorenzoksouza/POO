package listaexercicio3;

public class Executavel {

	public static void main(String[] args) {
		
		Endereco enderecoSenac = new Endereco("Rua Silava Jardim", 360, "Centro", "Florianópolis", "SC");
		Endereco enderecoAna = new Endereco("Rua das Acácias", 200, "Campinas", "São Jóse", "SC");
		Endereco enderecoCarla = new Endereco("Rua das Margaridas", 34, "Ingelses", "Florianópolis", "SC");
		Endereco enderecoCintia = new Endereco("Rua das Rosas", 1150, "Aririú", "Palhoça", "SC");
		Endereco enderecoBruna = new Endereco("Rua das Esmeraldas", 522, "Pedra branca", "Palhoça", "SC");
		Endereco enderecoZeca = new Endereco("Rua das Figueiras", 16, "Estreito", "Florianópolis", "SC");
		Endereco enderecoPedro = new Endereco("Rua dos Eucaliptos", 1255, "Barreiros", "São Jóse", "SC");
		Endereco enderecoPaulo = new Endereco("Rua dos Diamantes", 9, "Centro", "Biguaçu", "SC");

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
		
		int somaIdadeRH = 0;
		int somaIdadeComercial = 0;
		Pessoa maisNovaRH = new Pessoa();
		Pessoa maisNovaComercial = new Pessoa();
		Pessoa maisVelhaRH = new Pessoa();
		Pessoa maisVelhaComercial = new Pessoa();
		
		for (int i = 0; i < senac.getDepartamentos().length; i++) {
			if (senac.getDepartamentos()[i] == depRh) {
				int menorIdade = senac.getDepartamentos()[i].getPessoas()[1].getIdade();
				int maiorIdade = senac.getDepartamentos()[i].getPessoas()[1].getIdade();
				for (int j = 0; j < senac.getDepartamentos()[i].getPessoas().length; j++) {
					somaIdadeRH = somaIdadeRH + senac.getDepartamentos()[i].getPessoas()[j].getIdade();
					if (senac.getDepartamentos()[i].getPessoas()[j].getIdade() < menorIdade) {
						menorIdade = senac.getDepartamentos()[i].getPessoas()[j].getIdade();
						maisNovaRH = senac.getDepartamentos()[i].getPessoas()[j];
					}else { if(senac.getDepartamentos()[i].getPessoas()[j].getIdade() > maiorIdade){
						maiorIdade = senac.getDepartamentos()[i].getPessoas()[j].getIdade();
						maisVelhaRH = senac.getDepartamentos()[i].getPessoas()[j];
						}
					}
				}
			}else {
				int menorIdade = senac.getDepartamentos()[i].getPessoas()[1].getIdade();
				int maiorIdade = senac.getDepartamentos()[i].getPessoas()[1].getIdade();
				for (int j = 0; j < senac.getDepartamentos()[i].getPessoas().length; j++) {
					somaIdadeComercial = somaIdadeComercial + senac.getDepartamentos()[i].getPessoas()[j].getIdade();
					if (senac.getDepartamentos()[i].getPessoas()[j].getIdade() < menorIdade) {
						menorIdade = senac.getDepartamentos()[i].getPessoas()[j].getIdade();
						maisNovaComercial = senac.getDepartamentos()[i].getPessoas()[j];
					}else { if(senac.getDepartamentos()[i].getPessoas()[j].getIdade() > maiorIdade){
						maiorIdade = senac.getDepartamentos()[i].getPessoas()[j].getIdade();
						maisVelhaComercial = senac.getDepartamentos()[i].getPessoas()[j];
						}
					}
				}
			}
		}
		//Questão 6
		System.out.println("Somatorio das idades dos funcionarios do RH: " + somaIdadeRH);
		System.out.println("Somatorio das idades dos funcionarios do Comercial: " + somaIdadeComercial);
		System.out.println("Somatorio das idades de todos os funcionarios da empresa: " + (somaIdadeComercial + somaIdadeRH));
		
		//Questão 7 ?error?
		System.out.println("\nA pessoa mais nova do RH" + maisNovaRH);
		System.out.println("\nA pessoa mais Velha do RH" + maisVelhaRH);
		System.out.println("\nA pessoa mais nova do comercial" + maisNovaComercial);
		System.out.println("\nA pessoa mais Velha do comercial" + maisVelhaComercial);

		//Questão 8
		int menorIdadeEmpresa = senac.getDepartamentos()[1].getPessoas()[1].getIdade();
		int maiorIdadeEmpresa = senac.getDepartamentos()[1].getPessoas()[1].getIdade();
		Pessoa maisNovaEmpresa = new Pessoa();
		Pessoa maisVelhaEmpresa = new Pessoa();
		for (int i = 0; i < senac.getDepartamentos().length; i++) {
			for (int j = 0; j < senac.getDepartamentos()[i].getPessoas().length; j++) {
				if (senac.getDepartamentos()[i].getPessoas()[j].getIdade() < menorIdadeEmpresa) {
					menorIdadeEmpresa = senac.getDepartamentos()[i].getPessoas()[j].getIdade();
					maisNovaEmpresa = senac.getDepartamentos()[i].getPessoas()[j];
				} else if (senac.getDepartamentos()[i].getPessoas()[j].getIdade() > maiorIdadeEmpresa){
					maiorIdadeEmpresa = senac.getDepartamentos()[i].getPessoas()[j].getIdade();
					maisVelhaEmpresa = senac.getDepartamentos()[i].getPessoas()[j]; 
				}
			}
		}
		
		System.out.println("\nA pessoa mais nova da empresa" + maisNovaEmpresa);
		System.out.println("\nA pessoa mais velha da empresa" + maisVelhaEmpresa);

		//Questão 9
		int contHomemRH = 0;
		int contMulherRH = 0;
		int contHomemComercial = 0;
		int contMulherComercial = 0;
		for (int i = 0; i < senac.getDepartamentos().length; i++) {
			if (senac.getDepartamentos()[i] == depRh) {
				for (int j = 0; j < senac.getDepartamentos()[i].getPessoas().length; j++) {
					if (senac.getDepartamentos()[i].getPessoas()[j].getSexo() == "M") {
						contHomemRH = contHomemRH + 1;
					} else {
						contMulherRH = contMulherRH + 1;
					}	
				}  
				}else if (senac.getDepartamentos()[i] == depComercial){
					for (int j = 0; j < senac.getDepartamentos()[i].getPessoas().length; j++) {
					if (senac.getDepartamentos()[i].getPessoas()[j].getSexo() == "M") {
						contHomemComercial = contHomemComercial + 1;
					} else {
						contMulherComercial = contMulherComercial + 1;
					}	
				}
			}
		}
		System.out.println("\nTotal de homens no RH " + contHomemRH);
		System.out.println("Total de mulheres no RH " + contMulherRH);
		System.out.println("Total de homens no Comercial " + contHomemComercial);
		System.out.println("Total de mulheres no Comercial " + contMulherComercial);
		System.out.println("Total de homens na empresa " + contHomemRH + contHomemComercial);
		System.out.println("Total de mulheres na empresa " + contMulherRH + contMulherComercial);
		
		//Questão 10 ?incomplete?
		String cidade = "";
		for (int i = 0; i < senac.getDepartamentos().length; i++) {
			for (int j = 0; j < senac.getDepartamentos()[i].getPessoas().length; j++) {
				if (senac.getDepartamentos()[i].getPessoas()[j].getEnderecoPessoa().getCidade() == "Florianópolis") {
					cidade = senac.getDepartamentos()[i].getPessoas()[j].getEnderecoPessoa().getCidade();
					System.out.println("\nMorador de " + cidade);
					System.out.println(senac.getDepartamentos()[i].getPessoas()[j].getNome());
					System.out.println(senac.getDepartamentos()[i].getPessoas()[j].getEnderecoPessoa());

				}
			}
		}
		
	}
}

