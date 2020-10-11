package bulcesDecision;
import java.util.Scanner;

//Hacer un programa que solo nos permita introducir S o N.
public class Ejercicio08 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		char introducido = 0;
		
		while (!(introducido=='S')&&!(introducido=='N')) {	//Mientras no se introduzca "S" o "N" se ejecutara indefinadamente
			System.out.println("Introduce S o N");
			introducido = entrada.next().charAt(0);
			
			
			if (introducido>=97 && introducido<=122){
			
				introducido -=32; 	//convertimos minusculas en mayusculas asi tambien captara la "s" y la "n"
			
			}
			
		}
		
		
		entrada.close();
	}

}
