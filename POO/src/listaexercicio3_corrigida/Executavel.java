package listaexercicio3_corrigida;


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

		Gerente GerenteRH = new Gerente("Ana", 23, "07158483828", "F", enderecoAna, contatoAna, 1000.00);
		Funcionario funcionario2RH = new Funcionario("Carla", 45, "01155083679", "F", enderecoCarla, contatoCarla, 2000.00);		
		Funcionario funcionario3RH = new Funcionario("Cintia", 32, "22751485899", "F", enderecoCintia, contatoCintia, 3000.00);
		Funcionario[] funcionariosRH = {funcionario2RH, funcionario3RH};
		
		Funcionario funcionario1Comercial = new Funcionario("Bruna", 29, "09876456781", "F", enderecoBruna, contatoBruna, 4000.00);
		Funcionario funcionario2Comercial = new Funcionario("Zeca", 21, "02518492468", "M", enderecoZeca, contatoZeca, 5000.00);		
		Funcionario funcionario3Comercial = new Funcionario("Pedro", 33, "00137512290", "M", enderecoPedro, contatoPedro, 6000.00);
		Gerente GerenteComercial = new Gerente("Paulo", 41, "31277448765", "M", enderecoPaulo, contatoPaulo, 7000.00);
		Funcionario[] funcionariosComercial = {funcionario1Comercial, funcionario2Comercial, funcionario3Comercial};

		Gerente GerenteTI = new Gerente("Tavares", 52, "44555283569", "M", enderecoTavares, contatoTavares, 8000.00);
		Funcionario funcionario2TI = new Funcionario("Guilherme", 25, "30134585818;", "M", enderecoGuilherme, contatoGuilherme, 9000.00);		
		Funcionario funcionario3TI = new Funcionario("Luana", 30, "78901485451;", "F", enderecoLuana, contatoLuana, 10000.00);
		Funcionario[] funcionariosTI = {funcionario2TI, funcionario3TI};
		
		Departamento depRH = new Departamento("RH",funcionariosRH,GerenteRH,-50000.00);
		Departamento depComercial = new Departamento("Comercial",funcionariosComercial,GerenteComercial,-220000.00);
		Departamento depTI = new Departamento("TI",funcionariosTI,GerenteTI,-75000.00);
		Departamento[] departamentos = {depRH, depComercial, depTI};
		
		
		Empresa senac = new Empresa("Senac Florianópolis","123456667890123456","www.sc.senac.br",departamentos,enderecoSenac);
		
		senac.calcularIdades();
		senac.identificarPessoaMaisNovaMaisVelhaPorDepartamento(); 
		senac.identificarPessoaMaisNovaMaisVelha(); 
		senac.quantidadeHomensMulheresPorDepartamento();
		senac.quantidadeHomensMulheres();
		senac.localizarPessoasPorCidade("Florianópolis");
		senac.calculaImposto();
		senac.calculaSalarioBruto();
		senac.calculaSalarioBrutoIndividual();
		senac.calculaSalarioLiquidoIndividual();
		senac.contabilizarMetas();
	}
}
