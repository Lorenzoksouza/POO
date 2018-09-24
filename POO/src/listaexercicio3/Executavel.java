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
		Endereco enderecoTavares = new Endereco("Rua das brom�lias", 305, "Santa M�nica", "Florian�pois", "SC");
		Endereco enderecoGuilherme = new Endereco("Rua dos rubis", 15, "Barreiros", "S�o J�se", "SC");
		Endereco enderecoLuana = new Endereco("Rua das ametistas", 5522, "Coqueiros", "Florian�pois", "SC");

		Gerente funcionario1RH = new Gerente("Ana", 23, "07158483828", "F", enderecoAna,100);
		Funcionario funcionario2RH = new Funcionario("Carla", 45, "01155083679", "F", enderecoCarla,100);		
		Funcionario funcionario3RH = new Funcionario("Cintia", 32, "22751485899", "F", enderecoCintia,100);
		Funcionario[] funcionariosRH = {funcionario1RH, funcionario2RH, funcionario3RH};
		
		Funcionario funcionario1Comercial = new Funcionario("Bruna", 29, "09876456781", "F", enderecoBruna,100);
		Funcionario funcionario2Comercial = new Funcionario("Zeca", 21, "02518492468", "M", enderecoZeca,100);		
		Funcionario funcionario3Comercial = new Funcionario("Pedro", 33, "00137512290", "M", enderecoPedro,100);
		Gerente funcionario4Comercial = new Gerente("Paulo", 41, "31277448765", "M", enderecoPaulo,100);
		Funcionario[] funcionariosComercial = {funcionario1Comercial, funcionario2Comercial, funcionario3Comercial, funcionario4Comercial};

		Gerente funcionario1TI = new Gerente("Tavares", 52, "44555283569", "M", enderecoTavares,100);
		Funcionario funcionario2TI = new Funcionario("Guilherme", 25, "30134585818;", "M", enderecoGuilherme,100);		
		Funcionario funcionario3TI = new Funcionario("Luana", 30, "78901485451;", "F", enderecoLuana,100);
		Funcionario[] funcionariosTI = {funcionario1TI, funcionario2TI, funcionario3TI};
		
		Departamento depRH = new Departamento();
		depRH.setArea("RH");
		depRH.setFuncionario(funcionariosRH);
		depRH.setMeta(50000.00);
		Departamento depComercial = new Departamento();
		depComercial.setArea("Comercial");
		depComercial.setFuncionario(funcionariosComercial);
		depComercial.setMeta(220000.00);
		Departamento depTI = new Departamento(funcionariosTI, "TI", 75000.00);
		Departamento[] departamentos = {depRH, depComercial, depTI};
		
		Empresa senac = new Empresa();
		senac.setNome("Senac");
		senac.setCnpj("123456667890123456");
		senac.setSite("www.sc.senac.br");
		senac.setDepartamentos(departamentos);
		senac.setEnderecoEmpresa(enderecoSenac);
		
		
		senac.somarPessoasEmpresa();
		senac.identificarMaisNovaEMaisVelhaPorDepartamento();
		senac.identificar
		
		//Quest 8
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

		//Quest 9
		int contHomemRH = 0;
		int contMulherRH = 0;
		int contHomemComercial = 0;
		int contMulherComercial = 0;
		for (int i = 0; i < senac.getDepartamentos().length; i++) {
			if (senac.getDepartamentos()[i] == depRH) {
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
		
		//Quest 10 ?incomplete?
		String cidade = "";
		for (int i = 0; i < senac.getDepartamentos().length; i++) {
			for (int j = 0; j < senac.getDepartamentos()[i].getFuncionario().length; j++) {
				if (senac.getDepartamentos()[i].getFuncionario()[j].getEnderecoFuncionario().getCidade() == "Florian�polis") {
					cidade = senac.getDepartamentos()[i].getFuncionario()[j].getEnderecoFuncionario().getCidade();
					System.out.println("\nMorador de " + cidade);
					System.out.println(senac.getDepartamentos()[i].getFuncionario()[j].getNome());
					System.out.println(senac.getDepartamentos()[i].getFuncionario()[j].getEnderecoFuncionario());

				}
			}
		}
		//Quest 11 D ?confirm?
		double impostosEmpresa = 0;
		for (int i = 0; i < senac.getDepartamentos().length; i++) {
			for (int j = 0; j < senac.getDepartamentos()[i].getFuncionario().length; j++) {
				impostosEmpresa = impostosEmpresa + (senac.getDepartamentos()[i].getFuncionario()[j].getSalario() * 0.9);
			}
		}
		System.out.println("\nTotal de imposto pagos pela empresa: " + impostosEmpresa);
		
		for (int i = 0; i < senac.getDepartamentos().length; i++) {
			for (int j = 0; j < senac.getDepartamentos()[i].getFuncionario().length; j++) {
				senac.getDepartamentos()[i].getFuncionario()[j].getSalario();
			
			
			
			}
		}
		
		// F
		double metaTotal = 0;
		for (int i = 0; i < senac.getDepartamentos().length; i++) {
			metaTotal = metaTotal + senac.getDepartamentos()[i].getMeta();
			}
		System.out.println("\nSomatorio das metas dos departamentos: " + metaTotal);
		
		//
	}
}


