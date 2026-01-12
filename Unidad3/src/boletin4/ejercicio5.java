package boletin4;

public class ejercicio5 {

    public static String revertir(String holamundo) {
    	return new StringBuilder(holamundo).reverse().toString();
    /*/El metodo Stringbuilder nos permite referenciiar a la cadena 
    	    y utilizar la herramienta reverse () para darle la vuelta  */
    	
        
    }

    public static void main(String[] args) {
        String holamundo = "Hola Mundo";
        System.out.println(revertir(holamundo));
        /* imprimimos el resultado de llamamdo al metodo a traves de la funcion/*/
        
    }
}