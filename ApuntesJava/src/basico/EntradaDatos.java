package basico;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class EntradaDatos {

	public static void main(String[] args) {
		
		int entero;
		double decimal;
		char caracter;
		String cadena;
		
		
		
		Scanner entrada = new Scanner(System.in);
/*		
		//Procedemos a la entrada de datos mediante consola
		
		
		
		System.out.println("Introduce una cadena");
		cadena = entrada.nextLine();
		System.out.println(cadena);
		
		System.out.println("Introduce un caracter");
		caracter = entrada.next().charAt(0);
		System.out.println(caracter);
		
		System.out.println("Introduce un numero entero");
		entero = entrada.nextInt();
		System.out.println(entero);
		
		System.out.println("Introduce un numero decimal");
		decimal = entrada.nextDouble();
		System.out.println(decimal);
		

*/
		
		
		entero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un entero"));
		cadena = JOptionPane.showInputDialog("Introduce una cadena de texto");
		caracter = JOptionPane.showInputDialog("Introduce un caracter").charAt(0);
		decimal = Double.parseDouble(JOptionPane.showInputDialog("Introduce un decimal (Con punto)"));
		
		
		System.out.println(entero);
		System.out.println(cadena);
		System.out.println(caracter);
		System.out.println(decimal);
		
		
		Double decimal2;
		System.out.println("Introduce un decimal con coma");
		decimal2 = entrada.nextDouble();
		System.out.println(decimal2);
		
		entrada.close();
		
	/*
		
		Al introducir datos, por consola o por JOptionPane hay diferencias tales como que a la hora de poner Doubles
		por consola basta con ponerlos con coma (como siempre se ha hecho) en cambio al usar JOptionPane en vez de coma
		hay que usar punto. En ambos casos el sistema lo percibe como punto pero si usamos coma en JOptionPane da un error
		y el programa deja de ejecutarse.
		  
	*/
	
	}

}
