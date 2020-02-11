package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta account;

		System.out.println("Conta:");
		int conta = sc.nextInt();
		
		System.out.println("Name:");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.println("Initial Dep (y/n):");
		char init = sc.next().charAt(0);
		
		if(init == 'y') {
			System.out.println("Entre o valor inicial:");
			double inicialDep = sc.nextDouble();
			account = new Conta(nome, conta, inicialDep);
			System.out.println(account);
			
		}else {
			System.out.println("NAO");
			account = new Conta(nome, conta);
			System.out.println(account);
			
		}
		
		System.out.println("Deposito valor: ");
		double dep = sc.nextDouble();
		account.deposito(dep);
		System.out.println(account);
		System.out.println("Teste");
		
		System.out.println("Valor do saque: ");
		double saque = sc.nextDouble();
		account.saque(saque);
		System.out.println(account);
		
		
		
		
		
		sc.close();

	}

}
