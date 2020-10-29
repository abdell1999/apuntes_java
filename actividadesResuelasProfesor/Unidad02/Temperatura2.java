package Ejercicio1;

import java.util.Scanner;

public class Temperatura2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor;
		System.out.print("Valor > ");
		valor = teclado.nextInt();
		
		System.out.println(valor + " Farenheit: " + farenheitToCelsius(valor) + " Celsius ");
		System.out.println(valor + " Celsius: " + celsiusToFarenheit(valor) + " Farenheit ");
		teclado.close();
	}
	public static double celsiusToFarenheit(double v) {
		return 1.8 * v + 32;
	}
	public static double farenheitToCelsius(double v) {
		return (v - 32) / 1.8;
	}
}
