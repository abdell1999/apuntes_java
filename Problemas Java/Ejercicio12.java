//Pedir un numero entre 0 y 9999 y mostrarlo con las cifras al reves

import java.util.Scanner;	//Importamos esta libreria para poder usar objetos de la clase Scanner

public class Ejercicio12{
	public static void main(String args[]){
		
		Scanner entrada = new Scanner(System.in);	//Creamos un objeto de la clase Scanner y lo llamamos entrada, lo llamo entrada porque me acostumbre 
		//hay gente que prefiere llamarlo sc (de Scanner)

		int numero, cifra, inverso = 0;	//Declaramos de una las variables que vamos a usar e inicializamos inverso a 0 porque lo necesitaremos asi
		
		do{	//Este do-while lo he usado para asegurme que el usuario introduzca un numero en el rango que quiero
			//si se introduce un numero fuera del rango este se vuelve a ejecutar

		System.out.println("Introduce un numero entre 0 y 9999");
		numero = entrada.nextInt();
		
		
		
		}while(!(numero>=0) || !(numero<=9999));	//Aqui especifico el rango de numeros que acepta el programa, si no se cumple se volvera a ejecutar una y otra vez
		//hasta que el usuario meta un numero entre 0 y 9999 ambos incluidos
		
		
		entrada.close();	//Ya no pedire mas datos por teclado asi que puedo liberar el espacio en memoria que este ocupa para tener un programa eficiente
		//esto en realidad no es necesario ya que los ordenador actuales tienen memoria de sobra pero es una buena practica

		System.out.println();	//Un salto de linea unicamente estetico
		
		
		
        while(numero!=0){	//en este while invierto las cifras del numero 
            cifra = numero%10;
            inverso = (inverso * 10) + cifra;
            numero/=10;
        }
        System.out.println(inverso);
		
		}
	}

