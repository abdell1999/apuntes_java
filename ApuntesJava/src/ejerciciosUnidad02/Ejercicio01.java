package ejerciciosUnidad02;

public class Ejercicio01 {

	public static double farenheitToCelsius(double f){
		
		
		return (f-32)/1.8;
	}
	
	
	public static double celsiusToFarenheit(double c) {
		
		
		return 1.8*c +32;
		
	}
	
	
	public static void main(String[] args) {

		
		double f = 145;
		
		
		System.out.println(farenheitToCelsius(f));
		System.out.println(celsiusToFarenheit(273.88888888888886));
	}

}
