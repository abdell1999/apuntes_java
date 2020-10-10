package bulcesDecision;
import java.util.Scanner;



//Hacer un programa que imprima el mayor y el menor de una serie de
//cinco numeros que vamos introduciendo por teclado.
public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		int maximo = -2147483648;
		int minimo = 2147483647;
		int numerosintroducidos = 0;
		
		do {
			System.out.println("Numero:");
			numero = entrada.nextInt();
			
			
			if (numero>maximo) {
				maximo = numero;
			}
			
			if (numero<minimo) {
				minimo = numero;
			}
			
			numerosintroducidos++;
			
		} while(numerosintroducidos <5);
		
		entrada.close();
		System.out.println("El mayor es: "+maximo);
		System.out.println("El menor es: "+minimo);
			
			
		}
		
		
		
		
		
		
	
		
		
		
		
	}
