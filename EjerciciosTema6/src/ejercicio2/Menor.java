package ejercicio2;

public class Menor {
	

	public int poderMenor(int temperatura) throws ExcepcionMenorTemperatura{
		if(temperatura<-273) {
			throw new ExcepcionMenorTemperatura("No puede haber temperaturas menores a -273 ºC");
			
		}
		return temperatura;
	}

}
