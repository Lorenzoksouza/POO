package exercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ex2_ConversorTemperatura {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Conversor de Temperaturas");
		System.out.println("1 - Celsius para Fahrenheit");
		System.out.println("2 - Fahrenheit para Celsius");
		System.out.println("3 - Celsius para Kelvin");
		System.out.println("4 - Kelvin para Celsius");
		System.out.println("5 - Fahrenheit para Kelvin");
		System.out.println("6 - Kelvin para Fahrenheit");
		System.out.println("0 - Encerrar");
		
		System.out.print("Digite sua opção: "); 
		int opc = teclado.nextInt();
		
		while (opc != 0){
			switch (opc){
				case 1 : {
					convertCtoF();
					break;}
				case 2:{
					convertFtoC();
					break;}
				case 3:{
					convertCtoK();
					break;}
				case 4:{
					convertKtoC();
					break;}
				case 5:{
					convertFtoK();
					break;}
				case 6:{
					convertKtof();
					break;}
				default :{
					System.out.println("Opção invalida");
					break;}
			}
			System.out.println("1 - Celsius para Fahrenheit");
			System.out.println("2 - Fahrenheit para Celsius");
			System.out.println("3 - Celsius para Kelvin");
			System.out.println("4 - Kelvin para Celsius");
			System.out.println("5 - Fahrenheit para Kelvin");
			System.out.println("6 - Kelvin para Fahrenheit");
			System.out.println("0 - Encerrar");
			System.out.print("Digite sua opção: "); 
			teclado.nextInt();
		}
	}
	private static void convertKtof() {
		NumberFormat formatado = new DecimalFormat("0.00");
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a temperatura: ");
		double temp = teclado.nextDouble();
		double temp2 = 9*(temp-273.15)/5;
		System.out.println(formatado.format(temp2) + " °F");
		
	}
	private static void convertFtoK() {
		NumberFormat formatado = new DecimalFormat("0.00");
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a temperatura: ");
		double temp = teclado.nextDouble();
		double temp2 = 5*(temp-32)/9+27;
		System.out.println(formatado.format(temp2) + " K");
		
	}
	private static void convertKtoC() {
		NumberFormat formatado = new DecimalFormat("0.00");
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a temperatura: ");
		double temp = teclado.nextDouble();
		double temp2 = temp - 273.15;
		System.out.println(formatado.format(temp2) + " °C");
		
	}
	private static void convertCtoK() {
		NumberFormat formatado = new DecimalFormat("0.00");
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a temperatura: ");
		double temp = teclado.nextDouble();
		double temp2 = temp + 273.15;
		System.out.println(formatado.format(temp2) + " K");
		
	}
	private static void convertCtoF() {
		NumberFormat formatado = new DecimalFormat("0.00");
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a temperatura: ");
		double temp = teclado.nextDouble();
		double temp2 = temp*1.8+32;
		System.out.println(formatado.format(temp2) + " °F");
		
	}
	private static void convertFtoC() {
		NumberFormat formatado = new DecimalFormat("0.00");
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a temperatura: ");
		double temp = teclado.nextDouble();
		double temp2 = (temp-32)/1.8;
		System.out.println(formatado.format(temp2) + " °C");
		
	}
}