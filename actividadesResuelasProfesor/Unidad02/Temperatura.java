import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor;
		System.out.print("Valor > ");
		valor = teclado.nextInt();
		
		System.out.println(valor + " Farenheit: " + (valor - 32) / 1.8 + " Celsius ");
		System.out.println(valor + " Celsius: " + 1.8 * valor + 32	+ " Farenheit ");
		teclado.close();
	}
}
