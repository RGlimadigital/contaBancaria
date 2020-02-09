package entities;

public class Conta {
	private String name;
	private int countNumber;
	private double saldo;
	private double taxa  = 5;
	
	
	
	
	
	public Conta(String name, int countNumber, double inicialDep) {
		this.name = name;
		this.countNumber = countNumber;
		this.saldo = inicialDep;
	}
	
	public Conta(String name, int countNumber) {
		this.name = name;
		this.countNumber = countNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCountNumber() {
		return countNumber;
	}

	public double getInicialDep() {
		return saldo;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		saldo -=(valor + taxa); 
	}

	
	public String toString() {
		return "Conta [Name = " + name + ", CountNumber = " + countNumber + ", Saldo R$" + String.format("%.2f", saldo) + "]";
	}
	
	
	

}
