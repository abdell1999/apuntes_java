package pruebas;

import java.util.Scanner;


public class Ejercicio16 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int dia, mes, año;  //Datos que se pediran al usuario
        int diasMes = 0;    //Variable que almacena cuantos dias tiene cada mes
        boolean bisiesto;


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



        if(año % 4 == 0 && año % 100 != 0 || año % 400 == 0){
            bisiesto = true;
        }else{
            bisiesto = false;
        }





        switch (mes) {
       
            case 1:   
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diasMes = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diasMes = 30;
                break;
               
            case 2:
                
                if (bisiesto == true){
                    diasMes = 29;
                }else{
                    diasMes = 28;
                }



            break;
            }

            if(dia<=0 || dia>diasMes){
                System.out.println("El dia introducido no es valido");

            }else{
                System.out.println("Dia valido");
            }


            if(mes<=0 || mes>12){
                System.out.println("El mes introducido no es valido");

            }else{
                System.out.println("Mes valido");
            }

            if(año<0){
                System.out.println("El dia introducido no es valido");

            }else{
                System.out.println("Año valido");
            }



    }
}