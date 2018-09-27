package listaexercicio3_corrigida;

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
		Endereco enderecoTavares = new Endereco("Rua das brom�lias", 305, "Santa M�nica", "Florian�polis", "SC");
		Endereco enderecoGuilherme = new Endereco("Rua dos rubis", 15, "Barreiros", "S�o J�se", "SC");
		Endereco enderecoLuana = new Endereco("Rua das ametistas", 5522, "Coqueiros", "Florian�polis", "SC");

		Pessoa funcionario1RH = new Pessoa("Ana", 23, "07158483828", "F", enderecoAna);
		Pessoa funcionario2RH = new Pessoa("Carla", 45, "01155083679", "F", enderecoCarla);		
		Pessoa funcionario3RH = new Pessoa("Cintia", 32, "22751485899", "F", enderecoCintia);
		Pessoa[] funcionariosRH = {funcionario1RH, funcionario2RH, funcionario3RH};
		
		Pessoa funcionario1Comercial = new Pessoa("Bruna", 29, "09876456781", "F", enderecoBruna);
		Pessoa funcionario2Comercial = new Pessoa("Zeca", 21, "02518492468", "M", enderecoZeca);		
		Pessoa funcionario3Comercial = new Pessoa("Pedro", 33, "00137512290", "M", enderecoPedro);
		Pessoa funcionario4Comercial = new Pessoa("Paulo", 41, "31277448765", "M", enderecoPaulo);
		Pessoa[] funcionariosComercial = {funcionario1Comercial, funcionario2Comercial, funcionario3Comercial, funcionario4Comercial};

		Pessoa funcionario1TI = new Pessoa("Tavares", 52, "44555283569", "M", enderecoTavares);
		Pessoa funcionario2TI = new Pessoa("Guilherme", 25, "30134585818;", "M", enderecoGuilherme);		
		Pessoa funcionario3TI = new Pessoa("Luana", 30, "78901485451;", "F", enderecoLuana);
		Pessoa[] funcionariosTI = {funcionario1TI, funcionario2TI, funcionario3TI};
		
		Departamento depRH = new Departamento("RH",funcionariosRH,50000.00);
		Departamento depComercial = new Departamento("Comercial",funcionariosComercial,220000.00);
		Departamento depTI = new Departamento("TI",funcionariosTI,75000.00);
		Departamento[] departamentos = {depRH, depComercial, depTI};
		
		
		Empresa senac = new Empresa("Senac Florian�polis","123456667890123456","www.sc.senac.br",departamentos,enderecoSenac);
		
		senac.calcularIdades();
	}
	

}
