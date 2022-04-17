package com.dio.exercicios;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args ) {
		Scanner scan = new Scanner(System.in);
		
		int a, b; 
		
			System.out.println("Informe o primeiro valor: ");
		a = scan.nextInt();
		
			System.out.println("Informe o segundo valor: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		
		int subtracao = subtracao(a,b);
		
		int divisao = divisao (a,b);
		
		int multiplicacao = multiplicacao(a,b);
		    //Calculadora 
		
			System.out.println("Exercicios Calculadora");
			
			System.out.println(soma);
			
			System.out.println(subtracao);
			
			System.out.println(divisao);
			
			System.out.println(multiplicacao);
			
			//Mensagem
			System.out.println("Exercicios mensagem");
			
			Mensagem.obterMensagem(9);
			
			Mensagem.obterMensagem(15);
			
			Mensagem.obterMensagem(22);
			
			
			//Emprestimo 
			
			System.out.println("Exercicios Emprestimo");
			
			Emprestimo.calcular(valor 50, Emprestimo.getDuasParcelas());
			Emprestimo.calcular(valor 50, Emprestimo.getTresParcelas());
			Emprestimo.calcular(valor 50, parcelas 5);
		
	}
	public static int soma(int a, int b) {
		return a + b; 
	}
	public static int subtracao(int a, int b) {
		return a - b;
	}
	public static int divisao(int a, int b) {
		return a / b;
	}
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
	
	
	
	
	
}


