package exemploOO;

import java.util.Scanner;

public class MenuCalculadora {
	
	Scanner tec = new Scanner(System.in);

	public void apresentarMenu() {
		System.out.println("Menu Calculadora");
		System.out.println("Opções: ");
		System.out.println("1 - Somar");
		System.out.println("2 - Subtrair");
		System.out.println("3 - Multiplicar");
		System.out.println("4 - Dividir");
		System.out.println("5 - Sair");
		System.out.print("Digite uma opção: ");
		int opcao = tec.nextInt();
		
		while (opcao != 5) {
			switch(opcao) {
				case 1:{
					this.somar();
					break;
				}
				case 2:{
					this.subtrair();
					break;
				}
				case 3:{
					this.multiplicar();
					break;
				}
				case 4:{
					this.dividir();
					break;
				}
				default: {
					System.out.println("Opção invalida.");
				}
			}
			System.out.println("\nMenu Calculadora");
			System.out.println("Opções: ");
			System.out.println("1 - Somar");
			System.out.println("2 - Subtrair");
			System.out.println("3 - Multiplicar");
			System.out.println("4 - Dividir");
			System.out.println("5 - Sair");
			System.out.print("Digite uma opção: ");
			opcao = tec.nextInt();
		
		}
		
	}

	private void dividir() {
		System.out.print("Digite o dividendo : ");
		double dividendo = tec.nextDouble();
		System.out.print("Digite o divisor: ");
		double divisor = tec.nextDouble();
		Calculadora calculadora = new Calculadora();
		System.out.println("Resultado: " + calculadora.dividir(dividendo,divisor));
	}
	private void multiplicar() {
		System.out.print("Digite o multiplicando : ");
		double multiplicando = tec.nextDouble();
		System.out.print("Digite o multiplicador: ");
		double multiplicador = tec.nextDouble();
		Calculadora calculadora = new Calculadora();
		System.out.println("Resultado: " + calculadora.multiplicar(multiplicando,multiplicador));
	}
	private void subtrair() {
		System.out.print("Digite o minuendo : ");
		double minuendo = tec.nextDouble();
		System.out.print("Digite o subtraendo: ");
		double subtraendo = tec.nextDouble();
		Calculadora calculadora = new Calculadora();
		System.out.println("Resultado: " + calculadora.subtrair(minuendo,subtraendo));
		
	}
	private void somar() {
		System.out.print("Digite a parcela 1: ");
		double parcela1 = tec.nextDouble();
		System.out.print("Digite a parcela 2: ");
		double parcela2 = tec.nextDouble();
		Calculadora calculadora = new Calculadora();
		System.out.println("Resultado: " + calculadora.somar(parcela1,parcela2));
		
	}
}

















