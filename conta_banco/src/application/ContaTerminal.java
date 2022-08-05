package application;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int num; 
		String agency; 
		String clientName; 
		double balance; 
		
		System.out.print("Por favor, digite o número de usuário: ");
		num = sc.nextInt(); 
		
		sc.nextLine(); 
		System.out.print("Por favor, digite o número da agência: ");
		agency = sc.nextLine(); 
		
		System.out.print("Por favor, digite o nome do cliente: ");
		clientName = sc.nextLine(); 
		
		System.out.print("Por favor, digite o valor para depósito: ");
		balance = sc.nextDouble(); 
		
		System.out.println(
				"Olá " + clientName 
				+ ", obrigado por criar uma conta em nosso banco, sua agência é " + agency 
				+ ", conta " + num 
				+ " e seu saldo " + balance + " já está disponível para saque."
				);
		
		sc.close();
	}

}
