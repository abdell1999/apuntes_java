//Pedir dos numeros y cual es mayor de los dos o si son iguales

import java.util.Scanner;

public class Ejercicio08{
	public static void main (String args[]){
		
		Scanner entrada = new Scanner(System.in);
		
		int numero1, numero2;
		
		
		System.out.println("Introduce dos numeros y el programa te dira cual es el mayor o si son iguales");
		System.out.println();
		System.out.println("Introduce el primer numero");
		numero1 = entrada.nextInt();
		System.out.println();
		System.out.println("Introduce el segundo numero");
		numero2 = entrada.nextInt();
		entrada.close();
		System.out.println();
	
		
		if (numero1>numero2){
			System.out.println("El mayor es el numero: "+numero1);
			}
		
		if (numero1<numero2){
			System.out.println("El mayor es el numero: "+numero2);
			}
		
		if (numero1==numero2){
			System.out.println("Los numeros son iguales");
			}
		
		
		System.out.println();
		System.out.println("FIN DEL PROGRAMA // A MODO DE PRUEBA");
		
		
		}
	
	}


