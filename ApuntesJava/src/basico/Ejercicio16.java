package basico;

public class Ejercicio16 {
	
	
	//Este programa calcula el area y el diametro de un circulo.

	public static void main(String[] args) {

		
		//area = pi por radio al cuadrado
		
		double area, radio, longitud;
		radio = 5;
		
		
		System.out.println("Radio: "+radio);
		area = Math.PI*Math.pow(radio, 2);
		
		System.out.println("El area del circulo es: "+area);
		System.out.printf ("Si redondemaos a dos decimales %.2f", area);
		
		System.out.println();
		
		//longitud
		longitud = 2*Math.PI*radio;
		
		System.out.println("La longitud del circulo es: "+longitud);
		System.out.printf ("Si redondemaos a dos decimales %.2f", longitud);

	}

}
