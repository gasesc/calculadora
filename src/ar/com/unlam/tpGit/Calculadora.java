package ar.com.unlam.tpGit;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Integer a;
		Integer b;
		Integer opcion;
		Integer resultado;

		do {
			System.out.println("Ingrese el primer numero");
			a = teclado.nextInt();
			System.out.println("Ingrese el segundo numero");
			b = teclado.nextInt();

			System.out.println("Ingrese su operación \n 1 para sumar "
					+ "\n 2 para restar \n 3 para multiplicar \n 4 para dividir \n 5 para salir");
			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				resultado = a + b;
				System.out.println("el resultado es:" + resultado);
				break;
			case 2:
				resultado = a - b;
				System.out.println("el resultados es " + resultado);
				break;
			case 3: resultado= a*b;
			System.out.println("el resultados es " + resultado);
				break;
			case 4: resultado = a/b;	
			System.out.println("el resultados es " + resultado);
			break;
			case 5:System.out.println("adios");
			break;
			
			default: System.out.println(" error, digite otro numero ");
			}

		} while (opcion!=5);

		

}
}
