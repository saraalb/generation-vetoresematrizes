package exercicios04matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		//Declaração de variáveis
		int numDez[] = {2,5,1,3,4,9,7,8,10,6};
		int numProcurado;
		Scanner leia = new Scanner(System.in);
		
		//ordenando o array com o método sort
		Arrays.sort(numDez);
		
		//exibindo os números ordenados:
		for(int i=0; i<numDez.length;i++) {
			System.out.println("\nPosição:"+i+" | Número:"+numDez[i]);
		}
		
		//Dados de entrada
		System.out.println("\nDigite o número que você deseja encontrar: ");
		numProcurado = leia.nextInt();	
		
		
		//procurando o índice do array com o método binarysearch
		int posicao = Arrays.binarySearch(numDez, numProcurado);
		
		//processamento e saída de dados
		if (posicao>=0) {
			System.out.println("\nO número "+numProcurado+" foi encontrado na posição: "+posicao);
		} else {
			System.out.println("\nNão foi encontrado!");
		}

	}

}
