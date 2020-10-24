import java.util.Scanner;

public class EntradaScanner{
	public static void main (String args[]){
		
	Scanner entrada = new Scanner(System.in);

	int entero;
	double decimal;
	char caracter;
	String cadena;
	
	System.out.println("Introduce un entero:");
	entero = entrada.nextInt();

	System.out.println();

	System.out.println("Introduce un numero con parte decimal(Con coma):");
	//Se pide por teclado un double, para introducir la parte decimal se usa coma aunque java lo
	//interpretara como un punto, de querer introducir un punto el programa dara error

	decimal = entrada.nextDouble();

	System.out.println();
	entrada.nextLine();

	System.out.println("Introduce una cadena");
	cadena = entrada.nextLine();
	

	System.out.println();

	System.out.println("Introduce un caracter");
	//Se pide una cadena pero solo se tendra en cuenta el primer elemento
	caracter = entrada.nextLine().charAt(0);
	entrada.close();

	System.out.println("entero = "+entero+"\ndecimal = "+decimal+"\nCadena = "+cadena+"\ncaracter = "+caracter);



  }
}
