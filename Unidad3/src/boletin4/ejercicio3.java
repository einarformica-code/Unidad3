package boletin4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ejercicio3 {

    public static int[] rellenarPares(int[] lista) {
        Random generador = new Random();

        for (int i = 0; i < lista.length; i++) {
            int numero;
            do {
                numero = generador.nextInt(1, 101);
            } while (numero % 2 != 0);

            lista[i] = numero;
        }

        Arrays.sort(lista);
        return lista;
    }

    // Main donde vamos a ejecutar la función
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int longitudArray;

        System.out.println("De qué longitud quieres que se cree la lista");
        longitudArray = sc.nextInt();

        int[] lista = new int[longitudArray];

        int[] Resultado = rellenarPares(lista);

        System.out.println("La lista rellenada fue " + Arrays.toString(Resultado));
    }
}