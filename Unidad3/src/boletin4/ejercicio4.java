package boletin4;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ejercicio4 {
	
	//Definimos fx   nombre  (tipo nombre  tipo  nombre) tipos de nombres que se tienen que usar.
 	public static int buscar(int lista[], int clave) {
		for (int i =0; i<lista.length; i++) {
			
			if (lista[i]==clave) {
			return i;
		}
			
		}	
		return -1;//Si no encuentra la clave em la lista, devuelve enos uno.
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int longitudLista; // Variable don de se almacenará la longitud de la lista.
		int clave; //Variable que el usuario buscará en la lista.
		Random random=new Random();
		
		System.out.println("Longitud del array");//Input longitud de la lista.
		longitudLista = teclado.nextInt();
		
		System.out.println("Cual es la clave que desea buscar");
		clave=teclado.nextInt();
	
		
		int lista[]=new int[longitudLista]; //Creamos arrat de misma longitud.
		
		//Rellenamos tabla con numeros aleatorios.
		
		
		for( int i = 0; i< lista.length; i++) {
			lista[i]=random.nextInt(1,101);//La lista se rellenará de valores del 1 al 100.
		}
		int posicion = buscar(lista, clave);
		System.out.println(Arrays.toString(lista));
		System.out.println("Se ha encontrado en la posicion" + posicion);
		
		
		
		
		
	}

}
