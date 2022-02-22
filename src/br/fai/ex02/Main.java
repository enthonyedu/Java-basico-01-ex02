package br.fai.ex02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main app = new Main();
		app.start();

	}
	
	private void start() {
		
		System.out.println("Digite o valor do produto: ");
		
		Scanner scanner = new Scanner(System.in);
		
		double valor = scanner.nextDouble();
		
		int inteiro = (int) valor;
		
		System.out.println("Valor com casas decimais: " + valor + "| Valor inteiro: " + inteiro);
		
		int valor2 = 10;
		double convert = valor2;
		
		System.out.println("Novo: " + valor2 + "| Convertido: " + convert);

	}

}
