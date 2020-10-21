//Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII. Por
//ejemplo: si introduzco un 97, me muestre una 'a'
import java.util.Scanner;
public class Ejercicio03{
	public static void main (String args[]){
		
		Scanner entrada = new Scanner (System.in);
		
		
		int numero;

		
		System.out.println("Introduce un numero y se mostrara su correspondiete caracter ASCII");
		numero = entrada.nextInt();
		
		System.out.println("Tu caracter es el: "+(char)numero);
		
		
		
		
		//**modificacion para leer un caracter y mostrar un numero**
		
		entrada.nextLine();	//Lo que hacemos aqui es limpiar el buffer ya que de no limpiarlo al pedir otro dato nos dara error
		//De todas formas si quisieramos evitar esta linea podemos hacer el ejercicio por partes, es decir comentar la primera parte
		//y dejar la modificacion, pero prefiero ver todas las posibilidades.
		
		
		char caracter;
		
		System.out.println("Introduce un caracter para mostrar su numero en la tabla ASCII");
		caracter = entrada.nextLine().charAt(0);
		System.out.println("El numero del caracter introducido es: "+(int)caracter);
		entrada.close();
		
		}
	}
