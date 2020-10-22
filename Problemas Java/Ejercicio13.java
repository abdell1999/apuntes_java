//Pedir un numero entre 0 y 9999, decir si es capicua (si lee igual de derecha a izquierda que de izquierda a derecha)

import java.util.Scanner;

public class Ejercicio13 {

    public static int invertirNumero(int numero) {
        int cifra, numI = 0;
        while (numero != 0) { // en este while invierto las cifras del numero
            cifra = numero % 10;
            numI = (numI * 10) + cifra;
            numero /= 10;
        }

        return numI;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        do { // Este do-while lo he usado para asegurme que el usuario introduzca un numero
             // en el rango que quiero
             // si se introduce un numero fuera del rango este se vuelve a ejecutar

            System.out.println("Introduce un numero entre 0 y 9999");
            numero = entrada.nextInt();

        } while (!(numero >= 0) || !(numero <= 9999)); // Aqui especifico el rango de numeros que acepta el programa, si
                                                       // no se cumple se volvera a ejecutar una y otra vez
        // hasta que el usuario meta un numero entre 0 y 9999 ambos incluidos

        entrada.close(); // Ya no pedire mas datos por teclado asi que puedo liberar el espacio en
                         // memoria que este ocupa para tener un programa eficiente
        // esto en realidad no es necesario ya que los ordenador actuales tienen memoria
        // de sobra pero es una buena practica

        System.out.println(); // Un salto de linea unicamente estetico

        
        if (invertirNumero(numero) == numero){
            System.out.println("El numero "+numero+" es capicua");
        }else{
            System.out.println("El numero "+numero+" no es capicua");
        }


    }
}
