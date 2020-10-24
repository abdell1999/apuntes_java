//En esta clase realizaremos un menu simple en java, usando un do-while que solo nos permita introducir opciones
//en el rango que se especifica, con una opcion que detiene el programa sin tener en cuenta el resto del programa


import java.util.Scanner;	//Aqui se importa la libreria necesaria para entrada de datos


public class MenuSimple{
	public static void main (String args[]){

	Scanner entrada = new Scanner(System.in);	//Se crea un objeto de tipo Scanner

	int opcion;	//Declaramos un int para almacenar la opcion que seleccione el usuario

	
	System.out.println("Menu Simple hecho en java usando Do-while");	//Solo a modo de prueba

	System.out.println("Introduce una opcion, solo de las que se muestran por pantalla");
	//Le indicamos al usuario que tiene que introducir por teclado

	System.out.println();	//Salto de linea estetico

	do{

	System.out.println("0. Salir");
	System.out.println("1. Opcion 1");
	System.out.println("2. Opcion 2");
	System.out.println("3. Opcion 3");

	opcion = entrada.nextInt();	//Por teclado se esta esperando un entero de introducir otro tipo
	//de dato el programa dara error

	System.out.println();	//Salto de linea estetico para que no se vean las opciones muy juntas si se
	//ejecuta varias veces el bucle


	}while(opcion<0 || opcion >3);
	//El bucle se ejecutara mientras la opcion introducida sea menor que 0 o mayor que cero ya que las
	//posibilidades que admite son 0, 1, 2 y 3



	System.out.println("Has seleccionado la opcion numero: "+opcion);
	//Probamos que se haya almacenado el valor introducido en la variable opcion



	switch(opcion){

		case 0:
			System.exit(0);	//Con esto cerramos el programa sin tener en cuenta el resto del codigo fuera
			//del switch
		break;

		case 1:
			System.out.println("Lo que quieras que haga la opcion 1");

		break;


		case 2:

			System.out.println("Lo que quieras que haga la opcion 2");
			
		break;

		case 3:

			System.out.println("Lo que quieras que haga la opcion 3");

		break;
		}


		System.out.println("Fin del Switch");	//Prueba despues del switch

 }

}
