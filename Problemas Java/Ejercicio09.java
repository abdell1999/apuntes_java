//Pedir dos numeros y mostrarlos ordenador de mayor a menor

import java.util.Scanner;

public class Ejercicio09{
	public static void main(String args[]){
		
		Scanner entrada = new Scanner(System.in);
		
		int numero1, numero2;
		
		
		System.out.println("Introduce dos numeros y el programa los mostrara ordenados de mayor a menos");
		System.out.println();
		System.out.println("Introduce el primer numero");
		numero1 = entrada.nextInt();
		System.out.println();
		System.out.println("Introduce el segundo numero");
		numero2 = entrada.nextInt();
		
		entrada.close();

		if (numero1>=numero2){
			
			System.out.println(numero1+" -> "+numero2);
			
			
			
			}else{

				System.out.println(numero2+" -> "+numero1);

			}
		
		
		}
	
	
	
	
	}
