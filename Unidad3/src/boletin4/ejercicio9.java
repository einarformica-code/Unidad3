package boletin4;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio9 {
	//Funcion para revertir la matriz inical.
	public static int [][] arrayReverso(int array[][], int nfilas, int ncolumnas){
		int arrayReverso[][]=new int [nfilas][ncolumnas];
		
		
		
		
		for(int filas=0; filas<array.length; filas++) {
					
					for(int columnas=0; columnas< nfilas; columnas++) {
						arrayReverso[filas][columnas]= array[columnas][filas];
					}
					
				}
		
		
		return arrayReverso;
		
	}
	
	
	public static boolean esSimetrica(int matriz[][], int arrayReverso[][]) {
		boolean esSimetrica= Arrays.deepEquals(matriz, arrayReverso);
		
		
		
		
		
		
		
		return esSimetrica;
	}
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		int nfilas=3;
		int ncolumnas=3;
		
		int matriz [][]= new int [nfilas][ncolumnas];
		
		for(int filas = 0; filas < matriz.length; filas++) {
			for(int columnas=0; columnas < nfilas; columnas++) {
				System.out.println("Introduzca el valor para fila" + (filas + 1) + " y columna " + (columnas + 1) );
				matriz[filas][columnas]=teclado.nextInt();
			}
			
		}
		int matrizInversa[][]= arrayReverso(matriz, nfilas, ncolumnas);
		
		System.out.println( esSimetrica(matriz, matrizInversa));
		
		
		
		
	}

}
