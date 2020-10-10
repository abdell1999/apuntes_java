package basico;

public class Ejercicio11 {
		public static char getLetra() {
		return (char) (Math.random()*26 + 'a'); //Genera un caracter aleatorio después de la a minuscula, el numero de posiciones que se puede alejar de a como maximo es 26, que son las letras del alfabeto
		
		}
	
	
	
	
		public static void main(String[] args) {
		
			
			
			
			
		System.out.println(getLetra());
		System.out.println(getLetra());
		System.out.println(getLetra());
		System.out.println(getLetra());

		
		
		
	}
}

