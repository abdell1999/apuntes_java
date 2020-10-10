package bulcesDecision;
import java.util.Scanner;


//Introducir un numero por teclado. Que nos diga si es par o impar.
public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
	
		int numero;
		
		System.out.println("Introduce un numero para saber si es par o impar");
		numero = entrada.nextInt();
		entrada.close();
		if (numero%2==0) {
			
			System.out.println("El numeor es par");
		}else {
			
			System.out.println("El numero es impar");
		}
		
		
		
	}

}
