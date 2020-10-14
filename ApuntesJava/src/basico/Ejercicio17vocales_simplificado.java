package basico;

public class Ejercicio17vocales_simplificado {

	public static void main(String[] args) {
		
		String vocales = "aeiou";
		int numvocales = 0;
	
		while (numvocales<5) {
			
			System.out.print(vocales.charAt((int)(Math.random()*5 + 0))+" "); // Pongo de max 5 ya que nunca llega y se coge la unidad sin tener en cuenta los decimales
			//En este casting se pierden datos.
			
			numvocales++;
		
		}

		
	//	System.out.println(Math.random()*7+1); Minimo 1 y Maximo 7;;;;;
		
	}
}
