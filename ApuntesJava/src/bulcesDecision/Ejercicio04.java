package bulcesDecision;



//Hacer un programa que imprima la suma de los 100 primeros numeros
public class Ejercicio04 {

	public static void main(String[] args) {
		
		int numero = 1;
		int suma = 0;
		
		
		while (numero<=100) {
			
			suma += numero;
			numero++;
		}
		
		System.out.println("La suma de los 100 primeros numero es: "+suma);
		

	}

}
