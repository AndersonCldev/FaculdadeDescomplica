package atividades;

import javax.swing.JOptionPane;

public class atividade08Fatiruak_02 {

	public static void main(String[] args) {
		int f, nro;

		nro = Integer.parseInt(JOptionPane.showInputDialog("" + "Digite um valor que você deseja saber o fatorial"));
		
		if (nro < 0) {
			System.out
					.println("Valor inválido para cálculo de fatorial, " + "o valor precisa ser maior ou igual a zero");
			
			System.exit(0);
			
		} else {
			
			f = fat(nro); // Chamada da função recursiva
		
		}
		
		System.exit(0);
	}

	static int fat(int n) {

		int f;
		if (n == 0) {
			return 1;

		} else {
			// chamada da função recursiva
			f = n * fat(n - 1); // regra 2 e 3
			return f;
		}

	}
}
