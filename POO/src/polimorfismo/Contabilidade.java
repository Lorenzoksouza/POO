package polimorfismo;

public class Contabilidade {

	public void gerarDemonstrativo(Funcionario func){
		System.out.println("O(a) funcionario(a): " + func.getNome());
		System.out.println("Recebeu o pagamento de " + func.calculaPagamento() + " reais");
	}
}
