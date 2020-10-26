//Pedir un numero entre 0 y 9999 y decir cuantas cifras tiene

import java.util.Scanner;

public class Ejercicio11{
	public static void main(String args[]){
		
		Scanner entrada = new Scanner(System.in);
		int numero;
		int contador = 0;
/*
		String numeroS;
		
		do{
		System.out.println("Introduce un numero entre 0 y 9999");
		numero = entrada.nextInt();
		
		
		
		}while(!(numero>=0) || !(numero<=9999));
		
		entrada.close();
		
		numeroS= Integer.toString(numero); //Tambien se puede usar String.valueOf();
		System.out.println("El numero introducido tiene "+numeroS.length()+" cifras");
*/

                
                do{
                System.out.println("Introduce un numero entre 0 y 9999");
                numero = entrada.nextInt();
                
                
                
                }while(!(numero>=0) || !(numero<=9999));


		if (numero ==0){

			contador = 1;
		}
 
		while (numero!=0){
		numero /= 10;
		contador ++;

		}


		System.out.println("El numero tiene "+contador+" cifras");






		
		}
	}
