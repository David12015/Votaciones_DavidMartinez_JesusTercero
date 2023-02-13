package modelo;

public class Info {
	private String cantanteVotado;
	private int id;
	public String getCantanteVotado() {
		return cantanteVotado;
	}
	public void setCantanteVotado(String cantanteVotado) {
		this.cantanteVotado = cantanteVotado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Info(String cantanteVotado, int id) {
		super();
		this.cantanteVotado = cantanteVotado;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Info [cantanteVotado=" + cantanteVotado + ", id=" + id + "]";
	}
}
