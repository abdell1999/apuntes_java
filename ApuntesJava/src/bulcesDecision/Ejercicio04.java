package bulcesDecision;



//Hacer un programa que imprima la suma de los 100 primeros numeros
public class Ejercicio04 {

	public static void main(String[] args) {
		
		int numero = 1;
		int suma = 0;
		
		
		while (numero<=100) {	//Parecido a los anteriores pero en vez de mostrar los 100 numeros hay que almacenar su suma
			
			suma += numero;	//Aqui voy almacenando la suma
			numero++;	//Con este contador voy de numero en numero
		}
		
		System.out.println("La suma de los 100 primeros numero es: "+suma);
		

	}

}
