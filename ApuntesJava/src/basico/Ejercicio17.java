package basico;

public class Ejercicio17 {
	
	
	public static char getLetraMinuscula() { //Reutilizamos el codigo de un ejercicio anterior
		return (char) (Math.random()*26 + 'a');
		}
	
	public static char getLetraMayuscula() { 
		return (char) (Math.random()*26 + 'A');
		}
	
	public static char getCaracterImprimible() { 
		return (char) (Math.random()*223 + 32);
		}
	

	public static void main(String[] args) {
		
		
		//Generara 5 letras minusculas
		System.out.println("5 letras minusculas:");
		
		for (int i=0; i<5; i++) {
			System.out.print(getLetraMinuscula()+ " ");
		}
		
		System.out.println(); //Salto de linea
		
		//Generara 5 letras minusculas
		System.out.println("5 letras mayusculas:");
		for (int i=0; i<5; i++) {
			System.out.print(getLetraMayuscula()+ " ");
		}
		
		System.out.println(); // Salto de linea
		
		//Generara 5 caracteres ascci imprimibles por pantalla
		System.out.println("5 caracteres ascci imprimibles por pantalla:");
		//Aqui estan incluidas letras mayusculas y minusculas, simbolos e incluso el
		//espacio...
		for (int i=0; i<5; i++) {
			System.out.print(getCaracterImprimible()+ " ");
		}
		
	}

}
