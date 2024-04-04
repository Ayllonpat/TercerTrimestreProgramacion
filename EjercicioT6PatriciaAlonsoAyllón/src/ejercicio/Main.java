package ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String aux, codigoEmpleado = null;
		String ingresoCodigo;
		double totalTicket;
		int nOperaciones = 0;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		List<Double> operaciones=new ArrayList<Double>(nOperaciones);
		
		Caja c=new Caja("A1111", 100.10);
		
		try {
			
		System.out.println("Indique el código de trabajador:");
		ingresoCodigo=sc.nextLine();
		c.devolverExcepcionCodigo(codigoEmpleado, ingresoCodigo);
		
		}catch(ExcepcionCodigo co){
			System.out.println(co.getMessage());
		}
		
		try {
			System.out.println("Indique el número de operaciones realizadas:");
			aux=sc.nextLine();
			nOperaciones=Integer.parseInt(aux);
			c.devolverExcepcionNumeroNegativo(nOperaciones);
			try {
				System.out.println("Escriba el total del ticket:");
				aux=sc.nextLine();
				totalTicket=Double.parseDouble(aux);
				c.devolverExcepcionDineroRecaudado(totalTicket, nOperaciones, operaciones);
			}catch(ExcepcionDineroRecaudado dr) {
				System.out.println(dr.getMessage());
			}
		}catch(ExcepcionNumeroNegativo nn) {
			System.out.println(nn.getMessage());
		}
		

	}

}
