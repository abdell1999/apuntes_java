package bulcesDecision;



//Imprimir y contar los numeros que son multiplos de 2 o de 3 que hay entre 1 y 100.
public class Ejercicio13 {

	public static void main(String[] args) {
		
		int numero = 1;
		int multiplos2o3 = 0;
		
		while (numero<=100) {
			
			if (numero%2==0 || numero%3==0) {
				multiplos2o3++;
				System.out.println(numero);
			}
			
			numero++;
		}
		
		System.out.println("El numero de multiplos de 2 o 3 entre 1-100 es: "+multiplos2o3);
		

	}

}
