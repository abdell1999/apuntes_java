package pruebas;

import java.util.Scanner;

public class IntercambioVariables{
	public static void main (String args[]){
		
		Scanner entrada = new Scanner(System.in);
		
		int numero1, numero2, auxiliar;
		
		//Usaremos dos metodos para realizar este ejercicio
		//Empezamos usando el metodo que requiere de una variable auxiliar
		
		System.out.println("Introduce el primer numero");
		numero1 = entrada.nextInt();
		
		System.out.println();
		
		System.out.println("Introduce el segundo numero");
		numero2 = entrada.nextInt();
		
		System.out.println();
		
		
		
		System.out.println("El primer numero es "+numero1+" y el segundo es: "+numero2);
		System.out.println();
		auxiliar = numero1;
		numero1 = numero2;
		numero2 = auxiliar;
		System.out.println("Despues del intercambio: "+numero1+ ", "+numero2);
		
		
		
		System.out.println();
		System.out.println();
		
		//Con sumas y restas
		
		System.out.println("Introduce el primer numero");
		numero1 = entrada.nextInt();
		
		System.out.println();
		
		System.out.println("Introduce el segundo numero");
		numero2 = entrada.nextInt();
		
		entrada.close();
		
		System.out.println();
		System.out.println("El primer numero es "+numero1+" y el segundo es: "+numero2);
		System.out.println();
		numero1 = numero1 + numero2;
		numero2 = numero1 - numero2;
		numero1 = numero1 - numero2;
		System.out.println("Despues del intercambio: "+numero1+ ", "+numero2);
		
		
		
		
		
		}
	
	
	
	}
