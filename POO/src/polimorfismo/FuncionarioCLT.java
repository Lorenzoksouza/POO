package polimorfismo;

public class FuncionarioCLT extends Funcionario {
	
	public FuncionarioCLT() {
		super();
	}

	public FuncionarioCLT(String nome, int idade, int matricula) {
		super(nome, idade, matricula);
	}

	public double calculaPagamento() {
		double pagamento = 0;
		pagamento = 1000 * 2.5;
		return pagamento;
	}
}
