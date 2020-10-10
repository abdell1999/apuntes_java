package bulcesDecision;




//Hacer un programa que imprima los numeros impares hasta el 100 y que
//imprima cuantos impares hay.
public class Ejercicio05 {

	public static void main(String[] args) {
		
		int numero = 1;
		int impares = 0;

		while (numero<=100) {
			
			System.out.println(numero);
			numero += 2;
			impares++;
			
		}
		
		System.out.println("Son impares " +impares+" numeros");
		
		
		
		
	}

}
