package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] args) {
	/*/ 
	 * Crea un programa que pida al usuario dos valores, 
	 * tamaño y valor, y luego cree un array del tamaño dado y que almacene valor en todas sus posiciones.
	 *  Luego muestra el array por pantalla.
	 * /*/
	Scanner teclado = new Scanner(System.in);
	int tamaño;
	String valor;
	
	
	System.out.println("Tamaño");
	tamaño = teclado.nextInt();
	
	System.out.println("Valor");
	valor = teclado.next();
	
	String[] matriz = new String[tamaño] ;
	
	for (int recorrer = 0; recorrer< matriz.length; recorrer ++) {
		matriz[recorrer]= valor;
	}
	
	System.out.println(Arrays.toString(matriz));
	
	
}
}
