//Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 dias (con o sin bisiestos).


import java.util.Scanner;


public class Ejercicio16 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int dia, mes, año;  //Datos que se pediran al usuario
        int diasMes;    //Variable que almacena cuantos dias tiene cada mes


        System.out.println("Introduce una fecha y el programa te dira si es una fecha valida");
        System.out.println();
        System.out.println("Introduce un dia");
        dia = entrada.nextInt();

        System.out.println();
        System.out.println("Introduce el mes");
        mes = entrada.nextInt();

        System.out.println();
        System.out.println("Introduce el año");
        año = entrada.nextInt();
        
        System.out.println();

        entrada.close();



        switch (mes) {
       
            case 10:   
            case 9:
                
                break;
               
            case 8:
            case 7:
            
                break;
               
            case 6:
                
                break;
            case 5:
                
                break;
               
            default:
                
                break;
            }


    }
}
