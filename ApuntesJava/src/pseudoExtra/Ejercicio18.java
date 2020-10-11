package pseudoExtra;
import java.util.Scanner;



//Hacer un pseudocodigo que cuente las veces que aparece una determinada
//letra en una frase que introduciremos por teclado
public class Ejercicio18 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String frase;
		char[] caracterporcaracter;
		char caracter;
		int contador = 0;
		
		System.out.println("Introduce una frase y pulsa 'Enter'");
		frase = entrada.nextLine();
		caracterporcaracter = frase.toCharArray();
		
		
		System.out.println("Introduce el caracter que quieres buscar");	//Esto no lo pide el ejercicio pero creo que queda más completo
		caracter = entrada.nextLine().charAt(0);	//De cualquier forma si se quiere ir a lo simple solo hay que incializar caracter
		
		entrada.close();
		
		for (int i=0; i<caracterporcaracter.length;i++) {
			
			if(caracterporcaracter[i]==caracter) {
				contador++;
				
			}
			
		}
		
		System.out.println("El caracter "+caracter+" se ha encontrado "+contador+" veces en el texto");
		

	}

}
