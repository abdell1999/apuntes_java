package Ejercicio1;

import java.util.Scanner;

public class TermometroApp {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Termometro t;
		
		double valor;
		System.out.print("Valor > ");
		valor = teclado.nextDouble();
		t = new Termometro(valor);
		
		System.out.println(valor + " Farenheit: " + t.farenheitToCelsius() + " Celsius ");
		System.out.println(valor + " Celsius: " + t.celsiusToFarenheit() + " Farenheit ");
		teclado.close();
	}
}
