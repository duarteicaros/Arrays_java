/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.*/

package Arrays;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int[] a = new int[6];
		int somapar = 0, quantimpar = 0;

		for (int i = 0; i < a.length; i++) {
			System.out.printf("Entre com um n�mero: ");
			a[i] = leia.nextInt();
		}

		System.out.println();

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println("O n�mero par digitado foi: " + a[i]);
				somapar += a[i];
			}
		}

		System.out.println("E a soma dos n�meros pares � de: " + somapar + "\n");

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println("O n�mero impar digitado foi: " + a[i]);
				quantimpar += a[i];
			}
		}
		System.out.println("A quantidade de n�meros impares digitado � de: " + quantimpar);
	}

}
