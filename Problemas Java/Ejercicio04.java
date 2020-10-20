//Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el
//precio final con IVA. El IVA será una constante (21%)
import java.util.Scanner;
public class Ejercicio04{
	public static void main (String args[]){
		
		Scanner entrada = new Scanner (System.in);
		
		final double iva = 0.21;
		double precioBase;
		double precioFinal;
		
		System.out.println("Introduce el precio base del producto que desees:");
		precioBase = entrada.nextDouble();
		entrada.close();
		precioFinal = precioBase + precioBase * iva;
		
		System.out.println("El precio final de tu producto es "+precioFinal);
		
		
		
		}
	}
