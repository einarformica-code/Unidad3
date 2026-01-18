package boletin4;

import java.util.Arrays;

public class ejercicio8 {
	
	public static int [][] arrayReverso(int array[][]){
		int arrayReverso[][]=new int [3][3];
		
		
		
		
		for(int filas=0; filas<array.length; filas++) {
					
					for(int columnas=0; columnas<array.length; columnas++) {
						arrayReverso[filas][columnas]= array[columnas][filas];
					}
					
				}
		
		
		return arrayReverso;
		
	}
	
	
	public static void main(String[] args) {
		int array[][]=new int [3][3];
		
		array[0][0]=1;
		array[0][1]=2;
		array[0][2]=3;
		array[1][0]=4;
		array[1][1]=5 ;
		array[1][2]=6 ;
		array[2][0]=7;
		array[2][1]=8 ;
		array[2][2]=9 ;
		
		System.out.println("Matriz original");

		for(int filas=0; filas<array.length; filas++) {
			
			for(int columnas=0; columnas<array.length; columnas++) {
				System.out.print(array[filas][columnas] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Matriz Revertida");
		
		System.out.println(Arrays.deepToString(arrayReverso(array)));






		
		
		
	}

}
