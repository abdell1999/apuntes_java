package basico;
import java.util.Scanner;


public class pruebas {
	
	
	
	static int numero = 5;
	static String saludo = "Hola";

	//Programa destinado a pruebas y movidas relacionadas con el paquete en el
	//que se encuentra.
	
	
	
	public static void main(String[] args) { // Metodo estatico que solo puede llamar a atributos estaticos

		
		
		Scanner entrada = new Scanner(System.in);
		//mejorar la explicacion de final y static
		//Solo se puede llamar a static porque el main lo es.
		System.out.println(numero);
		//Explicacion mas adelante en el modulo.
		System.out.println(saludo);
		
		System.out.println(2^2);
		

		entrada.nextLine();
		
		entrada.close();
	}

}
