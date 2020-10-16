package ejerciciosUnidad02;
import java.util.Scanner;

public class TemperaturaApp {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double temperatura;	//Esta es la temperatura que le tenemos que pasar al programa
		int eleccion1;	//Esta variable sirve apra seleccionar una opcion
		//Entre introducir celsius, farenheit o cerrar el programa
		int continuar;//Una vez que ya hayamos metido una temperatura esta variable sirve para saber si queremos meter otra
		
		do {
			System.out.println("Introduce un numero de acuerdo:");
			System.out.println("1.Introducir una temperatura en Celius");
			System.out.println("2.Introducir una temperatura en Farenheit");
			System.out.println("0.Salir");
			eleccion1 = entrada.nextInt();	//Almaceno el valor introducido por teclado para posteriormente ver si
			//se cumple la condicion del do-while
			
			
			switch (eleccion1) {	//Aqui he usado un switch porque es menos engoroso que usar ifs anidados y asi
			//desenpolvo mis conocimientos.
			
			case 0:	
				System.exit(0);	//Cierra el programa, lo posteior a esta linea ya no se mostrara
				break;	//Muy importante para cerrar un case
			
			case 1: 
				System.out.println("Introduce Celsius");
				temperatura = entrada.nextDouble();
				Temperatura a = new Temperatura (temperatura);
				//Como nos pedia el profesor creamos un objeto y le pasamos de parametro la temperatura que hemos pedido por teclado
				//Se puede hacer de forma mas simpe, revisar Ejercicio01.java en el mismo paquete
				System.out.println ("La temperatura introducida es de "+temperatura+" grados Celsius");
				System.out.println("La temperatura convertida a Farenheit es: "+a.celsiusToFarenheit()+"ºC");
				//Llamamos al metodo correspondiente para hacer la conversion del objeto creado anteriormente
				System.out.println();	//Este syso es por estetica para que no se vea todo muy junto
				break;	//Muy importante para cerrar un case
			
			case 2: 
				System.out.println("Introduce Farenheit");
				temperatura = entrada.nextDouble();
				Temperatura b = new Temperatura (temperatura);
				//Como nos pedia el profesor creamos un objeto y le pasamos de parametro la temperatura que hemos pedido por teclado
				//Se puede hacer de forma mas simpe, revisar Ejercicio01.java en el mismo paquete
				System.out.println ("La temperatura introducida es de "+temperatura+" grados Farenheit");
				System.out.println("La temperatura convertida a Celsius es: "+b.farenheitToCelsius()+"ºF");
				//Llamamos al metodo correspondiente para hacer la conversion del objeto creado anteriormente
				System.out.println();	//Este syso es por estetica para que no se vea todo muy junto
				break;	//Muy importante para cerrar un case
			}
			
			
			do {	//Una vez metida una temperatura se nos pregunta si queremos volver a ejecutar el programa y meter otra temperatura
				System.out.println("¿Quiere introducir otra temperatura?");
				System.out.println("0.Salir");
				System.out.println("1.Continuar");
				continuar = entrada.nextInt();
				
			}while(!(continuar==0) && !(continuar==1) );	//Tenemos que meter un 0 o 1 si no se ejecuta indefinidamente
			
			if (continuar==1) {	
				//Si queremos meter otra temperatura tenemos que modificar la variable que controla el do-while principal
				//ya que de no modificarlo se cierra independiemtemente de lo que hayamos puesto en el segundo do-while
				eleccion1=3;	//y como valor aleatorio metemos un 3 que hace que se vuelva a ejecutar el do-while principal
			}
			
			
		}while(!(eleccion1==0) && !(eleccion1==1) && !(eleccion1==2));
		//Nos va a estar pidiendo que metamos una opcion en el rango que hemos especificado si no se ejecutara indefinidamente
		//Igual la variable que controla esto deberia ser de tipo char ya que al ponerla int si metemos un caracter da un error.
		
		
		entrada.close();	//Cerramos la entrada asi liberamos la memoria ya que no lo necesitaremos mas en el programa
		//Hay tener mucho cuidado ya que si lo cerramos antes de tiempo si queremos usarlo nos dara error.
		
		System.out.println("Fin del programa");	//Este syso lo he usado para ir viendo cuando salia del do-while pero no molesta
		//asi que lo dejo
		
		
		
	}

}