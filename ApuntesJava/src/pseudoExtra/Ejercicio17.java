package pseudoExtra;
import java.util.Scanner;


//Imprimir, contar y sumar los multiplos de 2 que hay entre una serie de
//numeros, tal que el segundo sea mayor o igual que el primero
public class Ejercicio17 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num1;
		int num2;
		int suma = 0;
		int contador = 0;
		
		System.out.println("Introduzca el primer numero");
		num1 = entrada.nextInt();
		System.out.println("Introduce el segundo numero, este debe ser mayor o igual que el primero");
		num2 = entrada.nextInt();
		
		while(num2<=num1) {
			System.out.println("Introduce el segundo numero, este debe ser mayor o igual que el primero");
			num2 = entrada.nextInt();
		}
		
		
		entrada.close();
		
		while(num1<=num2) {
			
			if (num1%2==0) {
				
				System.out.print(num1+" ");
				contador++;
				suma +=num1;
				num1++;
				
			}
			num1++;
			
		}
		System.out.println();
		System.out.println("Hay "+contador+" multiplos de 2 en el rango especificado.");
		System.out.println("La suma de multiplos de 2 es: "+suma);
		
		

	}

}
