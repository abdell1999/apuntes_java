package basico;

public class Ejercicio9 {

	public static void main(String[] args) {
	//Se tienen dos variables, a y b. Escribe las asignaciones necesarias para intercambiar sus valores, sea cuales sean.

		
		//Para poder realzar este ejercicio a parte de las dos variables que dos da
		//el enunciado necesitaremos una auxiliar para usarla temporalmente
		
		
		
		
		int a, b, auxiliar;
		
		a = 10;
		b = 20;
		
		System.out.println("Antes de intercambiar: a = "+a+" b = "+b);
		
		auxiliar = a;
		a = b;
		b = auxiliar;
		
		System.out.println("Después de intercambiar: a = "+a+" b = "+b);
		
		
		
	}

}
