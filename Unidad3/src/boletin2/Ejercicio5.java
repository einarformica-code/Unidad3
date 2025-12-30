package boletin2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Creamos array de longitud 1000;
		int array [] = new int [1000];
		
		int numeroBuscar;
		int contadorVecesEncontrado= 0;
		Random aleatorio = new Random();
		
		//Rellenamos el array con valores aleatorios comprendidos entre 1 y 99.
		for (int posicionArray = 0; posicionArray < array.length; posicionArray++ ) {
			array[posicionArray]= aleatorio.nextInt(1, 100);
		}
		
		
		
		
		
		System.out.println("Escriba un numero a buscar");
		numeroBuscar = teclado.nextInt();
		
		
		for (int posicionArray = 0; posicionArray < array.length; posicionArray++ ) {
			if (array[posicionArray]== numeroBuscar) {
				++contadorVecesEncontrado;
				
				
				
			}
		}
		System.out.println(Arrays.toString(array));
		
		if (contadorVecesEncontrado == 0) {
			System.out.println("No se ha encontrado "  + numeroBuscar + " en ninguna posicion");
		}else {
			System.out.println(numeroBuscar + " se encuentra en " + contadorVecesEncontrado + " posiciones del array.");
		}
		
		
		
		
	}

}
