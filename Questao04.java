package exercicios04matrizes;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		//double media[][] = new double[3][4];
		float nota[][] = new float[10][4];
		float medias[] = new float[10];
		Scanner leia = new Scanner(System.in);
		
		//linha (i)= participante. coluna (j)= notas
		for(int i=0;i<10;i++) {
			for(int j=0; j<4;j++) {
				System.out.println("Digite nota "+(j+1)+"o semestre do aluno "+(i+1));
				nota[i][j] = leia.nextFloat();
			}
		}
		
		//processamento / calculo de medias
		for(int i=0; i<10; i++) {
			float soma=0.0f;
			for (int j=0; j<4;j++) {
				soma+=nota[i][j];
			}
			medias[i] = soma / 4.0f;
		}
		
		//saida de dados
        System.out.println("Média dos participantes:\n");
        for(int i=0; i<10;i++) {
        	System.out.printf(" %.1f",medias[i]);
        }

		
	}

}
