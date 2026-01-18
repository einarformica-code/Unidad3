package boletin4;

import java.util.Scanner;

public class ejercicio10 {
	
	
	public static boolean matrizMagica(int matriz[][]) {
		boolean matrizMagica = true;
		int sumaInicial = 0;
		int sumaFilas=0;
		int sumaColumnas=0;
		//For inicial para establecer la suma inical (sumando la primera fila)  que compararemos con el resto de sumas 
		
		
			for(int columnasPrimerFila=0; columnasPrimerFila < matriz[0].length; columnasPrimerFila++) {
				sumaInicial +=matriz[0][columnasPrimerFila];
				}
		
		//Todas las sumas de filas tienen que ser iguales a suma inical para que se cumpla.
		
		
		for(int filas = 1; filas < matriz.length; filas++) {
			for(int columnas=0; columnas < matriz[filas].length; columnas++) {
				
				sumaFilas +=matriz[filas][columnas];
			}
			//Tras recorrer una fila, comprobamos:
			
			if (sumaInicial !=sumaFilas) {
				matrizMagica=false;
				break;
			}
			//Reiniciamos el valor de la suma actual.
			sumaFilas=0;
			
		}
		
		//Ahora realizamos un for que sume las columnas
		
		for (int columnas=0; columnas < matriz[0].length; columnas++) {
			sumaColumnas = 0;
			for (int filas = 0; filas < matriz.length; filas++) {
				sumaColumnas +=matriz[filas][columnas];
			}
			if (sumaColumnas !=sumaInicial) {
				matrizMagica=false;
				break;
			}
			
		}
		
		return matrizMagica;
		
	}
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		int matriz[][]= new int [3][3];
		boolean matrizMagica;
		
		for(int filas = 0; filas < matriz.length; filas++) {
			for(int columnas=0; columnas < matriz[filas].length; columnas++) {
				System.out.println("Introduzca el valor para fila" + (filas + 1) + " y columna " + (columnas + 1) );
				matriz[filas][columnas]=teclado.nextInt();
			}
			
		}
		matrizMagica = matrizMagica(matriz);
		
		System.out.println(matrizMagica);
		
		
		
		
		
	}

}
