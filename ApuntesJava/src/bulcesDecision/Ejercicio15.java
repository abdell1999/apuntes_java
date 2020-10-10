package bulcesDecision;
import java.util.Scanner;


//Introducir dos numeros por teclado. Imprimir los numeros naturales que
//hay entre ambos numeros empezando por el m s pequeño, contar cuantos hay y
//cuantos de ellos son pares. Calcular la suma de los impares.

public class Ejercicio15 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, mayor, menor;
		int pares = 0;
		int sumaimpar = 0;
		
		System.out.println("Introduce el primer numero");
		num1 = entrada.nextInt();
		
		System.out.println("Introduce el segundo numero");
		num2 = entrada.nextInt();
		
		entrada.close();
		
		if(num1>num2) {
			mayor = num1;
			menor = num2;
		}else {
			mayor = num2;
			menor = num1;
		}
		
		while(menor<=mayor) {
			System.out.println(menor);
			if (menor%2==0) {
				pares++;
			} else {
				
				sumaimpar += menor;
				
			}
			
			
			menor++;
			
		}
		
		System.out.println("Entre ambos numeros hay "+pares+" son pares");
		System.out.println("La suma de los impares da "+sumaimpar);
		
		
		
		
	}

}
