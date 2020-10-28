public class Temperatura {

	private double temperatura;
	
	
	public Temperatura(double temperatura) {
		
		this.temperatura = temperatura;
		
	}
	
	
	
	
	
	public  double farenheitToCelsius(){
		
		
		return (temperatura-32)/1.8;
	}
	
	
	public  double celsiusToFarenheit() {
		
		
		return 1.8*temperatura +32;
		
	}
}
