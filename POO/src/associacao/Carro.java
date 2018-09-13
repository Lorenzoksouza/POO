package associacao;

import java.util.Arrays;

public class Carro {

	private String modelo;
	private String fabricante;
	private int ano;
	private double quilometragem;
	private Motor motor;
	private Roda[] rodas;
	
	public Carro(String modelo, String fabricante, int ano, double quilometragem, Motor motor, Roda[] rodas) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.ano = ano;
		this.quilometragem = quilometragem;
		this.motor = motor;
		this.rodas = rodas;
	}
	public Carro() {
		super();
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public double getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem;
	}
	
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	public Roda[] getRodas() {
		return rodas;
	}
	public void setRodas(Roda[] rodas) {
		this.rodas = rodas;
	}
	
	@Override
	public String toString() {
		return "Carro"
				+ "\nModelo: " + modelo 
				+ "\nFabricante:" + fabricante 
				+ "\nAno:" + ano 
				+ "\nQuilometragem:" + quilometragem 
				+ "\n\nMotor:" + motor 
				+ "\n\nRodas:" + Arrays.toString(rodas);
	}
	
	
	
}
