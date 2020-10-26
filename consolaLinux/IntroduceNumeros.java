//Programa que en primer lugar te preguntara cuantos numeros quieres introducir, podemos obligar a que el usuario
//solo pueda introducir valores positivos mayores que 0.

//Una vez sabemos cuantos numeros quiere introducir el usuario, tenemos que contar cuantos numeros positivos se
//han introducido, cuantos negativos, cuantos pares y cuantos impares, por ultimo mostrar suma de positivos y negativos

//En ultimo lugar podemos añadir otras cosas (OPCIONAL)
//Si el usuario se arrepiente de un numero que introducido ya sea porque es muy grande o por cualquier cosa
//deberia poder cortar la ejecucion del programa
//Tambien deberiamos poder introducir numeros con parte decimal y poder tratarlos asi como si introducimos un caracter
//el programa deberia indicarlo




import java.util.Scanner;

public class IntroduceNumeros{
	public static void main (String args[]){

	Scanner entrada = new Scanner(System.in);

	int cuantos;	//Guarda el cuantos numeros quiere introducir el usuario
	int numeros;	//Los numeros que ira introduciendo el usuario se guardan aqui
	int numpositivos = 0;	//Contador que incrementa al introducir un numero positivo
	int numnegativos = 0;	//Contador que incrementa al introducir un numero negativo
	int numpares = 0;	//Contador que incrementa al introducir un numero par
	int numimpares = 0;	//Contador que incrementa al introducir un numero impar
	int sumanegativos = 0;	//Acumula la suma de numeros negativos
	int sumapositivos = 0;	//Acumula la suma de numeros positivos
	int sumapar = 0;	//Acumula la suma de numeros pares
	int sumaimpar = 0;	//Acumula la suma de numeros impares




	do{

	System.out.println("¿Cuantos numeros quieres introducir?");
	cuantos = entrada.nextInt();

	}while(cuantos<=0);	//Se repite hasta que el usuario introduzca un numero mayor que 0

	do{

	System.out.println("Introduce un numero");
	numeros = entrada.nextInt();
	cuantos--;	//Despues de introducir un numero se decrementa esta variable

	if (numeros>=0){

		numpositivos++;
		sumapositivos +=numeros;

	}else{

		numnegativos++;
		sumanegativos += numeros;

	}

	if (numeros%2==0){

		numpares++;
		sumapar += numeros;

	}else{

		numimpares++;
		sumaimpar += numeros;

	}


	}while(cuantos>0);	//Se repite tantas veces como haya indicado el usuario anteriormente



	System.out.println("Numeros positivos: "+numpositivos);
	System.out.println("Numeros negativos: "+numnegativos);
	System.out.println("Numeros pares: "+numpares);
	System.out.println("Numeros impares: "+numimpares);
	System.out.println("La suma de positivos es: "+sumapositivos);
	System.out.println("La suma de negativos es: "+sumanegativos);
	System.out.println("La suma de pares es: "+sumapar);
	System.out.println("La suma de impares es: "+sumaimpar);







    }
}
