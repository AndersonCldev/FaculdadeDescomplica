package atividades;

public class atividade05QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, vet[] = {9,6,8,2,7,10,3,4,1,5,12,23,20,24,25,25,21};
		
		quickSort(0, 9, vet);
		
		for(i = 0; i < 10; i++) {
			System.out.println(vet[i] + " ");
		}
		System.exit(0);
}
	
	
	public static int particao(int p, int q, int vetor[]) {
		
		int j = p - 1;
		int temp, aux = vetor[q];
		
		for (int i = p; i <= q; i++) {
			if(vetor [i] <= aux) {
			j++;
			temp = vetor[i];
			vetor[i] = vetor[j];
			vetor[j] = temp;
			}
		}
		return j;
	}		
	
	
public static void quickSort(int p, int q, int vetor[]) {
	int x;
	if(p < q) {
		x = particao (p, q, vetor);
		quickSort(p, x - 1, vetor);
		quickSort(x + 1, q, vetor);
	}
	}
}
