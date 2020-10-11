package bulcesDecision;




//Hacer un programa que imprima los numeros impares hasta el 100 y que
//imprima cuantos impares hay.
public class Ejercicio05 {

	public static void main(String[] args) {
		
		int numero = 1;
		int impares = 0;

		while (numero<=100) { //La variante respecto al de los pares es que iniciamos con el numero 1, y a partir de alli solo incrementar dos
							//A parte de llevar un contador que incremento cada vez.
			
			System.out.println(numero);
			numero += 2;
			impares++;
			
		}
		
		System.out.println("Son impares " +impares+" numeros");
		
		
		
		
	}

}
