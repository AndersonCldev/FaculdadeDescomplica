package atividades;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class atividade03Vetor {
	public static void main(String[] args) {
		 
		 double vetor[], media = 0, soma = 0;
		 vetor = new double[50];
		 
		 for(int i =0; i <=49; i++) {
			 vetor[i] =  Double.parseDouble(JOptionPane.showInputDialog("Digite um Número: "));
			 soma += vetor[i];
		}
		 
		 media = soma / vetor.length;
		 
		 JOptionPane.showMessageDialog(null, "A média das 50 notas digitadas é: " + media);
	}
}
