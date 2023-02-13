package modelo;

public class Ganador {
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Ganador(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Ganador() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Ganador [nombre=" + nombre + "]";
	}
	
	
}
