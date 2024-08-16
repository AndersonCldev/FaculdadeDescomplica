package atividades;

public class Atividade04BobbleShort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, vet[] = {9,6,8,2,7,10,3,4,1,5,12,23,20,24,25,25,21};
		vet = Bolha(vet);
		
		for(i = 0; i< vet.length; i++) {
			System.out.println(vet[i] + " ");
		}
		
		System.exit(0);
	}



public static int [] Bolha (int numeros[]) {
	final int n = numeros.length;
	int aux;
	
	for(int i = 0 ; i < n - 1 ; i++) {
		for(int j = 0 ; j < n - 1 -1; j++) {
			
			if(numeros[j] > numeros[j+1]) {
				aux = numeros[j];
				numeros [j] = numeros [j+1];
				numeros[j+1] = aux;
			}
		}
	}
	return numeros;
	}
}