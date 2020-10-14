package pseudoExtra;
import java.util.Scanner;



//Calcular el factorial de un numero con metodos
public class Ejercicio20 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		
		int numero;
		
		System.out.println("Introduce un numero para calcular su factorial");
		numero = entrada.nextInt();
		
		
		
		System.out.println(factorial(numero));
		
		entrada.close();
	}



	public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) { //Multiplico n por i=1 que va iterando hasta llegar a n
            factorial *= i;
            
            //por ejemplo el factorial de 5 es (1*2*3*4*5)
        }
        return factorial;
    }







}
