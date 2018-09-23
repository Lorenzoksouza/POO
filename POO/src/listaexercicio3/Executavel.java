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

		Gerente funcionario1RH = new Gerente("Ana", 23, "07158483828", "F", enderecoAna,100, 100);
		Funcionario funcionario2RH = new Funcionario("Carla", 45, "01155083679", "F", enderecoCarla,100);		
		Funcionario funcionario3RH = new Funcionario("Cintia", 32, "22751485899", "F", enderecoCintia,0);
		Funcionario[] funcionariosRH = {funcionario1RH, funcionario2RH, funcionario3RH};
		
		Funcionario funcionario1Comercial = new Funcionario("Bruna", 29, "09876456781", "F", enderecoBruna,0);
		Funcionario funcionario2Comercial = new Funcionario("Zeca", 21, "02518492468", "M", enderecoZeca,0);		
		Funcionario funcionario3Comercial = new Funcionario("Pedro", 33, "00137512290", "M", enderecoPedro,0);
		Funcionario funcionario4Comercial = new Funcionario("Paulo", 41, "31277448765", "M", enderecoPaulo,0);
		Funcionario[] funcionariosComercial = {funcionario1Comercial, funcionario2Comercial, funcionario3Comercial, funcionario4Comercial};

		Departamento depRh = new Departamento();
		depRh.setArea("RH");
		depRh.setFuncionario(funcionariosRH);
		Departamento depComercial = new Departamento();
		depComercial.setArea("Comercial");
		depComercial.setFuncionario(funcionariosComercial);
		Departamento[] departamentos = {depRh, depComercial};
		
		Empresa senac = new Empresa();
		senac.setNome("Senac");
		senac.setCnpj("123456667890123456");
		senac.setSite("www.sc.senac.br");
		senac.setDepartamentos(departamentos);
		senac.setEnderecoEmpresa(enderecoSenac);
		
		int somaIdadeRH = 0;
		int somaIdadeComercial = 0;
		Funcionario maisNovaRH = new Funcionario();
		Funcionario maisNovaComercial = new Funcionario();
		Funcionario maisVelhaRH = new Funcionario();
		Funcionario maisVelhaComercial = new Funcionario();
		
		for (int i = 0; i < senac.getDepartamentos().length; i++) {
			if (senac.getDepartamentos()[i] == depRh) {
				int menorIdade = senac.getDepartamentos()[i].getFuncionario()[1].getIdade();
				int maiorIdade = senac.getDepartamentos()[i].getFuncionario()[1].getIdade();
				for (int j = 0; j < senac.getDepartamentos()[i].getFuncionario().length; j++) {
					somaIdadeRH = somaIdadeRH + senac.getDepartamentos()[i].getFuncionario()[j].getIdade();
					if (senac.getDepartamentos()[i].getFuncionario()[j].getIdade() < menorIdade) {
						menorIdade = senac.getDepartamentos()[i].getFuncionario()[j].getIdade();
						maisNovaRH = senac.getDepartamentos()[i].getFuncionario()[j];
					}else { if(senac.getDepartamentos()[i].getFuncionario()[j].getIdade() > maiorIdade){
						maiorIdade = senac.getDepartamentos()[i].getFuncionario()[j].getIdade();
						maisVelhaRH = senac.getDepartamentos()[i].getFuncionario()[j];
						}
					}
				}
			}else {
				int menorIdade = senac.getDepartamentos()[i].getFuncionario()[1].getIdade();
				int maiorIdade = senac.getDepartamentos()[i].getFuncionario()[1].getIdade();
				for (int j = 0; j < senac.getDepartamentos()[i].getFuncionario().length; j++) {
					somaIdadeComercial = somaIdadeComercial + senac.getDepartamentos()[i].getFuncionario()[j].getIdade();
					if (senac.getDepartamentos()[i].getFuncionario()[j].getIdade() < menorIdade) {
						menorIdade = senac.getDepartamentos()[i].getFuncionario()[j].getIdade();
						maisNovaComercial = senac.getDepartamentos()[i].getFuncionario()[j];
					}else { if(senac.getDepartamentos()[i].getFuncionario()[j].getIdade() > maiorIdade){
						maiorIdade = senac.getDepartamentos()[i].getFuncionario()[j].getIdade();
						maisVelhaComercial = senac.getDepartamentos()[i].getFuncionario()[j];
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
		int menorIdadeEmpresa = senac.getDepartamentos()[1].getFuncionario()[1].getIdade();
		int maiorIdadeEmpresa = senac.getDepartamentos()[1].getFuncionario()[1].getIdade();
		Funcionario maisNovaEmpresa = new Funcionario();
		Funcionario maisVelhaEmpresa = new Funcionario();
		for (int i = 0; i < senac.getDepartamentos().length; i++) {
			for (int j = 0; j < senac.getDepartamentos()[i].getFuncionario().length; j++) {
				if (senac.getDepartamentos()[i].getFuncionario()[j].getIdade() < menorIdadeEmpresa) {
					menorIdadeEmpresa = senac.getDepartamentos()[i].getFuncionario()[j].getIdade();
					maisNovaEmpresa = senac.getDepartamentos()[i].getFuncionario()[j];
				} else if (senac.getDepartamentos()[i].getFuncionario()[j].getIdade() > maiorIdadeEmpresa){
					maiorIdadeEmpresa = senac.getDepartamentos()[i].getFuncionario()[j].getIdade();
					maisVelhaEmpresa = senac.getDepartamentos()[i].getFuncionario()[j]; 
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
				for (int j = 0; j < senac.getDepartamentos()[i].getFuncionario().length; j++) {
					if (senac.getDepartamentos()[i].getFuncionario()[j].getSexo() == "M") {
						contHomemRH = contHomemRH + 1;
					} else {
						contMulherRH = contMulherRH + 1;
					}	
				}  
				}else if (senac.getDepartamentos()[i] == depComercial){
					for (int j = 0; j < senac.getDepartamentos()[i].getFuncionario().length; j++) {
					if (senac.getDepartamentos()[i].getFuncionario()[j].getSexo() == "M") {
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
		System.out.println("Total de homens na empresa " + (contHomemRH + contHomemComercial));
		System.out.println("Total de mulheres na empresa " + (contMulherRH + contMulherComercial));
		
		//Questão 10 ?incomplete?
		String cidade = "";
		for (int i = 0; i < senac.getDepartamentos().length; i++) {
			for (int j = 0; j < senac.getDepartamentos()[i].getFuncionario().length; j++) {
				if (senac.getDepartamentos()[i].getFuncionario()[j].getEnderecoFuncionario().getCidade() == "Florianópolis") {
					cidade = senac.getDepartamentos()[i].getFuncionario()[j].getEnderecoFuncionario().getCidade();
					System.out.println("\nMorador de " + cidade);
					System.out.println(senac.getDepartamentos()[i].getFuncionario()[j].getNome());
					System.out.println(senac.getDepartamentos()[i].getFuncionario()[j].getEnderecoFuncionario());

				}
			}
		}
		
		//Questão 11 D
		for (int i = 0; i < senac.getDepartamentos().length; i++) {
			for (int j = 0; j < senac.getDepartamentos()[i].getFuncionario().length; j++) {
				
				
				
				
			}
		}
		
	}
}

