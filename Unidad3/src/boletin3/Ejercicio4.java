package boletin3;

public class Ejercicio4 {
	public static void main(String[] args) {
		int matriz[][]= new int[10][10];
		
		
		for(int recorrerFilas=0; recorrerFilas< matriz.length; recorrerFilas++) {
			for(int recorrerColumnas=0; recorrerColumnas<matriz.length; recorrerColumnas++) {
				matriz[recorrerFilas][recorrerColumnas]= (recorrerFilas + 1) * (recorrerColumnas +1);
				
			}
			
			
			
		}
		
		//For para imprimir la matriz.
		

		for(int recorrerFilas=0; recorrerFilas< matriz.length; recorrerFilas++) {
			for(int recorrerColumnas=0; recorrerColumnas<matriz.length; recorrerColumnas++) {
				System.out.print(" " + matriz[recorrerFilas][recorrerColumnas] + " ");
				
			}
			
			System.out.println();
			
		}
		
		
		
	}

}
