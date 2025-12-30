package boletin3;

import java.util.Arrays;

public class Ejercicio1 {
public static void main(String[] args) {
	//Array[fila][columna]
	//arrayBidimensional[][]=;
	
	int arrayBidimensional [][]= new int [3][6];
	
	arrayBidimensional[0][0]=0;
	arrayBidimensional[0][1]=30;
	arrayBidimensional[0][5]= 5;
	arrayBidimensional[1][0]=75;
	arrayBidimensional[1][4]=0;
	arrayBidimensional[2][2]= -2;
	arrayBidimensional[2][3]=9;
	arrayBidimensional[2][5]=11;
	
	for (int i = 0; i < arrayBidimensional.length; i++) {          // recorre las filas
	    for (int j = 0; j < arrayBidimensional[i].length; j++) {   // recorre las columnas
	        System.out.print(arrayBidimensional [i][j] + " ");
	    }
	    System.out.println();  // salto de línea al final de cada fila
	}


	
	
	
}
}
