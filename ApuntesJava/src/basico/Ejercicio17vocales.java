package basico;

public class Ejercicio17vocales {
	
	public static void main(String[] args) {
		
		char[] vocales = new char[5]; //Donde esta puesto el 5 pon el numero de vocales que quieras
		

		char caracter;
		for (int i=0; i<vocales.length;) {
			caracter = (char) (Math.random()*223 + 32);
			
			if(caracter=='a' || caracter=='e' || caracter=='i' || caracter=='o' || caracter =='u' ||
					caracter=='A' || caracter=='E' || caracter=='I' || caracter=='O' || caracter =='U') {
			vocales[i] = caracter;
			i++;
			
		}

		}
		
		System.out.println("Las vocales generadas son:");
		for(int i=0;i<vocales.length;i++) {
			System.out.print(vocales[i]+" ");
			
		}
		
	}
}