package exercicios04matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		//Declaração de variaveis
		int arrayInt[]= new int[10];
		int somaElementos=0;
		float mediaElementos=0.0f;
		Scanner leia = new Scanner(System.in);

		//dados de entrada
		for(int i=0;i<10;i++) {
			System.out.println("Digite número da posição "+i+":");
			arrayInt[i] += leia.nextInt();
			somaElementos+=arrayInt[i];
		}
		
		//processamento/dados de saída
		System.out.println("Elementos ímpares:");
		for(int i=0; i<10; i++) {
			if(i%2!=0) {
				System.out.print(arrayInt[i] +" ");
			} 
		}
		
		System.out.println("\nElementos pares:");
		for(int i=0; i<10; i++) {
			if(arrayInt[i]%2==0) {
				System.out.print(arrayInt[i] +" ");
			} 
		}
	
		mediaElementos = (float)somaElementos/10;
		
		//System.out.println("\nArray preenchido: " + Arrays.toString(arrayInt));
		System.out.println("\nSoma: "+somaElementos);
		System.out.printf("Média: %.2f",mediaElementos);


	}

}

