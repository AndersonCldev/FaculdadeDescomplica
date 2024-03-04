import java.util.ArrayList;
import java.util.Scanner;

public class pensareResponderFaculdade {
    public static void main(String args[]) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite 5 números: ");

        for (int i = 0; i < 5; i++) {
            int numero = ler.nextInt();
            numeros.add(numero);
        }

        System.out.println("Os números digitados foram: ");
        for (int i = 0; i < numeros.size(); i++) {
            int numero = numeros.get(i);
            System.out.println(numero);
        }

        System.out.println("Agora vamos somar todos os números informados no ArrayList ");
        int soma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            soma += numeros.get(i);
        }

        System.out.println("TOTAL: " + soma);
    }
}
