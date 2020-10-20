package ejerciciosUnidad02;
import java.util.Scanner;


public class FinanzasApp {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double valor;
		
		Finanzas cambio;
		cambio = new Finanzas();

		System.out.println("Conversión a " + cambio.getDolarEuro());
		System.out.println("¿Cual es el precio en euros?");
		valor = entrada.nextDouble();
		System.out.println(cambio.eurosToDolares(valor));
		System.out.println("¿Cual es el precio en dolares?");
		valor = entrada.nextDouble();
		System.out.println(cambio.dolaresToEuros(valor));
		
		double actual;
		System.out.println("¿Cual es el cambio actual Dolar a Euro?");
		actual = entrada.nextDouble();
		Finanzas cambio2;
		
		cambio2 = new Finanzas(actual);

		System.out.println("Conversión a " + cambio2.getDolarEuro());
		System.out.println("¿Cual es el precio en euros?");
		valor = entrada.nextDouble();
		System.out.println(cambio2.eurosToDolares(valor));
		System.out.println("¿Cual es el precio en dolares?");
		valor = entrada.nextDouble();
		System.out.println(cambio2.dolaresToEuros(valor));
		
		entrada.close();
	}

}
