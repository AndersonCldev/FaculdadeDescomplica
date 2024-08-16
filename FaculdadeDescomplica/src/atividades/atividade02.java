package atividades;

import java.util.Scanner;

public class atividade02 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int vetor [][], i, j , soma=0;
		vetor = new int [10] [12];
		
		for(i = 0; i<=119; i ++) {
			for(j = 0; j <=119; j ++) {
				System.out.println("Digite um número interito: ");
				vetor[i][i] = ler.nextInt();
				soma = soma + vetor[i][i];
			}
		}
		
		System.out.println(soma);
	}
}
