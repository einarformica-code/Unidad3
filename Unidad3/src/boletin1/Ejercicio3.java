package boletin1;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		int tabla [] = new int[10];
		int num;
		Scanner teclado = new Scanner(System.in);
		//Llenamos la tabla con datos
		for (int c = 0; c<tabla.length; c++) {
			System.out.println("Número " + (c + 1) + ":");
			tabla[c] = teclado.nextInt();
			
		}
		//Imprimimos los elementos de la tabla.
		
		for(int c = tabla.length -1; c>=0; c--) {
			System.out.println("Número" +(c+1)+ " : " + tabla[c] + " ");
		}
		
		
		
	}

}
