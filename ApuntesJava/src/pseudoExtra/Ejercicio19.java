package pseudoExtra;
import java.util.Scanner;





//Hacer un pseudocodigo que simule el funcionamiento de un reloj digital y
//que permita ponerlo en hora.
public class Ejercicio19 {	//Bucle infinito que va generando la hora a partir de la que has dado, no es nada elegante pero es lo que se pide.

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int horas, minutos, segundos;

		
		do {
			
			System.out.println("Introduce la hora:");
			horas = entrada.nextInt();
			
		}while(horas>23 || horas<0);
		
		
		
		do {
			
			System.out.println("Introduce los minutos:");
			minutos = entrada.nextInt();
			
		}while(minutos>59 || minutos<0);
		
		
		do {
		
		System.out.println("Introduce los segundos");
		segundos = entrada.nextInt();
		
		}while(segundos>59 || segundos<0);
		
		
		
		for (int i=0;i>=0;i++) {
			
			System.out.println(horas+"h:"+minutos+"m:"+segundos+"s");
			segundos++;
			
			if (segundos==60) {
				
				segundos=0;
				minutos++;
				
				
			}
			if(minutos==60) {
				
				minutos=0;
				horas++;
				
				
			}
			
			
			if(horas==24) {
				
				horas=0;
			}
			
		}
		
		
		
		
		
		
		
		entrada.close();
	}

}
