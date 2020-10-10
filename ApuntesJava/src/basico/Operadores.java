package basico;
import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		
		double num1, num2, suma, resta, mult, div, mod, raiz1, raiz2;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce dos numeros:");
		num1 = entrada.nextDouble();
		num2 = entrada.nextDouble();
		
		suma = num1+num2;
		resta = num1-num2;
		mult = num1*num2;
		div = num1/num2;
		mod = num1%num2;
		raiz1 = Math.sqrt(num1); //A math.sqrt hay que pasarle un double y devuelve un double
		raiz2 = Math.sqrt(num2); 
		
		entrada.close();
		
		System.out.println("Suma "+suma);
		System.out.println("Resta "+resta);
		System.out.println("Multiplicacion "+mult);
		System.out.println("Division "+div);
		System.out.println("Modulo "+mod);
		System.out.println("Raiz num1 "+raiz1);
		System.out.println("Raiz num2 "+raiz2);
		
		
		double redondeo1 = 4.716;
		float redondeo2 = 1.93f;
		long resultado1;
		int resultado2;
		
		resultado1 = Math.round(redondeo1);  //Se le pasa un double y devuelve un long
		resultado2 = Math.round(redondeo2);  //Se le pasa un float y devuelve un int
		
		System.out.println("Redondea "+redondeo1+" a "+resultado1);
		System.out.println("Redondea "+redondeo2+" a "+resultado2);
		
	}

}
