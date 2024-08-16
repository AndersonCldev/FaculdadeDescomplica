package atividades;

import javax.swing.JOptionPane;

public class atividade07Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nro;
		nro = Integer.parseInt(JOptionPane.showInputDialog("" + "Digite um valor que você deseja saber o fatorial"));
		if (nro < 0) {
			System.out
					.println("Valor inválido para cálculo de fatorial, " + "o valor precisa ser maior ou igual a zero");
		} else {
			fatP(nro, nro, 1); // Chamada da função recursiva
		}
		System.exit(0);

	}

	static void fatP(int n, int x, int f) {

		if (x == 0 || x == 1) {
			System.out.println("O fatorial de " + n + " é: " + f);
		} else {

			// chamada da função recursiva
			fatP(n, x - 1, f * x);
		}
	}

}
