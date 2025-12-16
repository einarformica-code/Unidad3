package boletin1;

import java.util.Scanner;

public class Ejercicio7 {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	int tabla [] =  new int [8];
	
	
	for (int contadorTabla=0; contadorTabla<tabla.length; contadorTabla++) {
		System.out.println("Número pisicon" + (contadorTabla +1) );
		int inputTabla=teclado.nextInt();
		tabla[contadorTabla]= inputTabla;
		
	}
	
	for(int contador=0; contador<tabla.length; contador++) {
		if (tabla[contador] % 2 == 0) {
			System.out.println(tabla[contador] + " es par.");
			}else {
				System.out.println(tabla[contador] + " es impar.");
			}
		
	}
	 
	
	
}
}
