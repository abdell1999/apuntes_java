//Pedir dos números y decir si son iguales o no


import java.util.Scanner;
public class Ejercicio05{
	public static void main (String args[]){
		
		Scanner entrada = new Scanner (System.in);
		
		int numero1, numero2;
		
		System.out.println("Introduce dos numeros y el programa te dira si son iguales");
		System.out.println();
		System.out.println("Introduce el primer numero");
		numero1 = entrada.nextInt();
		System.out.println();
		System.out.println("Introduce el segundo numero");
		numero2 = entrada.nextInt();
		entrada.close();
		if (numero1==numero2){
			
			System.out.println("Los numeros son iguales");
			
			}else{
				System.out.println("Los numeros son diferentes");
				}
		
		
		
		}
	
	}
