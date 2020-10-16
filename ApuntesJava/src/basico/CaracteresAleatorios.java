package basico;

public class CaracteresAleatorios {

	public static void main(String[] args) {
		
		int contador = 0;
		
		while (contador<5) {
			
			System.out.println((char)(Math.random()*26+'A'));
			contador++;
		}
		
		
		

	}

}
