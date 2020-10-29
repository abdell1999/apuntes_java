import java.util.Scanner;

public class MiNumeroApp {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor;
		
		MiNumero m1 = new MiNumero();
		MiNumero m2 = new MiNumero(5);
		
		m1.suma(17);
		
		System.out.println(m1.getValor());
		
		m2.resta(17);
		
		System.out.println(m2.getValor());
		
		System.out.print("Valor > ");
		valor = teclado.nextInt();
				
		MiNumero m3 = new MiNumero(valor);
		
		System.out.println(m3.getValor());
		
		teclado.close();
	}
}
