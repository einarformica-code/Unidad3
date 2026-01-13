package boletin4;

import java.util.Arrays;
import java.util.Random;

public class ejercicio7 {
	//NOTA. Ejercicio 7 corresponde al ejercicio 1 de tablas bidimensionales.
	
	/*/ 
	 * Realiza una función que reciba una tabla de dos dimensiones. 
	 * A continuación, debe devolver un array de dos posiciones que contenga el mínimo en la posición 0 y el máximo en la posición 1.
	 *  Define un método main que rellene un array de 6 filas por 10 columnas con números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
	 *   A continuación, debe llamar a la función con este array y mostrar por consola los valores mínimo y máximo de la tabla.
	  /*/
	
	
	public static int  [] minMax(int listaBidimensional[][]) {
		int minMax[]=new int [2];
		//Establecemos el valor minimo como el primer elemento del array para poder establecer comparaciones a posteriori.
		int minimo=listaBidimensional[0][0];
		int maximo=0;
		
		for (int recorrerFilas=0; recorrerFilas< listaBidimensional.length; recorrerFilas++) {
			for (int recorrerColumnas=0; recorrerColumnas<listaBidimensional[recorrerFilas].length; recorrerColumnas++ ) {
				if (listaBidimensional[recorrerFilas][recorrerColumnas] > maximo) {
					//Si la posicion en la lista es mayor al maximo establecido hasta el momento, se establece esa posicion como el nuevo maximo.
					maximo = listaBidimensional[recorrerFilas][recorrerColumnas];
				}//cierreif
				if(listaBidimensional[recorrerFilas][recorrerColumnas] < minimo) {
					//Operacion inversa a la anterior para establecer el mínimo
					minimo=listaBidimensional[recorrerFilas][recorrerColumnas]; 
				}//cierre if2
			}//cierre for2
			
		}//cierre for principal
		
		
		minMax[0]= minimo;
		minMax[1]=maximo;
		
		
		
		
		
		return minMax;
	}
	
	public static void main(String[] args) {
		//Creamos array de 6 filas y 10 columnas
		int listaBidimensional[][]= new int [6][10];
		//Clase random para generar numeros aleatorios.
		Random gen = new Random();
		//For que recorre el array llenándola de numeros aleatorios comprendidos entre 0 y 1000.
		for (int recorrerFilas=0; recorrerFilas< listaBidimensional.length; recorrerFilas++) {
			for (int recorrerColumnas=0; recorrerColumnas<listaBidimensional[recorrerFilas].length; recorrerColumnas++ ) {
				
				listaBidimensional[recorrerFilas][recorrerColumnas]= gen.nextInt(0, 1001);
			}
			
		}
		
		
		
		
		for (int recorrerFilas=0; recorrerFilas< listaBidimensional.length; recorrerFilas++) {
			for (int recorrerColumnas=0; recorrerColumnas<listaBidimensional[recorrerFilas].length; recorrerColumnas++ ) {
				
				System.out.print(listaBidimensional[recorrerFilas][recorrerColumnas] +" ");
			}
			System.out.println();
			
		}
		
		System.out.println(Arrays.toString(minMax(listaBidimensional)));
		
		
		
	}

}
