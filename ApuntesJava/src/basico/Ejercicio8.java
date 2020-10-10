package basico;

public class Ejercicio8 {
	
	
	
	 
	
	public static void apartadoA() {
		int a, b, c;
		a = 3;
		b = 4;
		c = a + 2 * b;
		c = c + b;
		b = c - a;
		a = b * c;
		System.out.println(a + b + c);
	}
	
	/*
	public static void apartadoB() {
		float x;
		x = 2.0; // Esta mal declarado, hay que añadir una f al final
		x = Math.pow((x + x), 2); //No se le puede pasar un float a Math.pow
		x = Math.sqrt(x + Math.sqrt(x) + 5); //No se le puede pasar un float a Math.sqrt
		System.out.println(x);
		
		
	}*/
	
	
	
/*	public static void apartadoC() {
		int x, y;
		boolean z;
		x = 5;
		y = x - 2;
		x = y * y + 1;
		z = (x > (y + 5));
		System.out.println(x + y + z); // No se pueden sumar enteros y booleanos
		
		
		
		
	}*/
	
	public static void apartadoD() {
		
		int a, b;
		a = 10;
		b = 5;
		a = b;
		b = a;
		System.out.println(a + b);
	}
	
	

	public static void main(String[] args) {
		
		apartadoA();
		//apartadoB();
		//apartadoC()
		apartadoD();
		
		
		
		

	}

}
