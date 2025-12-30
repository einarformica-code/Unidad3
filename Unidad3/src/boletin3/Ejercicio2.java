package boletin3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int min=0;
		int max=0;
		int media=0;
		int suma=0;
		boolean primeraNota=true;
		
		
		
		//Creamos array que almacenara 4 filas (Alumnos) y 5 columnas (asignaturas)
		int Notas[][]= new int[4][5];
		
		//Array[fila][columna]
		//Array[Alumno][Asignatura]
		
		
		for(int fila=0; fila<Notas.length; fila++) {//Recorre filas.
			for(int columnas=0; columnas<Notas[fila].length; columnas++) {
				System.out.println("Introduzca nota de alumno " + (fila +1) + " de la asignatura " +(columnas +1) );
				Notas[fila][columnas]= teclado.nextInt();
				}
			
			
		}
		
		
		System.out.println(Arrays.deepToString(Notas));
		
		for(int fila=0; fila<Notas.length; fila++) {//Recorre filas.
			for(int columnas=0; columnas<Notas[fila].length; columnas++) {
				if (primeraNota) {
					min=Notas[fila][columnas];
					max=Notas[fila][columnas];
					primeraNota= false;
				}
				suma += Notas[fila][columnas];
				if (Notas[fila][columnas] < min) {//Si la nota es menor a la anterior, es la nueva nota minima.
					min = Notas[fila][columnas];
				}
				
				
				if (Notas[fila][columnas] > max) {//Si la nota es mayor a la anterior, es la nueva nota maxima.
					max = Notas[fila][columnas];
				}
				
				
				
				}
			media = suma / Notas[fila].length;
			
			System.out.println("Para el alumno" + (fila +1) + " la nota minima ha sido " + min + ",la nota maxima ha sido " + max + " y la nota media ha sido " + media );
			
			//Ahora reinicamos todos los valores para que no afecten a los proximos alumnos/ asignaturas.
			
			 min=0;
			 max=0;
			 media=0;
			 suma=0;
			
			
			primeraNota =true; //Booleano que se reinicia por cada columna.
		}
		
		
		
		
		
		
		
		
		
		
	}

}
