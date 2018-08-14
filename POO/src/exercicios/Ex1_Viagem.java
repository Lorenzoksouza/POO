package exercicios;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
public class Ex1_Viagem {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		NumberFormat formatado = new DecimalFormat("0.00");
		System.out.println("Digite as horas da viagem e depois os minutos ");
		System.out.print("Digite as horas: ");
			int tempoViagemH = teclado.nextInt();
		System.out.print("Digite os minutos: ");
			int tempoViagemM = teclado.nextInt();
		System.out.print("Digite a velocidade média em Km/h: ");
			int veloMedia = teclado.nextInt();
		double tempoTotal  = tempoViagemH + (tempoViagemM/60);
		double kmLitro = 10.5;
		double distancia = tempoTotal*veloMedia;
		double litrosGastos = distancia/kmLitro;
		System.out.println("Você percorreu " + formatado.format(distancia) + " Km em " 
				+ tempoViagemH + " hora(s) e " + tempoViagemM + " minuto(s), a uma media de " 
				+ veloMedia + " Km/h, e gastou " + formatado.format(litrosGastos) + " litros de combustivel.");
	}
	private static NumberFormat DecimalFormat(double d) {
		return null;
	}
}