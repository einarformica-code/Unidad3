package boletin4;
import java.util.Arrays;

public class ejercicio2 {
	
	
	
	public static int  BuscarMayor(int[]tabla) {
		
		int mayor = 0;
		for (int i = 0; i<tabla.length; i++) {
			if (tabla[i] > mayor) {
				mayor= tabla[i];
				
			}
			
		}
		return mayor;
		
		
	}
	//Función main con la que probar la funcion
	public static void main(String[] args) {
		//Creamos arrays con varios elementos.
		int resultado=0;
		int tabla[]= {1, 2 ,3, 6, 7 , 8 , 18} ;
		
		resultado= BuscarMayor(tabla);
		
		System.out.println("La tabla es " + Arrays.toString(tabla));
		System.out.println("El mayor numero encontrado es  " + resultado);
		
		
	}	
	
	

}
