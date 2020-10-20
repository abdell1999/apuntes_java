import java.util.Scanner;	

//Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos
//indicarlo



public class Ejercicio02{

	
	public static void main (String args[]){
	
		Scanner entrada = new Scanner (System.in);
	
		int numero;
		
		System.out.println("Introduce un numero para saber si es divisible entre 2");
		numero = entrada.nextInt();
		entrada.close();
		
		if (numero%2==0){
			
			System.out.println("El numero es divisible entre 2");
			
		}else{
			
			System.out.println("El numero no es divisible entre 2");
		}
	}
}
