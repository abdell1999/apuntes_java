//Se hara lo mismo que en el ejercicio 12 pero esta vez usando la clase String

import java.util.Scanner;
public class Ejercicio12String {
    public static void main (String args[]){

        Scanner entrada = new Scanner(System.in);
        int numero; //Aqui se almacenara el numero que introducira el usuario
        String numeroS; //Aqui almacenaremos numero pero esta vez convertido a String con todos los beneficios y metodos que esto supone
        int numCifras;  //Aqui se guardara el numero de cifras que tiene nuestro numero, lo cual sera muy util para ir recorriendolo
        String numI ="";    //Aqui se va almacenando el numero invertido
        int numeroInvertido;    //Aqui se almacena el String ya invertido pero esta vez en formato int que nos permite hacer operaciones y demas
        

        do{	//Este do-while lo he usado para asegurme que el usuario introduzca un numero en el rango que quiero
			//si se introduce un numero fuera del rango este se vuelve a ejecutar

		System.out.println("Introduce un numero entre 0 y 9999");
		numero = entrada.nextInt();
		
		
		
		}while(!(numero>=0) || !(numero<=9999));	//Aqui especifico el rango de numeros que acepta el programa, si no se cumple se volvera a ejecutar una y otra vez
		//hasta que el usuario meta un numero entre 0 y 9999 ambos incluidos

        entrada.close();    //Se cierra el objeto de tipo Scanner porque ya no lo necesitamos

        numeroS = Integer.toString(numero);   //Almaceno el numero que ha introducido el usuario en un String

        System.out.println("El numero introducido es: "+numero);    //Muestro por pantalla el numero que ha introducido el usuario
        System.out.println();
      numCifras = numeroS.length()-1;   //Hago que cifras tenga el valor del ultimo indice del numero que me han dado

      while (numCifras>=0) {    //Voy recorriendo todos los indices del numero
    	  numI = numI + numeroS.charAt(numCifras);  //Y almacenandolo en la variable numI

          numCifras--;  //Voy decrementando el indice para ir de derecha a izquierda
      }
      System.out.print("El numero invertido es: "+numI);    //Muestro el numero ya invertido

      System.out.println(); //salto de linea unicamente estetico

      //Convertimos de tipo String a int nuevamente
      numeroInvertido = Integer.parseInt(numI); //Convierto el numero invertido a int
      System.out.println(); //Salto de linea estetico
      System.out.println("Por utltimo para rematar convertimos nuevamente el numero a tipo int "+numeroInvertido);    //muestro el numero ya invertido y convertido a int



    }
}
