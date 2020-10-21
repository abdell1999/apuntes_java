//Pedir un número e indicar si es positivo o negativo.

import java.util.Scanner;

public class Ejercicio06{
	public static void main(String args[]){
		
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduce un numero y el programa te dira si es positivo o negativo");
		System.out.println();
		numero = entrada.nextInt();
		entrada.close();
		
		if (numero>=0){
			System.out.println("El numero es positivo");
			
			}else{
				
				System.out.println("El numero es negativo");
				}
		
		}
	
	}
