//Pedir una nota entre 0 y 10 y decir suspenso, suficiente, bien, notable o sobresaliente

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int nota;
       
       
       
        do { // Este do-while lo he usado para asegurme que el usuario introduzca un numero
            // en el rango que quiero
            // si se introduce un numero fuera del rango este se vuelve a ejecutar

            System.out.println("Escribe una nota del 0 a 10");
            nota=entrada.nextInt();

       } while (!(nota >= 0) || !(nota <= 10)); // Aqui especifico el rango de numeros que acepta el programa, si
                                                      // no se cumple se volvera a ejecutar una y otra vez

        entrada.close(); //Cierro el Scanner




        switch (nota) {
       
        case 10:   
        case 9:
            System.out.println("Sobresaliente");
            break;
           
        case 8:
        case 7:
            System.out.println("Notable");
            break;
           
        case 6:
            System.out.println("Bien");
            break;
        case 5:
            System.out.println("Suficiente");
            break;
           
        default:
            System.out.println("Suspenso");
            break;
        }



    }
}
