package pruebas;
import java.util.Scanner;


//Creo que lo he resuelto de manera bastante eficiente pero en un futuro tambien habria que tener en cuenta la s y la n minusculas

public class IntroduceFrases {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);	//Se crea un objeto Scanner llamado entrada
		
		int contador = 0;	//Contador que incrementa con cada frase introducida.
		char continuar = 0;	//Se inicia a 0 porque requiere estar incializado y con valor diferente a S para evitar bucles infinitos
		
		
		do {
			
			System.out.println("Introduce una frase y pulsa 'Enter'");
			entrada.nextLine();	//De esta forma me evito tener que declarar un String ya que no la necesito almacenar solo contabilizarla
			//Por lo tanto es mas eficiente de esta forma
			contador++;	//Incremento en 1 el contador en 1 despues de introducir una frase y pulsar enter
			continuar = 0;	//Con esto evito un bucle infinito y hago que se ejecute el while
			
			while(!(continuar=='S')&&!(continuar=='N')) {	//Se ejecutara indefinidamente mientras no introduzcas S o N
				//Si introduces una S se ejecuta el do-while
				//Si introduce una N se cierra
				//Si introduces cualquier caracter que no sea S o N se repite el while
				System.out.println("¿Quieres introducir mas frases? Pulsa S/N, respeta las mayusculas");
				continuar = entrada.nextLine().charAt(0);	//Capturo por teclado un String y me quedo con el primer caracter, indice 0
				
			}
			
		}while(continuar=='S');	//Mientras se introduzca por teclado S se ejecutara
		
		entrada.close();	//Cierro el Scanner para que deje de consumir recursos
		System.out.println("has introducido "+contador+" frases.");

	}

}
