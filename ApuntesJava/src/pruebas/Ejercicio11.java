package pruebas;

import java.util.Scanner;

public class Ejercicio11{
	public static void main(String args[]){
		
		Scanner entrada = new Scanner(System.in);
		int numero;
		String numeroS;
		
		do{
		System.out.println("Introduce un numero entre 0 y 9999");
		numero = entrada.nextInt();
		
		
		
		}while(!(numero>=0) || !(numero<=9999));
		entrada.close();
		numeroS= String.valueOf(numero);
		System.out.println("El numero introducido tiene "+numeroS.length()+" cifras");
		
		System.out.println("FIN DO-WHILE");
		}
	}
