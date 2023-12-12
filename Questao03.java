package exercicios04matrizes;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		//declaraçao de variaveis
		int matriz[][]= new int[3][3];
		int somaDiagonalPrincipal, somaDiagonalSecundaria;
		Scanner leia = new Scanner(System.in);
		
		//dados de entrada e loop for / processamento / formacao da matriz
		for(int i=0; i<3; i++) {
			for(int j=0;j<3;j++) {
				System.out.println("Digite valor da linha "+i+" e coluna "+j+":");
				matriz[i][j] = leia.nextInt();
			}
		}
		
		somaDiagonalPrincipal = matriz[0][0] + matriz[1][1] + matriz[2][2];
		somaDiagonalSecundaria = matriz[0][2]+matriz[1][1]+ matriz[2][0];
		
		//saida de dados
		System.out.println("Elementos da diagonal principal: "+matriz[0][0]+" "+matriz[1][1]+" "+matriz[2][2]);
		System.out.println("Elementos da diagonal secundária: "+matriz[0][2]+" "+matriz[1][1]+" "+matriz[2][0]);
		System.out.println("Soma dos Elementos da Diagonal Principal: "+ somaDiagonalPrincipal);
		System.out.println("Soma dos Elementos da Diagonal Secundária: "+ somaDiagonalSecundaria); 
		}
		
		

	}


