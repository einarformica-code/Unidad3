package boletin4;

import java.util.Arrays;
import java.util.Random;

public class ejercicio1 {

    // Función que suma los valores de un array de enteros
    public static int sumarTabla(int[] tabla) {
        int suma = 0;//Inicializamos la suma en 0 porque es donde se irán sumando los numeros que aparezcan.
        for (int i = 0; i < tabla.length; i++) {//i representa la posicion actual donde se encuentra en la lista
            suma += tabla[i];//Sumar el número actual a la lista de números ya sumados.
        }
        return suma;//Devolver suma ( donde se hana lmacenado todos los elementos de la lista.
    }

    // Método main para probar la función
    public static void main(String[] args) {
    	Random generador = new Random();
    	
        int[] numeros = {generador.nextInt(1,20), generador.nextInt(1,20), generador.nextInt(1,20),generador.nextInt(1,20), generador.nextInt(1,20),};
        
        int resultado = sumarTabla(numeros);
        System.out.println("La tabla con numeros aleatorios es " +  Arrays.toString(numeros));
        System.out.println("La suma de los valores es: " + resultado);
    }
}