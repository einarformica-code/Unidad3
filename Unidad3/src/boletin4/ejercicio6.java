package boletin4;

import java.util.Arrays;

public class ejercicio6 {
	
	public static int [] suma(int listaInicial[], int numElementos) {
		//La longitud de la lista que se devolverá sera la longitud de la lista principal menos el numero de elementos mas uno.
		//De forma que si hay 6 elementos, se podrán hacer 4 sumas de 3 numeros consecutivos hasta que no quede espacio.
		
		
		int listaResultante []= new int[listaInicial.length - numElementos + 1];
		
		
		for (int recorrerListaResultante = 0; recorrerListaResultante < listaResultante.length; recorrerListaResultante++) {
			
			for(int recorrerListaInicial= recorrerListaResultante; recorrerListaInicial<recorrerListaResultante + numElementos; recorrerListaInicial++) {
				
				listaResultante[recorrerListaResultante] += listaInicial[recorrerListaInicial];
				
				
				
			}
			
			
			
		}
		
		
		
		
		
		return listaResultante;
		
	}

	public static void main(String[] args) {
		//Creamos el array al que le aplicaremos la funcion
		
		
		int listaInicial [] = {9, 5, 4, 2, 6, 1, 8, 9};
		//Num elementos será el numero de elementos consecutivos que se suman cada vez.
		int numElementos = 3;
		
		System.out.println(Arrays.toString(suma(listaInicial, numElementos)));
		

	}

}
 