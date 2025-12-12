package boletin1;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		double[] tabla = new double[5];
		Scanner teclado = new Scanner(System.in);
		
		
		for(int contador=0; contador < tabla.length; contador++){
			System.out.println("Introduzca un número decimal");
			tabla[contador]= teclado.nextDouble();
			
			
		}
		
		System.out.println("Ha introducido estos números: ");
		for (int contador=0; contador<tabla.length; contador++) {
			System.out.print(tabla[contador] + "  ");
		}
		
	}

}
