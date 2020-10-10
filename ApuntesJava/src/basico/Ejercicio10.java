package basico;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		//Ejercicio que consiste en intercambiar el valor de tres variables
		
		int a,b,c, auxiliar, auxiliar2;
		
		a = 10;
		b = 20;
		c = 30;
		
		
		System.out.println("Antes de intercambiar: a = "+a+" b = "+b+ " c = "+c);
		
		auxiliar = b;
		b = a;
		auxiliar2 = c;
		c = auxiliar;
		a = auxiliar2;
		
		
		
		
		System.out.println("Después de intercambiar: a = "+a+" b = "+b+ " c = "+c);
		
		
		
	}
	
	
}
