package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	int matriz[]= new int [8];
	
	
	for ( int contador = 0; contador <matriz.length; contador ++) {
		do {
		System.out.print("Jugador" + (contador + 1));
		matriz[contador]=teclado.nextInt();
		}while (matriz[contador] <1000 || matriz[contador] > 2800);
	}
	System.out.println(Arrays.toString(matriz));
}
}
