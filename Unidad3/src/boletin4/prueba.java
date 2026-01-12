package boletin4;

import java.util.Scanner;

public class prueba {
	
	public static double  calcularAreaRectangulo(double base, double altura) {
		double area;
		area = base * altura; 
		return area;
	}
	public static void main(String[] args) {
		double base;
		double altura;
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Base, altura");
		base=teclado.nextDouble();
		altura=teclado.nextDouble();
		
		System.out.println("El area es " +  calcularAreaRectangulo(base, altura));
		
		
		
	}

}
