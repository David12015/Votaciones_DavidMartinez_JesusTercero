package modelo;

public class Porcentaje {
	private String rangoEdad;
	private double porcentajeEdad;
	public String getRangoEdad() {
		return rangoEdad;
	}
	public void setRangoEdad(String rangoEdad) {
		this.rangoEdad = rangoEdad;
	}
	public double getPorcentajeEdad() {
		return porcentajeEdad;
	}
	public void setPorcentajeEdad(double porcentajeEdad) {
		this.porcentajeEdad = porcentajeEdad;
	}
	public Porcentaje(String rangoEdad, double porcentajeEdad) {
		super();
		this.rangoEdad = rangoEdad;
		this.porcentajeEdad = porcentajeEdad;
	}
	public Porcentaje() {
		super();
	}
	@Override
	public String toString() {
		return "Porcentaje [rangoEdad=" + rangoEdad + ", porcentajeEdad=" + porcentajeEdad + "]";
	}
	
}
