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
		
		while(fin==false) {
		System.out.println("Introduce una frase y pulsa 'Enter'");
		//frase = entrada.nextLine();
		entrada.nextLine();
		contador++;
		
		System.out.println("¿Quieres introducir otra frase?");
		continuar = entrada.nextLine().charAt(0);
		if (continuar>=97 && continuar<=122){
			
			continuar -=32; 
		
		}
		
		
		if(continuar=='N'){
			fin = true;
		}
		
		
		
		
	}
		
		
		System.out.println("Has introducido: "+contador+" frases");
		
		entrada.close();
	}

}