//Pedir 3 numeros y mostrarlos ordenadors de mayor a menor

import java.util.Scanner;

public class Ejercicio10{
	public static void main (String args[]){
		
		Scanner entrada = new Scanner(System.in);
		
		int num1,num2,num3;
		int mayor, medio, menor;
		mayor = 0;	//Preguntar al profesor.
		
		
		System.out.println("Introduce 3 numeros y el programa te los ordenara de mayor a menor");
		System.out.println();
		System.out.println("Introduce el primer numero");
		num1 = entrada.nextInt();
		System.out.println();
		System.out.println("Introduce el segundo numero");
		num2 = entrada.nextInt();
		System.out.println();
		System.out.println("Introduce el tercer numero");
		num3 = entrada.nextInt();
		System.out.println();
		
		entrada.close();
		
		if ((num1>num2) && (num1>num3)){
			
			mayor = num1;
			
			if(num2>=num3){}
			medio = num2;
			menor = num3;
			}else {
				medio = num3;
				menor = num2;
				}
		
		if ((num2>num1) && (num2>num3)) {
			mayor = num2;
			
			if(num1>=num3) {
				medio = num1;
				menor = num3;
			}else {
				
				medio = num3;
				menor = num1;
			}
		}
		
		if ((num3>num1) && (num3>num2)) {
			
			mayor = num3;
			
			if (num1>=num2) {
				medio = num1;
				menor = num2;
			}else {
				medio = num2;
				menor = num1;
			}
			
			
			
			
		}
		
		
		
		
		System.out.println(mayor+" > "+medio+" > "+menor);
		
		
		}
	}
