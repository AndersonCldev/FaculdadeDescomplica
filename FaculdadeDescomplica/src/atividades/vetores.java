package atividades;
import javax.swing.JOptionPane;

public class vetores {

	public static void main(String[] args) {
		int VetSoma [], i , soma = 0;
		VetSoma = new int [5];
		for(i = 0 ; i <=5 ; i++) {
			VetSoma[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
			soma = soma + VetSoma[i];
		}
	System.out.println("A soma dos 100 valores digitados é: " + soma);
	System.exit(0);
	}

}
