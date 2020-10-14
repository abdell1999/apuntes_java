package bulcesDecision;
import java.util.Scanner;

//Introducir un numero por teclado. Que nos diga si es positivo o negativo
public class Ejercicio09 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Introduce un numero para saber si es positivo o negativo");
		numero = entrada.nextInt();
		entrada.close();
		if (numero >=0) {
			
			System.out.println("El numero es positivo");
		}else {
			System.out.println("El numero es negativo");
		}
		
		

	}

}