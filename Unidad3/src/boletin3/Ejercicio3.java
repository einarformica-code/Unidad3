package boletin3;


import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int matriz[][];
		int nfilas;
		int ncolumnas;
		
		
		
		System.out.println("Numero filas, luego columnas");
		nfilas=teclado.nextInt();
		ncolumnas=teclado.nextInt();
		
		matriz= new int[nfilas][ncolumnas];
		
		for(int recFilas=0; recFilas<nfilas; recFilas++) {//For para recoger filas.
			
			for(int recColumnas=0; recColumnas<ncolumnas;recColumnas++ ) {
				
				matriz[recFilas][recColumnas]= 10 * nfilas + ncolumnas;
				
			}
			
		}
		//Creamos for para imprimir la matriz.
		
		for(int recFilas=0; recFilas<nfilas; recFilas++) {//For para recoger filas.
			
			for(int recColumnas=0; recColumnas<ncolumnas;recColumnas++ ) {
				
				System.out.print(matriz[recFilas][recColumnas]);
				
			}
			System.out.println();//Imprimimos salto de linea.
		}
		
		
		
		
		
		
		
		
	}

}
