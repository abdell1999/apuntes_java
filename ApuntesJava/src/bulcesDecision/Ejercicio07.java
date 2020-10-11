package bulcesDecision;
import java.util.Scanner;



//Introducir tantas frases como queramos y contarlas.
public class Ejercicio07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
	//	String frase; //Se puede eliminar y quitar la igualdad a entrada para quitar la advertencia
		//como no hacemos ninguna operacion con esta movida.
		
		int contador = 0;
		
		char continuar = 0;
		
		boolean fin = false;
		
		while(fin==false) {	//Mientras la variable fin este en falso se ejecuta esto.
		System.out.println("Introduce una frase y pulsa 'Enter'");
		//frase = entrada.nextLine();
		entrada.nextLine();
		contador++;	//Despues de introducir una frase aumenta en 1 el contador
		
		System.out.println("¿Quieres introducir otra frase?");
		continuar = entrada.nextLine().charAt(0);	//Cogemos el primer caracter de la cadena que se introduzca "S" o "N"
		if (continuar>=97 && continuar<=122){
			
			continuar -=32; 	//aqui lo que hacemos es convertir minusculas en mayusculas por si meten "s" o "n"
		
		}
		
		
		if(continuar=='N'){	//Si el usuario pulsa "N" o "n" el valor de fin cambia a true por tanto deja de ejecutarse el while
			fin = true;
		}
		
		
		
		
	}
		
		
		System.out.println("Has introducido: "+contador+" frases");	//Mostras por pantalla el valor de contador que iteraba con cada ciclo del while (cada frase)
		
		entrada.close();
	}

}