package modelo;

public class Cantante {
	public String nombre;
	public String apellidos;
	public String cancion;
	public int votos1825;
	public int votos2640;
	public int votos4165;
	public int votos66;
	public int andalucia;
	public int aragon;
	public int asturias;
	public int baleares;
	public int canarias;
	public int cantabria;
	public int castillaLaMancha;
	public int castillaLeon;
	public int cataluña;
	public int valencia;
	public int extremadura;
	public int galicia;	
	public int madrid;
	public int murcia;
	public int navarra;
	public int vasco;
	public int rioja;
	public int ceuta;
	public int melilla;
	
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
	public int getVotos1825() {
		return votos1825;
	}
	public void setVotos1825(int votos1825) {
		this.votos1825 = votos1825;
	}
	public int getVotos2640() {
		return votos2640;
	}
	public void setVotos2640(int votos2640) {
		this.votos2640 = votos2640;
	}
	public int getVotos4165() {
		return votos4165;
	}
	public void setVotos4165(int votos4165) {
		this.votos4165 = votos4165;
	}
	public int getVotos66() {
		return votos66;
	}
	public void setVotos66(int votos66) {
		this.votos66 = votos66;
	}
	public int getAndalucia() {
		return andalucia;
	}
	public void setAndalucia(int andalucia) {
		this.andalucia = andalucia;
	}
	public int getAragon() {
		return aragon;
	}
	public void setAragon(int aragon) {
		this.aragon = aragon;
	}
	public int getAsturias() {
		return asturias;
	}
	public void setAsturias(int asturias) {
		this.asturias = asturias;
	}
	public int getBaleares() {
		return baleares;
	}
	public void setBaleares(int baleares) {
		this.baleares = baleares;
	}
	public int getCanarias() {
		return canarias;
	}
	public void setCanarias(int canarias) {
		this.canarias = canarias;
	}
	public int getCantabria() {
		return cantabria;
	}
	public void setCantabria(int cantabria) {
		this.cantabria = cantabria;
	}
	public int getCastillaLaMancha() {
		return castillaLaMancha;
	}
	public void setCastillaLaMancha(int castillaLaMancha) {
		this.castillaLaMancha = castillaLaMancha;
	}
	public int getCastillaLeon() {
		return castillaLeon;
	}
	public void setCastillaLeon(int castillaLeon) {
		this.castillaLeon = castillaLeon;
	}
	public int getCataluña() {
		return cataluña;
	}
	public void setCataluña(int cataluña) {
		this.cataluña = cataluña;
	}
	public int getValencia() {
		return valencia;
	}
	public void setValencia(int valencia) {
		this.valencia = valencia;
	}
	public int getExtremadura() {
		return extremadura;
	}
	public void setExtremadura(int extremadura) {
		this.extremadura = extremadura;
	}
	public int getGalicia() {
		return galicia;
	}
	public void setGalicia(int galicia) {
		this.galicia = galicia;
	}
	public int getMadrid() {
		return madrid;
	}
	public void setMadrid(int madrid) {
		this.madrid = madrid;
	}
	public int getMurcia() {
		return murcia;
	}
	public void setMurcia(int murcia) {
		this.murcia = murcia;
	}
	public int getNavarra() {
		return navarra;
	}
	public void setNavarra(int navarra) {
		this.navarra = navarra;
	}
	public int getVasco() {
		return vasco;
	}
	public void setVasco(int vasco) {
		this.vasco = vasco;
	}
	public int getRioja() {
		return rioja;
	}
	public void setRioja(int rioja) {
		this.rioja = rioja;
	}
	public int getCeuta() {
		return ceuta;
	}
	public void setCeuta(int ceuta) {
		this.ceuta = ceuta;
	}
	public int getMelilla() {
		return melilla;
	}
	public void setMelilla(int melilla) {
		this.melilla = melilla;
	}
	public Cantante(String nombre, String apellidos, String cancion, int votos1825, int votos2640, int votos4165,
			int votos66, int andalucia, int aragon, int asturias, int baleares, int canarias, int cantabria,
			int castillaLaMancha, int castillaLeon, int cataluña, int valencia, int extremadura, int galicia,
			int madrid, int murcia, int navarra, int vasco, int rioja, int ceuta, int melilla) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.cancion = cancion;
		this.votos1825 = votos1825;
		this.votos2640 = votos2640;
		this.votos4165 = votos4165;
		this.votos66 = votos66;
		this.andalucia = andalucia;
		this.aragon = aragon;
		this.asturias = asturias;
		this.baleares = baleares;
		this.canarias = canarias;
		this.cantabria = cantabria;
		this.castillaLaMancha = castillaLaMancha;
		this.castillaLeon = castillaLeon;
		this.cataluña = cataluña;
		this.valencia = valencia;
		this.extremadura = extremadura;
		this.galicia = galicia;
		this.madrid = madrid;
		this.murcia = murcia;
		this.navarra = navarra;
		this.vasco = vasco;
		this.rioja = rioja;
		this.ceuta = ceuta;
		this.melilla = melilla;
	}
	public Cantante() {
		super();
	}
	@Override
	public String toString() {
		return "Cantante [nombre=" + nombre + ", apellidos=" + apellidos + ", cancion=" + cancion + ", votos1825="
				+ votos1825 + ", votos2640=" + votos2640 + ", votos4165=" + votos4165 + ", votos66=" + votos66
				+ ", andalucia=" + andalucia + ", aragon=" + aragon + ", asturias=" + asturias + ", baleares="
				+ baleares + ", canarias=" + canarias + ", cantabria=" + cantabria + ", castillaLaMancha="
				+ castillaLaMancha + ", castillaLeon=" + castillaLeon + ", cataluña=" + cataluña + ", valencia="
				+ valencia + ", extremadura=" + extremadura + ", galicia=" + galicia + ", madrid=" + madrid
				+ ", murcia=" + murcia + ", navarra=" + navarra + ", vasco=" + vasco + ", rioja=" + rioja + ", ceuta="
				+ ceuta + ", melilla=" + melilla + "]";
	}
}
