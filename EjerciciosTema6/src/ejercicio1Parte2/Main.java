package ejercicio1Parte2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int opcion=0;
		String aux;
		
		Calculadora c=new Calculadora();
		
		/*do {
		
		aux=sc.nextLine();
		opcion=Integer.parseInt(aux);
		
		switch(opcion) {
		case 1:
			try {
				
			System.out.println(c.dividir(2,0));
			}catch(ArithmeticException dem){
				System.out.println("El denominador no puede ser 0");
			}catch(Exception e) {
				System.out.println("Error inesperado");
			}

			break;
		case 2:
			try {
				
				System.out.println(c.raizCuadrada(-25));
			}catch(Exception e) {
				System.out.println("Error inesperado");
			}
			break;
		}
		}while(opcion != 0);
		
		*/
		/*try {
			
			System.out.println(c.dividir(2,0));
			//System.out.println(c.raizCuadrada(-25));
		}catch(ArithmeticException dem){
			System.out.println("El denominador no puede ser 0");
		}catch(Exception e) {
			System.out.println("Error inesperado");
		}finally {
			System.out.println(c.raizCuadrada(-25));
		}*/
		
		do {
			
			try {
				
				System.out.println(c.dividir(2,0));
				System.out.println(c.raizCuadrada(-25));
				
			}catch(ArithmeticException dem){
				
				System.out.println("El denominador no puede ser 0");
				
			}catch(Exception e) {
				
				System.out.println("Error inesperado");
			}
		}while();
			
			
		

	
		
	}
}
