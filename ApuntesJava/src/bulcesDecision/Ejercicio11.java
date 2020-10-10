package bulcesDecision;
import java.util.Scanner;


//Imprimir y contar los multiplos de 3 desde la unidad hasta un numero que
//introducimos por teclado.
public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 3;
		int multiplos = 0;
		int numeroFinal;
		
		System.out.println("Escribe el numero final");
		numeroFinal = entrada.nextInt();
		entrada.close();
		
		while (numero<=numeroFinal) {
			
			System.out.println(numero);
			
			if (numero%3==0){
				
				multiplos++;
			}
			
			numero++;
		}
		
		System.out.println("El numero de multiplos en la lista es de: "+multiplos);
		
		
		
		
	}

}
