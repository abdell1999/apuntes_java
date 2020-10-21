package pruebas;

//Pedir un numero entre 0 y 9999 y mostrarlo con las cifras al reves

import java.util.Scanner;

public class Ejercicio12{
	public static void main(String args[]){
		
		Scanner entrada = new Scanner(System.in);
		int numero;
		String numeroS;
		int letras;
		String numeroI="";
		
		do{
		System.out.println("Introduce un numero entre 0 y 9999");
		numero = entrada.nextInt();
		
		
		
		}while(!(numero>=0) || !(numero<=9999));
		

		
		numeroS= String.valueOf(numero); //Tambien se puede usar Integer.toString();
		letras = numeroS.length();
		System.out.println();
		
		while (letras>=0){
			
			numeroI = numeroI + numeroS.charAt(letras);
			letras--;
		}
		
		System.out.println(numeroI);
	
	}
}