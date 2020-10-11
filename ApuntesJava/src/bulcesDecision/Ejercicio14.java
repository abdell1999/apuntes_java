package bulcesDecision;
import java.util.Scanner;



//Hacer un programa que imprima el mayor y el menor de una serie de
//cinco numeros que vamos introduciendo por teclado.
public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		int maximo = -2147483648;	//Aqui he inicializado la variable con el numero mas pequeño que podia almacenar un int
		int minimo = 2147483647;	//Aqui he inicializado la variable con el numero mas grande que podia almacenar un int
		int numerosintroducidos = 0;
		
		do {
			System.out.println("Numero:");
			numero = entrada.nextInt();	//Pido un entero por consola
			
			
			if (numero>maximo) {	//En este if compruebo si el numero que me han dado es el mayor, al hacer la comprobacion el numero
									//dara siempre que es mayor y de alli viene el porque inicialice la variabe con ese dato, asi en posteriores
									//iteraciones lo que haran es compararse entre ellos todos los numeros
				maximo = numero;
			}
			
			if (numero<minimo) {	//Lo mismo que he explicado con el maximo pero en este caso con el minimo
				minimo = numero;
			}
			
			numerosintroducidos++;	//Aumento en 1 el contador de numeros porque quiero llegar a un numero determinado.
			
		} while(numerosintroducidos <5);
		
		entrada.close();
		System.out.println("El mayor es: "+maximo);
		System.out.println("El menor es: "+minimo);
			
			
		}
		
		
		
		
		
		
	
		
		
		
		
	}
