package listaexercicio3;

public class Executavel {

	public static void main(String[] args) {
		
		
		Departamento depRh = new Departamento("RH");
		Departamento depComercial = new Departamento("Comercial");
		Departamento[] departamentos = {depRh, depComercial};
		
		Pessoa funcionario1RH = new Pessoa();
		Pessoa funcionario2RH = new Pessoa();		
		Pessoa funcionario3RH = new Pessoa();
		
		Pessoa funcionario1Comercial = new Pessoa();
		Pessoa funcionario2Comercial = new Pessoa();		
		Pessoa funcionario3Comercial = new Pessoa();
		Pessoa funcionario4Comercial = new Pessoa();

		Endereco enderecoSenac = new Endereco("Rua Silava Jardim", 360, "Centro", "Florianópolis", "SC");
		
		Empresa senac = new Empresa();
		senac.setNome("Senac");
		senac.setCnpj("123456667890123456");
		senac.setSite("www.sc.senac.br");
		senac.setDepartamentos(departamentos);
		senac.setEnderecoEmpresa(enderecoSenac);
		
		
		
		
	}

}
