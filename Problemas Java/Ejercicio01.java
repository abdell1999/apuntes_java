public class Ejercicio01{
	//Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta,
	//multiplicación, división y módulo (resto de la división)
	
	public static void main (String args[]){
	
	int num1,num2,suma,resta,multiplicacion,modulo;
	double division;
	num1 = 10;
	num2 = 1;
	
	//suma
	suma = num1+num2;
	
	//resta
	resta = num1-num2;
	
	//multiplicacion
	multiplicacion = num1*num2;
	
	//division
	division = num1/num2;
	
	//modulo
	modulo = num1%num2;
	
	
	System.out.println("Los numeros son: "+num1+" y "+num2);
	System.out.println("La suma es: "+suma+", la resta es: "+resta+", la multiplicacion: "+multiplicacion+", la division: "+division+" y el modulo es: "+modulo);
	
	}
}
