package boletin3;

import java.util.Random;

public class Ejercicio5_1 {
	public static void main(String[] args) {
		//Creamos generador de numeros aleatorios.
		Random gen = new Random();
		//Creamos un array de 4 filas y 5 columnas.
		int matriz[][]= new int[4][5];
		
		int sumaFilas[]= new int[matriz.length];
		int sumaTotal=0;
		int sumaColumna[] = new int [matriz[0].length];
		int columna=0;
		
		
		//Recorremos la matriz rellenandola con numeros aleatorios.
		for(int fila=0; fila<matriz.length;fila++) {
			for(columna=0; columna<matriz[fila].length; columna++) {
				matriz[fila][columna]= gen.nextInt(100, 1000);
				sumaFilas [fila] += matriz[fila][columna];
				sumaTotal += matriz[fila][columna];
				sumaColumna[columna] += matriz[fila][columna];
				
				
				
				System.out.print(" " + matriz[fila][columna] + " " );
				
				
			}
			
			System.out.print( "= " + sumaFilas[fila]);
			System.out.println();
			
		}
		
		
		
		
	
		
		for (columna = 0; columna<matriz[0].length; columna++) {
			
			System.out.print(sumaColumna[columna] + " " );
		}
		
		System.out.print("= " +sumaTotal);
		
		
		
		
		
	}

}
