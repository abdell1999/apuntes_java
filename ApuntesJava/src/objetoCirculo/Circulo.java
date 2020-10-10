package objetoCirculo;

public class Circulo {
	
	private double r;
	
	public Circulo(double radio) {
		
		r = radio;
	}
	
	
	public double getArea() {
	return Math.PI*Math.pow(r, 2);
	}
	
	
	
	public double getLongitud() {
	return 2*Math.PI*r;
	}
	
	
	
	
	
	

}
