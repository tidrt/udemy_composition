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
		
		System.out.print("Por favor, digite o n�mero de usu�rio: ");
		num = sc.nextInt(); 
		
		sc.nextLine(); 
		System.out.print("Por favor, digite o n�mero da ag�ncia: ");
		agency = sc.nextLine(); 
		
		System.out.print("Por favor, digite o nome do cliente: ");
		clientName = sc.nextLine(); 
		
		System.out.print("Por favor, digite o valor para dep�sito: ");
		balance = sc.nextDouble(); 
		
		System.out.println(
				"Ol� " + clientName 
				+ ", obrigado por criar uma conta em nosso banco, sua ag�ncia � " + agency 
				+ ", conta " + num 
				+ " e seu saldo " + balance + " j� est� dispon�vel para saque."
				);
		
		sc.close();
	}

}
