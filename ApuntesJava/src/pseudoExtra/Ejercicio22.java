package pseudoExtra;
import java.util.Scanner;



//Se nos pide hacer un programa que pida una frase por teclado y este la imprima 5 veces por pantalla
//en columnas diferentes, he optado por una tabulacion por impresion
public class Ejercicio22 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);	//Creo el objeto de tipo Scanner que leera los datos por consola
		String frase;	//Aqui se almacenara la frase que introducira el usuario
		String espacios = "";	//Con esta variable controlaremos el espacio que se deja cada vez que imprimimos la frase
		int contador = 0;	//Contador simple para limitar el numero de frases que mostraremos por pantalla
		System.out.println("introduce una frase");
		frase = entrada.nextLine();	//Almacenamos en frase lo que introduzca el usuario
		entrada.close();	//Cerramos el objeto de tipo Scanner para liberar memoria ya que no lo usaremos mas
		while(contador<5) {	//Hacemos que el bucle se ejecute 5 veces ya que el contador lo hemos inciado a 0 y nunca llegara a 5
			
			System.out.println(espacios+frase);	//Imprimimos por pantalla espacios que no vale nada ahora y la frase que ha introducido el usuario
			contador++;	//iteramos el contador
			espacios +="	";	//Almacenamos un tabulador en la variable espacio es decir con la siguiente ejecuccion la frase estaria
			//desplazada a la derecha un tab
		}
		
		
	}

}
