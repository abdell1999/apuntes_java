package basico;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		
		int i = 0x100; //Asigna un valor en hexadecimal
		i = i >>> 1; //Con >>> desplaza i una posicion a la derecha, esto se hace en binario por tanto pasamos de 256
					// que en binario seria 1 0000 0000
					// a 128 que sería      0 1000 0000
		
		
		System.out.println(i);
		
		
		

	}

}
