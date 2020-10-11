package bulcesDecision;
import java.util.Scanner;


//Hacer un programa que imprima todos los numeros naturales que hay
//desde la unidad hasta un numero que introducimos por teclado.
public class Ejercicio06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 1;
		int numeroFinal;
		
		System.out.println("A partir del numero 1 has cual quiere mostrar por pantalla:");
		numeroFinal = entrada.nextInt();
		entrada.close();
		
		while (numero<=numeroFinal) {	//El numero al que queremos llegar lo pedimos por teclado :)
			
			System.out.println(numero);
			numero ++;
		}
		
		
		
		
		

	}

}
