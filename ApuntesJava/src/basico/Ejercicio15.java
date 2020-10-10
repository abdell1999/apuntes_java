package basico;

public class Ejercicio15 {

	public static void main(String[] args) {

		int num = 5;	//Se inicia la variable num con un valor de 5
		num += num - 1 * 4 + 1;	// Esto lo podemos traducir como num= num+num-1*4+1
		System.out.println(num); //Tras la operacion anterior num vale 7
		num = 4; num %= 7 * num % 3 * 7; //Al principio num vale 4
		
		//num%3, el resto de 4 entre 3 es 1
		//por tanto se queda en num %=49
		// 4 entre 49 tiene de resto 4
		//al operar nos da 4
		
		System.out.println(num);
		
		//finalmente comprobamos y sale lo que calculamos.
	
		
	}

}
