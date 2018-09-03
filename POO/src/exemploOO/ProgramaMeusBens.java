package exemploOO;

import java.util.Random;
import java.util.Scanner;

public class ProgramaMeusBens {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner tec = new Scanner(System.in);		
		Pessoa p1 = new Pessoa();
		
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
		
		Moto moto = new Moto();
		moto.setFabricante("Honda");
		moto.setModelo("CBR 1000RR");
		moto.setAno(2018);
		moto.setCor("Preto");
		moto.setValor(random.nextInt(70000));
		
		Casa casa = new Casa();
		casa.setArea(100000);
		casa.setCor("Chumbo");
		casa.setValor(random.nextInt(500000));
		
		
		Apartamento apto = new Apartamento();
		apto.setArea(100);
		apto.setCor("Gelo");
		apto.setValor(random.nextInt(1000000));
		apto.setNumero(1012);
		apto.setNome("Germânia");
		
		System.out.println("Nome: " + p1.getNome());
		System.out.println("CPF: " + p1.getCPF());
		System.out.println("Idade: " + p1.getIdade());
		System.out.println("Finaças: " + p1.getCapacidadeFinanceira());
		System.out.println("--------------------------------------------");
		System.out.println("Carro");
		System.out.println("Fabricante: " + carro.getFabricante());
		System.out.println("Modelo: " + carro.getModelo());
		System.out.println("Ano: " + carro.getAno());
		System.out.println("Cor: " + carro.getCor());
		System.out.println("Valor: " + carro.getValor());
		System.out.println("--------------------------------------------");
		System.out.println("Moto");
		System.out.println("Fabricante: " + moto.getFabricante());
		System.out.println("Modelo: " + moto.getModelo());
		System.out.println("Ano: " + moto.getAno());
		System.out.println("Cor: " + moto.getCor());
		System.out.println("Valor: " + moto.getValor());
		System.out.println("--------------------------------------------");
		System.out.println("Casa");
		System.out.println("Area: " + casa.getArea());
		System.out.println("Cor: " + casa.getCor());
		System.out.println("Valor: " + casa.getValor());
		System.out.println("--------------------------------------------");
		System.out.println("Apartamento");
		System.out.println("Area: " + apto.getArea());
		System.out.println("Cor: " + apto.getCor());
		System.out.println("Valor: " + apto.getValor());
		System.out.println("Numero: " + apto.getNumero());
		System.out.println("Nome do Condomínio: " + apto.getNome());
	}
}