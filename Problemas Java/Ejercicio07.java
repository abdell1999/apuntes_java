//Pedir dos numeros y decir si uno es multiplo del otro

import java.util.Scanner;

public class Ejercicio07{
	public static void main(String args[]){
		
		Scanner entrada = new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.println("Introduce dos numeros y el programa te dira si uno es multiplo del otro");
		System.out.println();
		System.out.println("Introduce el primer numero");
		numero1 = entrada.nextInt();
		System.out.println();
		System.out.println("Introduce el segundo numero");
		numero2 = entrada.nextInt();
		entrada.close();
		System.out.println();
		
		if(numero1>=numero2){
			
			if (numero1%numero2==0){
				System.out.println(numero1+" es multiplo de "+numero2);
				
				}
			
			
			
			}else{
				
				if (numero2%numero1==0){
				System.out.println(numero2+" es multiplo de "+numero1);
				
				}
				
			}
		
		
		
		}
	
	
	
	}
