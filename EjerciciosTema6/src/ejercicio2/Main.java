package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  Crear un programa que convierta los grados Celsius a Fahrenheit y que tenga previsto un mecanismo para que
			al introducir una temperatura menor a -273 ºC, aparezca algún mensaje: “no puede haber temperaturas menores
			a -273 ºC” y vuelva a pedir la temperatura.
		 */

		Scanner sc=new Scanner(System.in);
		
		String aux;
		int temperatura;
		
		aux=sc.nextLine();
		temperatura=Integer.parseInt(aux);

			Menor m=new Menor();
		
		try {
			System.out.println(temperatura);

		}catch(ExcepcionMenorTemperatura){
			
		}
		

	}
	}
