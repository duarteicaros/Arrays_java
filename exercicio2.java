/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.*/

package Arrays;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int[] a = new int[6];
		int somapar = 0, quantimpar = 0;

		for (int i = 0; i < a.length; i++) {
			System.out.printf("Entre com um número: ");
			a[i] = leia.nextInt();
		}

		System.out.println();

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println("O número par digitado foi: " + a[i]);
				somapar += a[i];
			}
		}

		System.out.println("E a soma dos números pares é de: " + somapar + "\n");

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println("O número impar digitado foi: " + a[i]);
				quantimpar += a[i];
			}
		}
		System.out.println("A quantidade de números impares digitado é de: " + quantimpar);
	}

}
