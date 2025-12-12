package boletin1;

import java.util.Random;

public class Ejercicio1 {
public static void main(String[] args) {
	
	int tabla[]= new int[10];
	Random rdm = new Random();
	tabla[0]= rdm.nextInt(1,101);
	
	for (int contador=0; contador<tabla.length; contador++) {
		tabla[contador]= rdm.nextInt(1,101);
		System.out.print(tabla[contador] + " ");
	}
	
	
}
}
