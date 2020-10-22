package pruebas;

//Se hara lo mismo que en el ejercicio 12 pero esta vez usando la clase String

import java.util.Scanner;
public class Ejercicio12String {
  public static void main (String args[]){

      int numero = 1234;
      String numeroS = Integer.toString(numero);
      int numCifras;
      int numeroInvertido;
      String numI ="";
      
      System.out.println("El numero introducido es: "+numero);

      numCifras = numeroS.length()-1;

      while (numCifras>=0) {
    	  numI = numI + numeroS.charAt(numCifras);

          numCifras--;
      }
      System.out.print(numI);
      //Convertimos de tipo String a int nuevamente
      numeroInvertido = Integer.parseInt(numI);



  }
}