package boletin2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		/*/
		 * Crea un programa que pida al usuario 20 valores enteros
		 *  e introduzca los 10 primeros en un array y los 10 últimos en otro array.
		 *   Por último, comparará ambos arrays y le dirá al usuario si son iguales o no. 
		 */
		
		
		int matriz1[]= new int[10];
		int matriz2[]= new int[10];
		int input;
		
		Scanner teclado = new Scanner(System.in);
		
		for (int contador = 0; contador <matriz1.length; contador++) {
			
				System.out.println("Valor " + (contador  + 1));
				input = teclado.nextInt();
				matriz1[contador]=input;
				}
		
		for (int contador = 0; contador <matriz2.length; contador++) {
			
			System.out.println("Valor " + (contador  + 1));
			input = teclado.nextInt();
			matriz2[contador]=input;
			}
		
		
		
		if (Arrays.equals(matriz1, matriz2)) {
			System.out.println(Arrays.toString(matriz1));
			System.out.println(Arrays.toString(matriz2));
			System.out.println("Son iguales");
		}else {
			System.out.println(Arrays.toString(matriz1));
			System.out.println(Arrays.toString(matriz2));
			System.out.println("No son iguales");
			}
		
		

		
		
		
	}

}
