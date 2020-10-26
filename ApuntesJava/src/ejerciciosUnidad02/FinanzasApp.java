package ejerciciosUnidad02;
import java.util.Scanner;


public class FinanzasApp {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double dinero;
		int opcion;	//Sirve para seleccionar dolares o euros en el primer do-while
		int opcion2;	//Una vez hecha la conversion dolares-euros sirve para hacer mas o no
		int opcion3;	//Una vez hecha la conversion euros-dolares sirve para hacer mas o no
		int opcion4; //regula si el usuario quiere establecer un cambio
		
		Finanzas operacion1 = new Finanzas();
		
		double cambio = operacion1.getDolarEuro();
		
		
		
		
		do {

			System.out.println("¿Que moneda quieres introducir?");
			System.out.println("El cambio dolar-euro esta a: "+cambio);
			System.out.println("1. Dolares");
			System.out.println("2. Euros");
			opcion = entrada.nextInt();
			
			
		
		
		if (opcion==1) {
			
			do {
				
				System.out.println("Introduce el dinero en dolares:");
				dinero = entrada.nextDouble();
				Finanzas dolares = new Finanzas(cambio);
				
				System.out.println("Con el cambio actual lo introducido equivale a "+dolares.dolaresToEuros(dinero)+" Euros");
				
				System.out.println();
				System.out.println("Desea hacer otra conversion con este cambio");
				System.out.println("1. Si");
				System.out.println("2. No");
				opcion2 = entrada.nextInt();
				
				
			} while (opcion2<2 || opcion2>2);
			
			
			
		}else {
			
			do {
				
				System.out.println("Introduce el dinero en euros:");
				dinero = entrada.nextDouble();
				Finanzas euros = new Finanzas(cambio);
				System.out.println("Con el cambio actual lo introducido equivale a "+euros.eurosToDolares(dinero)+" Dolares");
				System.out.println();
				System.out.println("Desea hacer otra conversion con este cambio");
				System.out.println("1. Si");
				System.out.println("2. No");
				opcion3 = entrada.nextInt();
				
				
			} while (opcion3<2 || opcion3>2);
		}
		
		
		do {
			
			System.out.println("Desea usted establecer un nuevo cambio");
			System.out.println("1. SI");
			System.out.println("2. NO");
			opcion4 = entrada.nextInt();
			
			
		}while(opcion4<1 || opcion4>2);
		
		
		if(opcion4==1) {
			System.out.println("Introduce el nuevo cambio");
			cambio = entrada.nextDouble();
			
			opcion = 4; //Para forzar nuevamente la ejecucion del do-while
		}else {
			
			
			opcion = 1; //Con esto finalizamos el do-while
		}
		
		
		
		
		
		} while (opcion<1 || opcion>2);
		
		
		
		entrada.close();
		
	}

}