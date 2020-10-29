package Ejercicio1;

public class Termometro {
	private double valor;
	
	public Termometro(double valor) {
		this.valor = valor;
	}
		
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double celsiusToFarenheit() {
		return 1.8 * valor + 32;
	}
	public double farenheitToCelsius() {
		return (valor - 32) / 1.8;
	}
	
}
