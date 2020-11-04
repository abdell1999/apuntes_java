/*
Escribe en Java una clase llamada MiNumero que calcule el doble, el triple y el cuádruple de un
número y permita sumarlo y restarlo con otros números. Los métodos de la clase deben ser:
• Constructor sin parámetros (establecerá el número a cero)
• Constructor con parámetro entero (asignará ese valor al número)
• Método cambiaNumero(int): permite asignar un nuevo valor al número
• Método suma(int): permite sumar una cantidad al número
• Método resta(int): permite restar una cantidad al número
• Método getValor(): devuelve el valor actual del número
• Método getDoble(): devuelve el doble del valor actual del número
• Método getTriple(): devuelve el triple del valor actual del número
• Método getCuádruple(): devuelve el cuádruple del valor actual del número
*/



public class MiNumero{

	private int numero;


	public MiNumero(){

	numero = 0;

	}

	public MiNumero(int numero){

	this.numero = numero;

	}

	public void cambiaNumero(int nuevoNumero){

	numero = nuevoNumero;

	}


	public void suma(int incremento){

	numero += incremento;

	}




	public void resta (int decremento){

	numero -=decremento;

	}



	public int getValor(){

	return numero;
	
	}


	public int getDoble(){

	return numero*2;

	}


	public int getTripe(){

	return numero*3;

	}



	public int getCuadruple(){

	return numero*4;

	}











}
