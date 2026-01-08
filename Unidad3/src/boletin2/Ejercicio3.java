package boletin2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		
		/*/
		 * Crea un programa que cree un array de tamaño 30 y lo rellene con valores aleatorios entre 0 y 9.
		 *  Luego ordena los valores del array y los mostrará por pantalla. */
		
		
		Random rand = new Random();
		
		int array[]= new int[30];
		
		for (int recorrer = 0; recorrer<array.length; recorrer ++) {
			int random = rand.nextInt(1,10);
			array[recorrer] = random;
		}
		System.out.println("La lista desordenada es:" +  Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("La lista ordenada es:" +  Arrays.toString(array));

	}

}
