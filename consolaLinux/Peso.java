/*

Crea una clase llamada Peso que tenga estas características:
•
Un constructor al que se le pase un peso y la unidad de medida en la que está tomado, que
puede ser Lb (libras), Oz (onzas), Kg (kilogramos) o g (gramos)
•
Un método getLibras() que nos devuelva el peso en libras.
•
Un método getOnzas() que nos devuelva el peso en onzas.
•
Un método getPeso() que nos devuelve el peso en kilogramos.

*/

public class Peso{

	private double peso;
	private String unidad;



	public Peso(double peso, String unidad){

	this.peso = peso;
	this.unidad = unidad;



	}

	public double getLibras(){
	
	double libras;

	if (unidad.equals("kg")){

	libras = peso * 2.20462;

	}

	if(unidad.equals("oz")){

	libras = peso * 0.0625;

	}else{

	libras = peso;

	}


	return libras;

	}


	public double getOnzas(){

	double onzas;

	if(unidad.equals("lb")){

	onzas = peso * 16;

	}

	if(unidad.equals("kg")){

	onzas = peso * 35.274;

	}else{

	onzas = peso;
	
	}

	return onzas;
	
	}



	public double getPeso(){

	double kilogramo;

	if (unidad.equals("lb")){

	kilogramo = peso * 0.453592;


	}

	if (unidad.equals("oz")){

	kilogramo = peso * 0.0283495;

	}else{

	kilogramo = peso;

	}

	return kilogramo;
	
	}




}
