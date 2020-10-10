package bulcesDecision;



//Hacer un programa que imprima los numeros del 1 al 100. Que calcule la
//suma de todos los numeros pares por un lado, y por otro, la de todos los
//impares
public class Ejercicio12 {

	public static void main(String[] args) {
		
		int numero = 1;
		int sumapar = 0;
		int sumaimpar = 0;
		
		while (numero<=100) {
			
			if(numero%2==0) {
				sumapar +=numero;
				numero++;
			}else {
				sumaimpar +=numero;
				numero++;
			}
			
			
		}
			
		System.out.println("La suma de los numeros pares es: "+sumapar);
		System.out.println("La suma de los numeros impares es: "+sumaimpar);
		
	}

}
