package ejercicio2;

public class Menor {
	public void menor(int temperatura) throws ExcepcionMenorTemperatura{
		if(temperatura<-273) {
			throw new ExcepcionMenorTemperatura("Nno puede haber temperaturas menores\r\n a -273 ºC");
		}
	}
}
