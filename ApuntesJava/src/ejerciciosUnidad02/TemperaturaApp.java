package ejerciciosUnidad02;
import java.util.Scanner;

public class TemperaturaApp {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double temperatura;
		int eleccion1;
		double convertido;
		
		do {
			System.out.println("Introduce un numero de acuerdo:");
			System.out.println("1.Introducir una temperatura en Celius");
			System.out.println("2.Introducir una temperatura en Farenheit");
			System.out.println("0.Salir");
			eleccion1 = entrada.nextInt();
			
			
			switch (eleccion1) {
			
			case 0:	
				System.exit(0);
				break;
			
			case 1: 
				System.out.println("Introduce Celsius");
				temperatura = entrada.nextDouble();
				Temperatura a = new Temperatura (temperatura);
				System.out.println ("La temperatura introducida es de "+temperatura+" grados Celsius");
				
				System.out.println(a.celsiusToFarenheit());
				
				break;
			
			case 2: 
				System.out.println("Introduce Farenheit");
				break;
			}
			
			
			
			
			
		}while(!(eleccion1==0) && !(eleccion1==1) && !(eleccion1==2));
		
		
		System.out.println("Fin del do-while");
		
		
		
	}

}
