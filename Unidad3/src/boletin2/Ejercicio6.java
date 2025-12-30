package boletin2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio6 {
	public static void main(String[] args) {
		Random generador = new Random();
		
		int ArrayGanador[]= new int[6];
		
		int ArrayJugada[]= new int[6];
		
		int contadorAciertos = 0;
		
		
		
		for (int recorrer = 0; recorrer<ArrayJugada.length; recorrer ++) {
			ArrayJugada[recorrer]= generador.nextInt(1,50);
			}
		System.out.println("El array intento es " + Arrays.toString(ArrayJugada));
		
		
		for (int recorrer = 0; recorrer<ArrayGanador.length; recorrer ++) {
			ArrayGanador[recorrer]= generador.nextInt(1,50);
			}
		
		//Ordenamos el array ganador.
		Arrays.sort(ArrayGanador);
		
		System.out.println("El array ganador es " + Arrays.toString(ArrayGanador));
		for (int recorrerArrayGanador=0; recorrerArrayGanador<6; recorrerArrayGanador++) {
			
			for (int recorrerPosicion=0; recorrerPosicion<6; recorrerPosicion++) {
				if (ArrayJugada[recorrerPosicion]==ArrayGanador[recorrerArrayGanador]) {
					++contadorAciertos;        
					ArrayGanador[recorrerArrayGanador]= 0;
				}
			}
			
			
		}
		
		System.out.println(contadorAciertos);
		
		
		
		
		
		
		
		
	}

}
