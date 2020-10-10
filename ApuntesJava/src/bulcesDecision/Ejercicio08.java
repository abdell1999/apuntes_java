package bulcesDecision;
import java.util.Scanner;

//Hacer un programa que solo nos permita introducir S o N.
public class Ejercicio08 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		char introducido = 0;
		
		while (!(introducido=='S')&&!(introducido=='N')) {
			System.out.println("Introduce S o N");
			introducido = entrada.next().charAt(0);
			
			
			if (introducido>=97 && introducido<=122){
			
				introducido -=32; 
			
			}
			
		}
		
		
		entrada.close();
	}

}
