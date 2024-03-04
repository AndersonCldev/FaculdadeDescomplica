import java.util.ArrayList;
import java.util.Scanner;

public class pensareResponderFaculdade {
	public static void main(String args[]) {
		
		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite 1 número: ");
		
		for(int i = 0; i < 5; i++) {
			
			int numeros1 = ler.nextInt();
			numeros.add(numeros1);
			
		}
		System.out.println("Os números digitados foram: ");
		for(int i = 0; i < numeros.size(); i++) {
			int numero = numeros.get(i);
			System.out.println(numero);
		}
		
	}
}
