package arraysClase;

import java.util.Arrays;
import java.util.Scanner;

public class FuncionConParametros_sinretorno {
	
	public static void imprimirPalabra(String palabra, int nveces) {
		
		for(int i = 0; i< nveces; i++) {
			
			System.out.println(palabra);
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escriba palabra");
		String palabra= teclado.next();
		
		System.out.println("Veces a repetirse");
		int nveces=teclado.nextInt();
		
		imprimirPalabra(palabra, nveces);
		
		
		
		
		
		}
		
		
	
		  
	
			
		}
	
	


