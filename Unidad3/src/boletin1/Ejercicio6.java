package boletin1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		//Array de longitud 10
		Scanner teclado = new Scanner(System.in);
		int lista[]= new int[10];
		int elementoLista;
		int suma = 0;
		int mayor=1;
		int menor=1;
		boolean primerElemento = true;
		
		for(int contador=0; contador<lista.length; contador++) {
			System.out.println("Introduzca el elemento número " +( contador + 1) + ":");
			elementoLista=teclado.nextInt();
			lista[contador]=elementoLista;
			suma+=elementoLista;
			if (primerElemento) {
				mayor=elementoLista;
				menor=elementoLista;
			}
			primerElemento=false;
			if (elementoLista>mayor) {
				mayor=elementoLista;
				}
			if (elementoLista<menor) {
				mayor=elementoLista;
				}
			
			
			}
		
		
		//System.out.println(Arrays.toString(lista));
		System.out.println(", y la suma total es:" + suma);
		System.out.println("El mayor ha sido: " + mayor);
		System.out.println("El menor has sido: "+menor);
		
	}
	
}
