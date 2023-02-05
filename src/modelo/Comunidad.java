package modelo;

public class Comunidad {    
    private String nombreComunidad;
	private int porcent1_9;
	private int porcent10_17;
	private int porcent18_25;
	private int porcent26_40;
	private int porcent41_65;
	private int porcent66;
	private int totalHabitantes;
	public String getNombreComunidad() {
		return nombreComunidad;
	}
	public void setNombreComunidad(String nombreComunidad) {
		this.nombreComunidad = nombreComunidad;
	}
	public int getPorcent1_9() {
		return porcent1_9;
	}
	public void setPorcent1_9(int porcent1_9) {
		this.porcent1_9 = porcent1_9;
	}
	public int getPorcent10_17() {
		return porcent10_17;
	}
	public void setPorcent10_17(int porcent10_17) {
		this.porcent10_17 = porcent10_17;
	}
	public int getPorcent18_25() {
		return porcent18_25;
	}
	public void setPorcent18_25(int porcent18_25) {
		this.porcent18_25 = porcent18_25;
	}
	public int getPorcent26_40() {
		return porcent26_40;
	}
	public void setPorcent26_40(int porcent26_40) {
		this.porcent26_40 = porcent26_40;
	}
	public int getPorcent41_65() {
		return porcent41_65;
	}
	public void setPorcent41_65(int porcent41_65) {
		this.porcent41_65 = porcent41_65;
	}
	public int getPorcent66() {
		return porcent66;
	}
	public void setPorcent66(int porcent66) {
		this.porcent66 = porcent66;
	}
	public int getTotalHabitantes() {
		return totalHabitantes;
	}
	public void setTotalHabitantes(int totalHabitantes) {
		this.totalHabitantes = totalHabitantes;
	}
	public Comunidad(String nombreComunidad, int porcent1_9, int porcent10_17, int porcent18_25, int porcent26_40,
			int porcent41_65, int porcent66, int totalHabitantes) {
		super();
		this.nombreComunidad = nombreComunidad;
		this.porcent1_9 = porcent1_9;
		this.porcent10_17 = porcent10_17;
		this.porcent18_25 = porcent18_25;
		this.porcent26_40 = porcent26_40;
		this.porcent41_65 = porcent41_65;
		this.porcent66 = porcent66;
		this.totalHabitantes = totalHabitantes;
	}
	public Comunidad() {
		super();
	}
	@Override
	public String toString() {
		return "Comunidad [nombreComunidad=" + nombreComunidad + ", porcent1_9=" + porcent1_9 + ", porcent10_17="
				+ porcent10_17 + ", porcent18_25=" + porcent18_25 + ", porcent26_40=" + porcent26_40 + ", porcent41_65="
				+ porcent41_65 + ", porcent66=" + porcent66 + ", totalHabitantes=" + totalHabitantes + "]";
	}
}
