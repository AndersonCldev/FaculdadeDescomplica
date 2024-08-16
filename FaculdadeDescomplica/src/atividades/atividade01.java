package atividades;

import java.util.Scanner;

public class atividade01 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int vetor [], i, valor = 0, soma =0;
		vetor = new int [10];
		
		for(i = 0; i<=9 ; i++) {
			System.out.println("Digite um número inteiro: ");
			vetor [i] = ler.nextInt();
			soma = soma + vetor[i];
			
		}
		
		System.out.println(soma);
		
	}
}
