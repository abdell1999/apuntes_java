package prueba;
import java.util.Scanner;
/* Programa simple para entender el funcionamiento de los arrays unidimensionales, cabe destacar que esta no
 * es la versi�n final ya que esta version es la bruta y se puede afinar bastante m�s por ejemplo en vez de meter
 * tanto c�digo en los switch, ese c�digo podr�a haberse puesto en un m�todo y en el switch solo llamarlo. Otra cosa por
 * ejemplo es mostrar el contenido del array usando for-each, etc.
 * 
 *  Como primera versi�n no esta nada mal y a lo mejor las correcciones se haran en otro programa donde se
 *  traten tambi�n array bidimensionales.*/




public class LlenarUnArrayPorTeclado {
	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int opcion;
		int tama�o;
		
		
		do {
			System.out.println("�De qu� tipo es el array que quieres crear?");
			System.out.println("1. int");
			System.out.println("2. double");
			System.out.println("3. char");
			System.out.println("4. String");
			opcion = entrada.nextInt();
		} while (opcion>4 || opcion<1);
		
		System.out.println("�Qu� tama�o tendr� tu array? (Solo se aceptan n�meros enteros crack)");
		tama�o = entrada.nextInt();
		
		
		switch (opcion) {
		
		case 1:
			int[] arrayEnteros = new int[tama�o];
			System.out.println("Introduzca valores para cada posici�n del array");
			for (int i = 0; i < arrayEnteros.length; i++) {
				System.out.print("Posicion ["+i+"]>");
				arrayEnteros[i] = entrada.nextInt();
			}
			
			System.out.println("Mostrando valores del array...");
			for (int i = 0; i < arrayEnteros.length; i++) {
				System.out.print(arrayEnteros[i]+" ");
			}
			
			
			
			
		break;
		
		case 2:
			double[] arrayDoubles = new double[tama�o];
			System.out.println("Introduzca valores para cada posici�n del array");
			for (int i = 0; i < arrayDoubles.length; i++) {
				System.out.print("Posicion ["+i+"]>");
				arrayDoubles[i] = entrada.nextDouble();	//Recordar que a la hora de introducir decimales por consola se usa coma al contrario que joptionpane
			}
			
			System.out.println("Mostrando valores del array...");
			for (int i = 0; i < arrayDoubles.length; i++) {
				System.out.print(arrayDoubles[i]+" ");
			}
		
		break;
			
		case 3:
			entrada.nextLine(); //Esto es para limpiar el buffer.
			char[] arrayChars = new char[tama�o];
			System.out.println("Introduzca valores para cada posici�n del array");
			for (int i = 0; i < arrayChars.length; i++) {
				System.out.print("Posicion ["+i+"]>");
				arrayChars[i] = entrada.nextLine().charAt(0);
			}
			
			System.out.println("Mostrando valores del array...");
			for (int i = 0; i < arrayChars.length; i++) {
				System.out.print(arrayChars[i]+" ");
			}
			
			
		break;
			
		case 4:
			entrada.nextLine(); //Ya que el buffer tiene almacenado un enter, al introducir el tama�o del array
			String[] arrayStrings = new String[tama�o];
			System.out.println("Introduzca valores para cada posici�n del array, dale enter para que te coja el String m�quina");
			for (int i = 0; i < arrayStrings.length; i++) {
				System.out.print("Posicion ["+i+"]>");
				arrayStrings[i] = entrada.nextLine();
			}
			
			System.out.println("Mostrando valores del array...");
			for (int i = 0; i < arrayStrings.length; i++) {
				System.out.print(arrayStrings[i]+" ");
			}
			
		break;
			
		
		}
		
		
		
		entrada.close(); //Cerrar el scanner, no es necesario pero as� el programa es mas elegante (SIN WARNINGS)
		
	}
	
	
	

}
