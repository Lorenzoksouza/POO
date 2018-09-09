package exemploOO;

import java.util.Random;
import java.util.Scanner;

public class ProgramaMeusBens {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner tec = new Scanner(System.in);		
		Pessoa p1 = new Pessoa();
		Bens meusBens = new Bens();
		 
		System.out.print("Digite o nome: ");
		p1.setNome(tec.next());
		System.out.print("Digite o CPF: ");
		p1.setCPF(tec.next());
		System.out.print("Digite sua idade: ");
		p1.setIdade(tec.nextInt());
		p1.setCapacidadeFinanceira(random.nextInt(500000));
		
		Carro carro = new Carro();
		carro.setFabricante("Lamborghinni");
		carro.setModelo("Gallardo");
		carro.setAno(2018);
		carro.setCor("Verde Neon");
		carro.setValor(random.nextInt(1000000));
		double CapacidadeFinanceira = p1.getCapacidadeFinanceira();
		
		if (CapacidadeFinanceira > carro.getValor()) {
			 CapacidadeFinanceira = CapacidadeFinanceira - carro.getValor();
			 meusBens.setCarro(carro);
		}
		
		Moto moto = new Moto();
		moto.setFabricante("Honda");
		moto.setModelo("CBR 1000RR");
		moto.setAno(2018);
		moto.setCor("Preto");
		moto.setValor(random.nextInt(70000));
		if (CapacidadeFinanceira > moto.getValor()) {
			 CapacidadeFinanceira = CapacidadeFinanceira - moto.getValor();
			 meusBens.setMoto(moto);
		}
		
		Casa casa = new Casa();
		casa.setArea(100000);
		casa.setCor("Chumbo");
		casa.setValor(random.nextInt(500000));
		if (CapacidadeFinanceira > casa.getValor()) {
			 CapacidadeFinanceira = CapacidadeFinanceira - casa.getValor();
			 meusBens.setCasa(casa);
		}
		
		Apartamento apto = new Apartamento();
		apto.setArea(100);
		apto.setCor("Gelo");
		apto.setValor(random.nextInt(1000000));
		apto.setNumero(1012);
		apto.setNome("Germânia");
		if (CapacidadeFinanceira > apto.getValor()) {
			 CapacidadeFinanceira = CapacidadeFinanceira - apto.getValor();
			 meusBens.setApto(apto);
		}
		p1.setMeusBens(meusBens);
		System.out.println("Nome: " + p1.getNome());
		System.out.println("CPF: " + p1.getCPF());
		System.out.println("Idade: " + p1.getIdade());
		System.out.println("Finaças: " + p1.getCapacidadeFinanceira());
		System.out.println("Finaças após compras: " + CapacidadeFinanceira);
		System.out.println("==============================================");
		if (p1.getMeusBens().getCasa() != null) {
			System.out.println("Casa: " + p1.getMeusBens().getCasa().getValor());
		}else {
			System.out.println("Não possui Casa");
		}
		if (p1.getMeusBens().getCarro() != null) {
			System.out.println("Carro: " + p1.getMeusBens().getCarro().getValor());
		}else {
			System.out.println("Não possui Carro");
		}
		if (p1.getMeusBens().getMoto() != null) {
			System.out.println("Moto: " + p1.getMeusBens().getMoto().getValor());
		}else {
			System.out.println("Não possui Moto");
		}
		if (p1.getMeusBens().getApto() != null) {
			System.out.println("Apto: " + p1.getMeusBens().getApto().getValor());
		}else {
			System.out.println("Não possui Apto");
		}
		
	}
}