package ejerciciosUnidad02;

public class Finanzas {
	
	double euros;
	double dolares;
	
	
	public Finanzas() {
		
		euros = dolares*1.36;
		dolares = euros/1.36;
		
		
	}
	
	
	public Finanzas(double euros, double dolares) {
		
		this.euros = euros;
		this.dolares = dolares;
		
		
	}
	
	/*
	public double dolaresToEuros() {
		
		return dolares*1.36;
	}
	
	public double eurosToDolares() {
		
		return euros/1.36;
	}
	
	*/

}
