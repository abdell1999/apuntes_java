package pruebas;
import java.util.Scanner;


public class StringBinario {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduce un numero entero para converitlo a binario");
		numero = entrada.nextInt();
		System.out.println();
		entrada.close();
		System.out.println(Integer.toBinaryString(numero));
		
		
		
	}
	
}
