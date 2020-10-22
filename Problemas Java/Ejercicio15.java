//Pedir dia, mes y año y decir si es una fecha valida, suponiendo que todos los meses tienen 30 dias

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int dia, mes, año;  //Declaro las variables donde se almacenara la fecha
        boolean diaV, mesV, añoV;   //Declaro booleans dodne almacenare si la fecha es valida
        //La "V" final es de verificado, es decir sera true si es un valor valido


        System.out.println("Introduce una fecha y el programa te dira si es una fecha valida");
        System.out.println();   //Salto de linea estetico
        System.out.println("Introduce un dia"); //Pido el dia
        dia = entrada.nextInt();

        System.out.println();   //Salto de linea estetico
        System.out.println("Introduce el mes");
        mes = entrada.nextInt();    //Pido el mes

        System.out.println();   //Salto de linea estetico
        System.out.println("Introduce el año");
        año = entrada.nextInt();    //Pido el año

        entrada.close();    //Cierro la entrada porque ya no la necesito mas

        System.out.println();   //Salto de linea estetico

        if(dia<1 || dia>30){    //Compruebo que el dia introducido este en el rango correcto entre 1 y 30 segun el enunciado
            diaV = false;
        }else{
            diaV = true;
        }

        if(mes<1 || mes>12){    //Compruebo que el mes este entre 1 y 12
            mesV = false;
        }else{
            mesV = true;
        }

        if (año>0){ //Compruebo que el año introducido sea positivo
            añoV = true;
        }else{
            añoV = false;
        }


        if(diaV ==true && mesV ==true && añoV ==true){  //Si los boolean son positivos todos, es porque se han respetado los rangos de datos y por tanto la fecha es valida
                System.out.println("La fecha es valida");
                System.out.println(dia+"/"+mes+"/"+año);    //Muestro la fecha ya validada en un formato estandars
         }else{  //En caso contrario la fecha es invalida
            System.out.println("Fecha no valida");
        }

    }
}
