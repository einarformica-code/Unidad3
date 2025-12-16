package boletin1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		int Arrays100[] = new int [100];
		Random rdm = new Random();
		Scanner teclado = new Scanner(System.in);
		for (int recorrerPosiciones=0; recorrerPosiciones< Arrays100.length; recorrerPosiciones++) {
			Arrays100[recorrerPosiciones]=rdm.nextInt(1,11);
			}
		System.out.println(Arrays.toString(Arrays100));
		System.out.println("Introduzca un número");
		int numero=teclado.nextInt();
		for (int recorrerPosiciones=0; recorrerPosiciones< Arrays100.length; recorrerPosiciones++) {
			if (Arrays100[recorrerPosiciones] == numero ) {
				System.out.println(numero + " se encuentra en la posicion " + recorrerPosiciones );
			}
			}
		
		
	}

}
