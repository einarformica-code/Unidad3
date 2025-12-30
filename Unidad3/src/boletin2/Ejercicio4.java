package boletin2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*/
		 * Necesitamos crear un programa para mostrar el 
		 * ranking de puntuaciones de un torneo de ajedrez con 8 jugadores. 
		 * Se le pedirá al usuario que introduzca las puntuaciones de todos
		 *  los jugadores (habitualmente valores entre 1000 y 2800, de tipo entero) 
		 *  y luego muestre las puntuaciones en orden descendente 
		 *  (de la más alta a la más baja).
		 */

		Scanner tec = new Scanner(System.in);
		//Declaramos aray donde se almacenaran
		int tablaPunt [] = new 	int [8];
		int tablaInv [] = new 	int [8];
		
		//for para pedir puntuaciones del 0 al 8.
		
		
		for (int contPunt= 0; contPunt<8; contPunt++) {
			System.out.print("Jugador " + (contPunt + 1) + " introduzca su puntuacion");
			tablaPunt[contPunt]= tec.nextInt();
			}
		//Ordenamos de menor a mayor las puntuaciones.
		Arrays.sort(tablaPunt);
		
		System.out.println(Arrays.toString(tablaPunt));
		
		//For para invertir el primer array dentro del segundo.
		for (int cont= 0; cont<8; cont++) {
			tablaInv[cont] = tablaPunt[tablaPunt.length -1 - cont];
			}
		
		System.out.println(Arrays.toString(tablaInv));
		
		
		
		
		
		
		
		
		System.out.println(Arrays.toString(tablaPunt));
		
		
		
		
		
	}

}
