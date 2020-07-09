/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. 
    Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
    Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. 
    Na terceira opção o valor da constante deve ser lido e o resultado 
    da adição da constante deve ser armazenado na própria matriz.
*/

package Arrays;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float[][] m1 = new float[2][2], m2 = new float[2][2], msoma = new float[2][2], msub = new float[2][2];
		int opcao, i = 0, j = 0;

		for (i = 0; i < m1.length; i++) {
			for (j = 0; j < m1.length; j++) {
				System.out.printf("Forneça os valores para a matriz M1: ");
				m1[i][j] = leia.nextInt();
			}
		}

		System.out.println();

		for (i = 0; i < m2.length; i++) {
			for (j = 0; j < m2.length; j++) {
				System.out.printf("Forneça os valores para a matriz M2: ");
				m2[i][j] = leia.nextInt();
			}
		}

		System.out.printf("\nEscolha uma opção:"
				+ " \n1 -Para somar as duas matrizes"
				+ " \n2 -Para subtrair a primeira matriz da segunda"
				+ " \n3 -Para adicionar uma constante as duas matrizes" 
				+ " \n4 -Para imprimir as matrizes"
				+ " \n\nA opção escolhida foi a: ");
		opcao = leia.nextInt();

		switch (opcao) {
		case 1:

			for (i = 0; i < msoma.length; i++) {
				for (j = 0; j < msoma.length; j++) {
					msoma[i][j] = m1[i][j] + m2[i][j];
				}
			}

			System.out.println("\nA soma das matrizes resulta em: \n");

			for (i = 0; i < msoma.length; i++) {
				for (j = 0; j < msoma.length; j++) {
					System.out.printf(msoma[i][j] + "|");
				}
				System.out.printf("\n");
			}
			break;

		case 2:

			for (i = 0; i < msub.length; i++) {
				for (j = 0; j < msub.length; j++) {
					msub[i][j] = m2[i][j] - m1[i][j];
				}
			}

			System.out.println("\nA subtração das matrizes resulta em: \n");

			for (i = 0; i < msub.length; i++) {
				for (j = 0; j < msub.length; j++) {
					System.out.printf(msub[i][j] + "|");
				}
				System.out.printf("\n");

			}
			break;

		case 3:

			final float x; // x é a minha constante

			System.out.printf("Declare uma constante para soma: ");
			x = leia.nextFloat();

			for (i = 0; i < m1.length; i++) {
				for (j = 0; j < m1.length; j++) {
					m1[i][j] = m1[i][j] + x;
				}
			}

			for (i = 0; i < m2.length; i++) {
				for (j = 0; j < m2.length; j++) {
					m2[i][j] = m2[i][j] + x;
				}
			}

			System.out.println("\nA soma da variável resulta em:\n");
			System.out.println("M1");

			for (i = 0; i < m1.length; i++) {
				for (j = 0; j < m1.length; j++) {
					System.out.printf(m1[i][j] + "|");
				}
				System.out.printf("\n");
			}

			System.out.println("\nM2");
			for (i = 0; i < m2.length; i++) {
				for (j = 0; j < m2.length; j++) {
					System.out.printf(m2[i][j] + "|");
				}
				System.out.printf("\n");
			}
			break;

		case 4:

			System.out.println("\nA Matriz 1 é: \n");
			for (i = 0; i < m1.length; i++) {
				for (j = 0; j < m1.length; j++) {
					System.out.printf(m1[i][j] + "|");
				}
				System.out.printf("\n");
			}
			System.out.println("\nA Matriz 2 é: \n");
			for (i = 0; i < m2.length; i++) {
				for (j = 0; j < m2.length; j++) {
					System.out.printf(m2[i][j] + "|");
				}
				System.out.printf("\n");
			}
			break;

		default:
			System.out.println("Opção invalida !!!!");
		}
	}

}
