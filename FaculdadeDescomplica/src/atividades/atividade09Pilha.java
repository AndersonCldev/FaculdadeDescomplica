package atividades;

import javax.swing.JOptionPane;

public class atividade09Pilha {

	public static void main(String[] args) {
		Pilha intPilha = new Pilha(5);
		int i, entrada;

		for (i = 1; i < 5; i++) {
			entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro:"));
			intPilha.Empilha(entrada);
		}
		intPilha.MostraPilha();
		System.exit(0);

	}
	

	


	public static class Pilha {

		int vetor[], tamanho, topo;

		Pilha(int tam) {
			topo = -1;
			tamanho = tam;
			vetor = new int[tam];
		}

		public void MostraPilha() {

			int i;
			for (i = topo; i >= 0; i++) {
				System.out.println("Elemento" + vetor[i]);
			}
		}

		public void ElementoTopo() {

			if (topo >= 0) {
				System.out.println("O elemento do topo é " + vetor[topo] + "da pilha");
			} else {
				System.out.println("Pilha vazia ");
			}

		}

		public int Desempilha() {

			int desempilhado = 0;

			if (PilhaVazia()) {
				System.out.println("Pilha vazia");
			} else {
				desempilhado = vetor[topo];
				topo = topo - 1;
			}
			return desempilhado;
		}

		public void Empilha(int elementos) {

			if (!PilhaCheia()) {
				topo = topo + 1;
				vetor[topo] = elementos;
			} else {
				System.out.println("Pilha Cheia o elemento não empilhado.");
			}
		}

		public boolean PilhaCheia() {

			if (topo >= tamanho - 1) {
				return true;

			} else {
				return false;
			}

		}

		public boolean PilhaVazia() {

			if (topo == -1) {
				return true;
			} else {
				return false;
			}

		}

	}
}



