package basico;

public class Ejercicio14 {

	

	public static void apartadoA() {
		
		final int n1 = 50; // static solo se usa en metodos
		int n2 = 30, suma = 0, n3;//Aqui el error es que no se ha inicializado n3
		n3 = 7; //Asi que le doy un valor aleatorio
		suma = n1 + n2;
		System.out.println("La suma es: " + suma);
		suma = suma + n3; 
		System.out.println(suma);
		
	}
	
	public static void apartadoB() {
		
		int n1 = 5, n2 = 6;
		int suma = 0; //Aqui habia que cambiar el tipo de variable a int
		suma = n1 + n2;
		System.out.println("La suma es = "+suma); //Aqui faltaban comillas y concatenar
		//la cadena con la variable suma
		
	}
	
	public static void apartadoC() {
		
		int n = 8;
		int cuad = n * n; //cuad no estaba declarada
		System.out.println("El cuadrado de " + n + " es: " + cuad);
		//En java las mayusculas se distinguen de las minusculas N no es lo mismo que n
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		apartadoA();
		apartadoB();
		apartadoC();

	}

}
