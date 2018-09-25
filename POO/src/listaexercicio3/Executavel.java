package listaexercicio3;

public class Executavel {

	public static void main(String[] args) {
		Contato contatoAna = new Contato("98888-7788","84843741","ana@senac.com");
		Contato contatoCarla = new Contato("3229-8299","87935735","carla@senac.com");
		Contato contatoCintia = new Contato("6504-8173","57630391","cintia@senac.com");
		Contato contatoBruna = new Contato("3261-6557","68556030","bruna@senac.com");
		Contato contatoZeca = new Contato("4584-9078","15573377","zeca@senac.com");
		Contato contatoPedro = new Contato("9891-4518","51346109","pedro@senac.com");
		Contato contatoPaulo = new Contato("2675-9921","49395140","paulo@senac.com");
		Contato contatoTavares = new Contato("7639-1975","54996443","tavares@senac.com");
		Contato contatoGuilherme = new Contato("8268-2583","71566690","guilherme@senac.com");
		Contato contatoLuana = new Contato("3487-7453","88634565","luana@senac.com");

		
		Endereco enderecoSenac = new Endereco("Rua Silava Jardim", 360, "Centro", "Florianópolis", "SC");
		Endereco enderecoAna = new Endereco("Rua das Acácias", 200, "Campinas", "São Jóse", "SC");
		Endereco enderecoCarla = new Endereco("Rua das Margaridas", 34, "Ingelses", "Florianópolis", "SC");
		Endereco enderecoCintia = new Endereco("Rua das Rosas", 1150, "Aririú", "Palhoça", "SC");
		Endereco enderecoBruna = new Endereco("Rua das Esmeraldas", 522, "Pedra branca", "Palhoça", "SC");
		Endereco enderecoZeca = new Endereco("Rua das Figueiras", 16, "Estreito", "Florianópolis", "SC");
		Endereco enderecoPedro = new Endereco("Rua dos Eucaliptos", 1255, "Barreiros", "São Jóse", "SC");
		Endereco enderecoPaulo = new Endereco("Rua dos Diamantes", 9, "Centro", "Biguaçu", "SC");
		Endereco enderecoTavares = new Endereco("Rua das bromélias", 305, "Santa Mônica", "Florianópolis", "SC");
		Endereco enderecoGuilherme = new Endereco("Rua dos rubis", 15, "Barreiros", "São Jóse", "SC");
		Endereco enderecoLuana = new Endereco("Rua das ametistas", 5522, "Coqueiros", "Florianópolis", "SC");

		Gerente gerenteRH = new Gerente(contatoAna,"Ana", 23, "07158483828", "F", enderecoAna,100);
		Funcionario funcionario2RH = new Funcionario(contatoCarla,"Carla", 45, "01155083679", "F", enderecoCarla,100);		
		Funcionario funcionario3RH = new Funcionario(contatoCintia,"Cintia", 32, "22751485899", "F", enderecoCintia,100);
		Funcionario[] funcionariosRH = {gerenteRH, funcionario2RH, funcionario3RH};
		
		Funcionario funcionario1Comercial = new Funcionario(contatoBruna,"Bruna", 29, "09876456781", "F", enderecoBruna,100);
		Funcionario funcionario2Comercial = new Funcionario(contatoZeca,"Zeca", 21, "02518492468", "M", enderecoZeca,100);		
		Funcionario funcionario3Comercial = new Funcionario(contatoPedro,"Pedro", 33, "00137512290", "M", enderecoPedro,100);
		Gerente gerenteComercial = new Gerente(contatoPaulo,"Paulo", 41, "31277448765", "M", enderecoPaulo,100);
		Funcionario[] funcionariosComercial = {funcionario1Comercial, funcionario2Comercial, funcionario3Comercial, gerenteComercial};

		Gerente gerenteTI = new Gerente(contatoTavares,"Tavares", 52, "44555283569", "M", enderecoTavares,100);
		Funcionario funcionario2TI = new Funcionario(contatoGuilherme,"Guilherme", 25, "30134585818;", "M", enderecoGuilherme,100);		
		Funcionario funcionario3TI = new Funcionario(contatoLuana,"Luana", 30, "78901485451;", "F", enderecoLuana,100);
		Funcionario[] funcionariosTI = {gerenteTI, funcionario2TI, funcionario3TI};
		
		Departamento depRH = new Departamento();
		depRH.setArea("RH");
		depRH.setFuncionario(funcionariosRH);
		depRH.setMeta(50000.00);
		Departamento depComercial = new Departamento();
		depComercial.setArea("Comercial");
		depComercial.setFuncionario(funcionariosComercial);
		depComercial.setMeta(220000.00);
		Departamento depTI = new Departamento();
		depTI.setArea("TI");
		depTI.setFuncionario(funcionariosTI);
		depTI.setMeta(75000.00);
		Departamento[] departamentos = {depRH, depComercial, depTI};
		
		Empresa senac = new Empresa();
		senac.setNome("Senac");
		senac.setCnpj("123456667890123456");
		senac.setSite("www.sc.senac.br");
		senac.setDepartamentos(departamentos);
		senac.setEnderecoEmpresa(enderecoSenac);
		
		senac.somarPessoasEmpresa();
		senac.identificarMaisNovaEMaisVelhaPorDepartamento();
		senac.identificarMaisNovaEMaisVelhaEmpresa();
		senac.contarPessoasPorSexo();
		senac.identificarPessoaPorCidade("Florianópolis");
		senac.calcularImpostoEmpresa();
		senac.calcularSalarioTotal();
		senac.totalizarMetas();
	}
}


