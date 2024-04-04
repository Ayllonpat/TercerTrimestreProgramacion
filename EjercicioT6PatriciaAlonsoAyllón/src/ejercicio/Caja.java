package ejercicio;

import java.util.List;

public class Caja {
	
	private String codigoEmpleado;
	private double totalRecaudado;
	
	public Caja(String codigoEmpleado, double totalRecaudado) {
		super();
		this.codigoEmpleado = codigoEmpleado;
		this.totalRecaudado = totalRecaudado;
	}
	
	public String getCodigoEmpleado() {
		return codigoEmpleado;
	}
	
	public void setCodigoEmpleado(String codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}
	
	public double getTotalRecaudado() {
		return totalRecaudado;
	}
	
	public void setTotalRecaudado(double totalRecaudado) {
		this.totalRecaudado = totalRecaudado;
	}
	
	@Override
	public String toString() {
		return "Caja [codigoEmpleado=" + codigoEmpleado + ", totalRecaudado=" + totalRecaudado + "]";
	}
	
	public double sumarTickets(double totalTicket, int nOperaciones, List<Double> operaciones) {
		double totalTicketFinal = 0;
		for (double ticket : operaciones) {
			totalTicketFinal=totalTicketFinal+totalTicket;
			return totalTicketFinal;
		}
		return totalTicketFinal;
	}
	
	public void devolverExcepcionCodigo(String codigoTrabajador, String ingresoCodigo) throws ExcepcionCodigo {
		if(codigoTrabajador!=ingresoCodigo) {
			throw new ExcepcionCodigo("El código ingresado no es correcto");
		}
	}
	
	public void devolverExcepcionDineroRecaudado(double totalTicket, int nOperaciones, List<Double> operaciones) throws ExcepcionDineroRecaudado {
		double totalTicketFinal;
		totalTicketFinal=sumarTickets(totalTicket, nOperaciones, operaciones);
		if(totalTicketFinal==totalRecaudado) {
			throw new ExcepcionDineroRecaudado("El dinero contado no coincide");
		}
	}
	
	public void devolverExcepcionNumeroNegativo(int nOperaciones) throws ExcepcionNumeroNegativo {
		if(nOperaciones<0) {
			throw new ExcepcionNumeroNegativo("El número de operaciones no puede ser negativo");
		}
	}

}
