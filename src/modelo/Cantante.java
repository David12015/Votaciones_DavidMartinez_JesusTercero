package modelo;

public class Cantante {
	private String nombre;
	private String apellidos;
	private String cancion;
	private int votos;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCancion() {
		return cancion;
	}
	public void setCancion(String cancion) {
		this.cancion = cancion;
	}
	
	public int getVotos() {
		return votos;
	}
	public void setVotos(int votos) {
		this.votos = votos;
	}
	public Cantante(String nombre, String apellidos, String cancion, int votos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.cancion = cancion;
		this.votos = votos;
	}
	public Cantante() {
		super();
	}
	@Override
	public String toString() {
		return "Cantante [nombre=" + nombre + ", apellidos=" + apellidos + ", cancion=" + cancion + ", votos=" + votos
				+ "]";
	}
	
}
