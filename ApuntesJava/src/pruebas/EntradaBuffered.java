package pruebas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class EntradaBuffered {

	public static void main(String[] args) throws IOException {	//Es necesario contemplar excepciones por eso creo que es una mierda
		//mejor usar objetos de tipo Scanner
		
		//BufferedReader bf = new BufferedReader (new InputStreamReader(System.in)); esto para simplificar podriamos haber hecho
		InputStreamReader isr = new InputStreamReader(System.in);	//Creamos un objeto isr del tipo InputStreamReader
		BufferedReader bf = new BufferedReader (isr);	//creamos un objeto llamado bf del tipo BufferedReader
		//Al igual que JOptionPane almacena strings
		
		String nombre;
		
		System.out.println("Ingrese su nombre");
		nombre = bf.readLine();
		
		System.out.println(nombre);
		
		//Como procesa todo como string hay que usar los metodos que usabamos con JOptionPane para
		//convertir a double, int o char
		
		
		int numero;
		double numero2;
		char caracter;
		
		System.out.println("Introduce un int");	//Introducir un int
		numero = Integer.parseInt(bf.readLine());
		System.out.println(numero);
		
		
		System.out.println("Introduce un double");	//Introducir un double
		numero2 = Double.parseDouble(bf.readLine());
		System.out.println(numero2);
		
		
		System.out.println("Introduce un caracter");
		caracter = bf.readLine().charAt(0);
		System.out.println(caracter);
	}

}