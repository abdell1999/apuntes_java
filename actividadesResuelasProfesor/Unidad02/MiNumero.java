public class MiNumero {
	private int valor;

	public MiNumero() {
		valor = 0;
	}
	
	public MiNumero(int numero) {
		valor = numero;
	}

	public void cambiaNumero(int nuevoNumero) {
		valor = nuevoNumero;
	}

	public void suma(int incremento) {
		valor += incremento;
	}
	
	public void resta(int decremento) {
		valor -= decremento;
	}

	public int getValor() {
		return valor;
	}
	
	public int getDoble() {
		int valorSalida = valor * 2; 
		return valorSalida;
	}
	public int getTriple() {
		return valor * 3;
	}
	public int getCuadruple() {
		return valor * 4;
	}
	
	
}
