package modelo;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class Hilo extends Thread {
	private static String rango;
	private static String votado;
	private static String provincia;
	private static List<Cantante> listaCantante;
	private static List<Info> listaInfo = new ArrayList<Info>();
	private static int[] listaVotos1825 = new int[10];
	private static List<Ganador> listaGanador;

	public Hilo() {
		super();
	}

	public void aleatorio(int num) throws ClassNotFoundException, SQLException, IOException {
		if (rango == "RANGO_18_25") {
			if (num >= 0 && num <= 7) {
				this.votado = "Joel";
				listaCantante.get(0).setVotos1825(listaCantante.get(0).getVotos1825() + 1);
				sumarProvincia(0);
			} else if (num >= 8 && num <= 10) {
				this.votado = "Victoria";
				listaCantante.get(9).setVotos1825(listaCantante.get(9).getVotos1825() + 1);
				sumarProvincia(9);
			} else if (num >= 11 && num <= 23) {
				this.votado = "Thiago";
				listaCantante.get(3).setVotos1825(listaCantante.get(3).getVotos1825() + 1);
				sumarProvincia(3);
			} else if (num >= 24 && num <= 30) {
				this.votado = "Sarah";
				listaCantante.get(5).setVotos1825(listaCantante.get(5).getVotos1825() + 1);
				sumarProvincia(5);
			} else if (num >= 31 && num <= 37) {
				this.votado = "Elton";
				listaCantante.get(8).setVotos1825(listaCantante.get(8).getVotos1825() + 1);
				sumarProvincia(8);
			} else if (num >= 38 && num <= 51) {
				this.votado = "Amie";
				listaCantante.get(4).setVotos1825(listaCantante.get(4).getVotos1825() + 1);
				sumarProvincia(4);
			} else if (num >= 52 && num <= 61) {
				this.votado = "Nahid";
				listaCantante.get(6).setVotos1825(listaCantante.get(6).getVotos1825() + 1);
				sumarProvincia(6);
			} else if (num >= 62 && num <= 88) {
				this.votado = "Marc";
				listaCantante.get(1).setVotos1825(listaCantante.get(1).getVotos1825() + 1);
				sumarProvincia(1);
			} else if (num >= 89 && num <= 95) {
				this.votado = "Alba";
				listaCantante.get(2).setVotos1825(listaCantante.get(2).getVotos1825() + 1);
				sumarProvincia(2);
			} else if (num >= 96 && num <= 100) {
				this.votado = "Julio";
				listaCantante.get(7).setVotos1825(listaCantante.get(7).getVotos1825() + 1);
				sumarProvincia(7);
			}
		} else if (rango == "RANGO_26_40") {
			if (num >= 0 && num <= 14) {
				this.votado = "Joel";
				listaCantante.get(0).setVotos2640(listaCantante.get(0).getVotos2640() + 1);
				sumarProvincia(0);
			} else if (num >= 15 && num <= 20) {
				this.votado = "Victoria";
				listaCantante.get(9).setVotos2640(listaCantante.get(9).getVotos2640() + 1);
				sumarProvincia(9);
			} else if (num >= 21 && num <= 33) {
				this.votado = "Thiago";
				listaCantante.get(3).setVotos2640(listaCantante.get(3).getVotos2640() + 1);
				sumarProvincia(3);
			} else if (num >= 34 && num <= 40) {
				this.votado = "Sarah";
				listaCantante.get(5).setVotos2640(listaCantante.get(5).getVotos2640() + 1);
				sumarProvincia(5);
			} else if (num >= 41 && num <= 46) {
				this.votado = "Elton";
				listaCantante.get(8).setVotos2640(listaCantante.get(8).getVotos2640() + 1);
				sumarProvincia(8);
			} else if (num > 47 && num <= 58) {
				this.votado = "Amie";
				listaCantante.get(4).setVotos2640(listaCantante.get(4).getVotos2640() + 1);
				sumarProvincia(4);
			} else if (num >= 59 && num <= 65) {
				this.votado = "Nahid";
				listaCantante.get(6).setVotos2640(listaCantante.get(6).getVotos2640() + 1);
				sumarProvincia(6);
			} else if (num >= 66 && num <= 81) {
				this.votado = "Marc";
				listaCantante.get(1).setVotos2640(listaCantante.get(1).getVotos2640() + 1);
				sumarProvincia(1);
			} else if (num >= 82 && num <= 90) {
				this.votado = "Alba";
				listaCantante.get(2).setVotos2640(listaCantante.get(2).getVotos2640() + 1);
				sumarProvincia(2);
			} else if (num >= 91 && num <= 100) {
				this.votado = "Julio";
				listaCantante.get(7).setVotos2640(listaCantante.get(7).getVotos2640() + 1);
				sumarProvincia(7);
			}
		} else if (rango == "RANGO_41_65") {
			if (num >= 0 && num <= 5) {
				this.votado = "Joel";
				listaCantante.get(0).setVotos4165(listaCantante.get(0).getVotos4165() + 1);
				sumarProvincia(0);
			} else if (num >= 6 && num <= 15) {
				this.votado = "Victoria";
				listaCantante.get(9).setVotos4165(listaCantante.get(9).getVotos4165() + 1);
				sumarProvincia(9);
			} else if (num >= 16 && num <= 27) {
				this.votado = "Thiago";
				listaCantante.get(3).setVotos4165(listaCantante.get(3).getVotos4165() + 1);
				sumarProvincia(3);
			} else if (num >= 28 && num <= 33) {
				this.votado = "Sarah";
				listaCantante.get(5).setVotos4165(listaCantante.get(5).getVotos4165() + 1);
				sumarProvincia(5);
			} else if (num >= 34 && num <= 40) {
				this.votado = "Elton";
				listaCantante.get(8).setVotos4165(listaCantante.get(8).getVotos4165() + 1);
				sumarProvincia(8);
			} else if (num >= 41 && num <= 54) {
				this.votado = "Amie";
				listaCantante.get(4).setVotos4165(listaCantante.get(4).getVotos4165() + 1);
				sumarProvincia(4);
			} else if (num >= 55 && num <= 61) {
				this.votado = "Nahid";
				listaCantante.get(6).setVotos4165(listaCantante.get(6).getVotos4165() + 1);
				sumarProvincia(6);
			} else if (num >= 62 && num <= 71) {
				this.votado = "Marc";
				listaCantante.get(1).setVotos4165(listaCantante.get(1).getVotos4165() + 1);
				sumarProvincia(1);
			} else if (num >= 72 && num <= 88) {
				this.votado = "Alba";
				listaCantante.get(2).setVotos4165(listaCantante.get(2).getVotos4165() + 1);
				sumarProvincia(2);
			} else if (num >= 89 && num <= 100) {
				this.votado = "Julio";
				listaCantante.get(7).setVotos4165(listaCantante.get(7).getVotos4165() + 1);
				sumarProvincia(7);
			}
		} else if (rango == "RANGO_MAS_66") {
			if (num >= 0 && num <= 3) {
				this.votado = "Joel";
				listaCantante.get(0).setVotos66(listaCantante.get(0).getVotos66() + 1);
				sumarProvincia(0);
			} else if (num >= 4 && num <= 20) {
				this.votado = "Victoria";
				listaCantante.get(9).setVotos66(listaCantante.get(9).getVotos66() + 1);
				sumarProvincia(9);
			} else if (num >= 21 && num <= 25) {
				this.votado = "Thiago";
				listaCantante.get(3).setVotos66(listaCantante.get(3).getVotos66() + 1);
				sumarProvincia(3);
			} else if (num >= 26 && num <= 37) {
				this.votado = "Sarah";
				listaCantante.get(5).setVotos66(listaCantante.get(5).getVotos66() + 1);
				sumarProvincia(5);
			} else if (num >= 38 && num <= 49) {
				this.votado = "Elton";
				listaCantante.get(8).setVotos66(listaCantante.get(8).getVotos66() + 1);
				sumarProvincia(8);
			} else if (num >= 50 && num <= 58) {
				this.votado = "Amie";
				listaCantante.get(4).setVotos66(listaCantante.get(4).getVotos66() + 1);
				sumarProvincia(4);
			} else if (num >= 59 && num <= 65) {
				this.votado = "Nahid";
				listaCantante.get(6).setVotos66(listaCantante.get(6).getVotos66() + 1);
				sumarProvincia(6);
			} else if (num >= 66 && num <= 76) {
				this.votado = "Marc";
				listaCantante.get(1).setVotos66(listaCantante.get(1).getVotos66() + 1);
				sumarProvincia(1);
			} else if (num >= 77 && num <= 91) {
				this.votado = "Alba";
				listaCantante.get(2).setVotos66(listaCantante.get(2).getVotos66() + 1);
				sumarProvincia(2);
			} else if (num >= 92 && num <= 100) {
				this.votado = "Julio";
				listaCantante.get(7).setVotos66(listaCantante.get(7).getVotos66() + 1);
				sumarProvincia(7);
			}
		}
	}

	public void sumarProvincia(int num) {
		if (provincia.equals("Andalucia")) {
			listaCantante.get(num).setAndalucia(listaCantante.get(num).getAndalucia() + 1);
		} else if (provincia.equals("Aragon")) {
			listaCantante.get(num).setAragon(listaCantante.get(num).getAragon() + 1);
		} else if (provincia.equals("Asturias")) {
			listaCantante.get(num).setAsturias(listaCantante.get(num).getAsturias() + 1);
		} else if (provincia.equals("Baleares")) {
			listaCantante.get(num).setBaleares(listaCantante.get(num).getBaleares() + 1);
		} else if (provincia.equals("Canarias")) {
			listaCantante.get(num).setCanarias(listaCantante.get(num).getCanarias() + 1);
		} else if (provincia.equals("Cantabria")) {
			listaCantante.get(num).setCantabria(listaCantante.get(num).getCantabria() + 1);
		} else if (provincia.equals("Castilla La Mancha")) {
			listaCantante.get(num).setCastillaLaMancha(listaCantante.get(num).getCastillaLaMancha() + 1);
		} else if (provincia.equals("Castilla y Leon")) {
			listaCantante.get(num).setCastillaLeon(listaCantante.get(num).getCastillaLeon() + 1);
		} else if (provincia.equals("Catalunia")) {
			listaCantante.get(num).setCataluña(listaCantante.get(num).getCataluña() + 1);
		} else if (provincia.equals("Ceuta")) {
			listaCantante.get(num).setCeuta(listaCantante.get(num).getCeuta() + 1);
		} else if (provincia.equals("Comunidad Valenciana")) {
			listaCantante.get(num).setValencia(listaCantante.get(num).getValencia() + 1);
		} else if (provincia.equals("Extremadura")) {
			listaCantante.get(num).setExtremadura(listaCantante.get(num).getExtremadura() + 1);
		} else if (provincia.equals("Galicia")) {
			listaCantante.get(num).setGalicia(listaCantante.get(num).getGalicia() + 1);
		} else if (provincia.equals("La Rioja")) {
			listaCantante.get(num).setRioja(listaCantante.get(num).getRioja() + 1);
		} else if (provincia.equals("Madrid")) {
			listaCantante.get(num).setMadrid(listaCantante.get(num).getMadrid() + 1);
		} else if (provincia.equals("Melilla")) {
			listaCantante.get(num).setMelilla(listaCantante.get(num).getMelilla() + 1);
		} else if (provincia.equals("Murcia")) {
			listaCantante.get(num).setMurcia(listaCantante.get(num).getMurcia() + 1);
		} else if (provincia.equals("Navarra")) {
			listaCantante.get(num).setNavarra(listaCantante.get(num).getNavarra() + 1);
		} else if (provincia.equals("Pais Vasco")) {
			listaCantante.get(num).setVasco(listaCantante.get(num).getVasco() + 1);
		}
	}

	public void generarVoto(List<Cantante> listaCantante, List<Comunidad> listaComunidad,
			List<Porcentaje> listaPorcentaje, List<Info> listaInfo)
			throws ClassNotFoundException, SQLException, IOException, InterruptedException {

		int votosTotales = 0;
		Info info = null;

		for (int i = 0; i < listaComunidad.size(); i++) {
			provincia = listaComunidad.get(i).getNombreComunidad();
			int totalHabit = listaComunidad.get(i).getTotalHabitantes();
			// System.out.println(totalHabit);
			int votos1825 = listaComunidad.get(i).getPorcent18_25();
			int votos2640 = listaComunidad.get(i).getPorcent26_40();
			int votos4165 = listaComunidad.get(i).getPorcent41_65();
			int votos66 = listaComunidad.get(i).getPorcent66();

			double total1825 = Math.ceil(totalHabit * votos1825 / 100 * listaPorcentaje.get(2).getPorcentajeEdad() / 100);
			double total2640 = Math.ceil(totalHabit * votos2640 / 100 * listaPorcentaje.get(3).getPorcentajeEdad() / 100);
			double total4165 = Math.ceil(totalHabit * votos4165 / 100 * listaPorcentaje.get(4).getPorcentajeEdad() / 100);
			double total66 = Math.ceil(totalHabit * votos66 / 100 * listaPorcentaje.get(5).getPorcentajeEdad() / 100);

			if (total1825 < 3) {
				total1825 = 3;
			} else if (total2640 < 3) {
				total2640 = 3;
			} else if (total4165 < 3) {
				total4165 = 3;
			} else if (total66 < 3) {
				total66 = 3;
			}

			System.out.println("El num votos1825 es " + total1825 + " de la provincia "
					+ listaComunidad.get(i).getNombreComunidad());
			System.out.println("El num votos2640 es " + total2640 + " de la provincia "
					+ listaComunidad.get(i).getNombreComunidad());
			System.out.println("El num votos4165 es " + total4165 + " de la provincia "
					+ listaComunidad.get(i).getNombreComunidad());
			System.out.println(
					"El num votos66 es " + total66 + " de la provincia " + listaComunidad.get(i).getNombreComunidad());

			for (int j = 0; j < total1825; j++) {
				rango = "RANGO_18_25";
				Hilo h = new Hilo();
				h.start();
				h.join();
				info = new Info(votado, votosTotales);
				listaInfo.add(info);
				votosTotales++;
			}
			for (int k = 0; k < total2640; k++) {
				rango = "RANGO_26_40";
				Hilo h = new Hilo();
				h.start();
				h.join();
				info = new Info(votado, votosTotales);
				listaInfo.add(info);
				votosTotales++;
			}
			for (int l = 0; l < total4165; l++) {
				rango = "RANGO_41_65";
				Hilo h = new Hilo();
				h.start();
				h.join();
				info = new Info(votado, votosTotales);
				listaInfo.add(info);
				votosTotales++;
			}
			for (int m = 0; m < total66; m++) {
				rango = "RANGO_MAS_66";
				Hilo h = new Hilo();
				h.start();
				h.join();
				info = new Info(votado, votosTotales);
				listaInfo.add(info);
				votosTotales++;
			}
			this.sleep(500);
		}
		for (int z = 0; z < listaCantante.size(); z++) {
			System.out.println("El cantante " + listaCantante.get(z).getNombre() + " ha sacado "
					+ listaCantante.get(z).getVotos1825() + " en el rango de 18 a 25");
			System.out.println("El cantante " + listaCantante.get(z).getNombre() + " ha sacado "
					+ listaCantante.get(z).getVotos2640() + " en el rango de 26 a 40");
			System.out.println("El cantante " + listaCantante.get(z).getNombre() + " ha sacado "
					+ listaCantante.get(z).getVotos4165() + " en el rango de 41 a 65");
			System.out.println("El cantante " + listaCantante.get(z).getNombre() + " ha sacado "
					+ listaCantante.get(z).getVotos66() + " en el rango de mas de 66");
		}
		System.out.println("Los votos son " + votosTotales);
	}

	public void insertarHilo() throws ClassNotFoundException, IOException {
		String consulta = "INSERT INTO HILO (ID_HILO, NOMBRE) VALUES (?, ?)";
		Connection connection = null;
		for (int i = 0; listaInfo.size() > i; i++) {
			PreparedStatement preparedStatement = null;
			Info info = listaInfo.get(i);
			try {
				connection = createConnection();
				preparedStatement = connection.prepareStatement(consulta);
				preparedStatement.setInt(1, info.getId());
				preparedStatement.setString(2, info.getCantanteVotado());
				preparedStatement.executeUpdate();

				connection.commit();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if (null != preparedStatement) {
					try {
						preparedStatement.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					try {
						// Desconectamos la conexion iniciada dentro del metodo
						disconnect(connection);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
		System.out.println("\nDatos insertados");
	}

	public void insertarVotosRango() throws ClassNotFoundException, IOException {
		String consulta = "INSERT INTO VOTOS_AUX (CANTANTE, VOTOS_1825, VOTO_2640, VOTOS_4165, VOTOS66, VOTOS_ANDALUCIA, "
				+ "VOTOS_ARAGON, VOTOS_ASTURIAS, VOTOS_BALEARES, VOTOS_CANARIAS, VOTOS_CANTABRIA, VOTOS_CASTILLA_MANCHA, "
				+ "VOTOS_CASTILLA_LEON, VOTOS_CATALUNIA, VOTOS_CEUTA, VOTOS_EXTREMADURA, VOTOS_GALICIA, "
				+ "VOTOS_MADRID, VOTOS_MELILLA, VOTOS_MURCIA, VOTOS_NAVARRA, VOTOS_RIOJA, VOTOS_VALENCIA, VOTOS_VASCO) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		Connection connection = null;
		for (int i = 0; listaCantante.size() > i; i++) {
			PreparedStatement preparedStatement = null;
			Cantante cantante = listaCantante.get(i);
			try {
				connection = createConnection();
				preparedStatement = connection.prepareStatement(consulta);
				preparedStatement.setString(1, cantante.getNombre());
				preparedStatement.setInt(2, cantante.getVotos1825());
				preparedStatement.setInt(3, cantante.getVotos2640());
				preparedStatement.setInt(4, cantante.getVotos4165());
				preparedStatement.setInt(5, cantante.getVotos66());
				preparedStatement.setInt(6, cantante.getAndalucia());
				preparedStatement.setInt(7, cantante.getAragon());
				preparedStatement.setInt(8, cantante.getAsturias());
				preparedStatement.setInt(9, cantante.getBaleares());
				preparedStatement.setInt(10, cantante.getCanarias());
				preparedStatement.setInt(11, cantante.getCantabria());
				preparedStatement.setInt(12, cantante.getCastillaLaMancha());
				preparedStatement.setInt(13, cantante.getCastillaLeon());
				preparedStatement.setInt(14, cantante.getCataluña());
				preparedStatement.setInt(15, cantante.getCeuta());
				preparedStatement.setInt(16, cantante.getExtremadura());
				preparedStatement.setInt(17, cantante.getGalicia());
				preparedStatement.setInt(18, cantante.getMadrid());
				preparedStatement.setInt(19, cantante.getMelilla());
				preparedStatement.setInt(20, cantante.getMurcia());
				preparedStatement.setInt(21, cantante.getNavarra());
				preparedStatement.setInt(22, cantante.getRioja());
				preparedStatement.setInt(23, cantante.getValencia());
				preparedStatement.setInt(24, cantante.getVasco());
				preparedStatement.executeUpdate();

				connection.commit();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if (null != preparedStatement) {
					try {
						preparedStatement.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					try {
						// Desconectamos la conexion iniciada dentro del metodo
						disconnect(connection);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
		System.out.println("\nDatos insertados");
	}
	
	public List<Ganador> sacarGanador1825() throws ClassNotFoundException, SQLException, IOException {

		List<Ganador> listaGanador = new ArrayList<Ganador>();

		String consultaSQL = "SELECT CANTANTE FROM VOTOS_AUX ORDER BY VOTOS_1825 DESC";

		Connection connection = null;

		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = createConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(consultaSQL);

			Ganador ganador;

			while (resultSet.next()) {
				ganador = new Ganador();
				ganador.setNombre(resultSet.getString("CANTANTE"));
				listaGanador.add(ganador);

				System.out.println(ganador);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			// Cerramos todos los resources
			if (null != resultSet) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != statement) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				// Desconectamos la conexion iniciada dentro del metodo
				disconnect(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return listaGanador;
	}

	public List<Ganador> sacarGanador2640() throws ClassNotFoundException, SQLException, IOException {

		List<Ganador> listaGanador = new ArrayList<Ganador>();

		String consultaSQL = "SELECT CANTANTE FROM VOTOS_AUX ORDER BY VOTOS_2640 DESC";

		Connection connection = null;

		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = createConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(consultaSQL);

			Ganador ganador;

			while (resultSet.next()) {
				ganador = new Ganador();
				ganador.setNombre(resultSet.getString("CANTANTE"));
				listaGanador.add(ganador);

				System.out.println(ganador);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			// Cerramos todos los resources
			if (null != resultSet) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != statement) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				// Desconectamos la conexion iniciada dentro del metodo
				disconnect(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return listaGanador;
	}
	
	public List<Ganador> sacarGanador4165() throws ClassNotFoundException, SQLException, IOException {

		List<Ganador> listaGanador = new ArrayList<Ganador>();

		String consultaSQL = "SELECT CANTANTE FROM VOTOS_AUX ORDER BY VOTOS_4165 DESC";

		Connection connection = null;

		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = createConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(consultaSQL);

			Ganador ganador;

			while (resultSet.next()) {
				ganador = new Ganador();
				ganador.setNombre(resultSet.getString("CANTANTE"));
				listaGanador.add(ganador);

				System.out.println(ganador);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			// Cerramos todos los resources
			if (null != resultSet) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != statement) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				// Desconectamos la conexion iniciada dentro del metodo
				disconnect(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return listaGanador;
	}
	
	public List<Ganador> sacarGanador66() throws ClassNotFoundException, SQLException, IOException {

		List<Ganador> listaGanador = new ArrayList<Ganador>();

		String consultaSQL = "SELECT CANTANTE FROM VOTOS_AUX ORDER BY VOTOS66 DESC";

		Connection connection = null;

		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = createConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(consultaSQL);

			Ganador ganador;

			while (resultSet.next()) {
				ganador = new Ganador();
				ganador.setNombre(resultSet.getString("CANTANTE"));
				listaGanador.add(ganador);

				System.out.println(ganador);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			// Cerramos todos los resources
			if (null != resultSet) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != statement) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				// Desconectamos la conexion iniciada dentro del metodo
				disconnect(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return listaGanador;
	}
	
	public List<Ganador> sacarGanadorAndalucia() throws ClassNotFoundException, SQLException, IOException {

		List<Ganador> listaGanador = new ArrayList<Ganador>();

		String consultaSQL = "SELECT CANTANTE FROM VOTOS_AUX ORDER BY VOTOS_ANDALUCIA DESC";

		Connection connection = null;

		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = createConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(consultaSQL);

			Ganador ganador;

			while (resultSet.next()) {
				ganador = new Ganador();
				ganador.setNombre(resultSet.getString("CANTANTE"));
				listaGanador.add(ganador);

				System.out.println(ganador);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			// Cerramos todos los resources
			if (null != resultSet) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != statement) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				// Desconectamos la conexion iniciada dentro del metodo
				disconnect(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return listaGanador;
	}
	
	public List<Ganador> sacarGanadorAragon() throws ClassNotFoundException, SQLException, IOException {

		List<Ganador> listaGanador = new ArrayList<Ganador>();

		String consultaSQL = "SELECT CANTANTE FROM VOTOS_AUX ORDER BY VOTOS_ARAGON";

		Connection connection = null;

		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = createConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(consultaSQL);

			Ganador ganador;

			while (resultSet.next()) {
				ganador = new Ganador();
				ganador.setNombre(resultSet.getString("CANTANTE"));
				listaGanador.add(ganador);

				System.out.println(ganador);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			// Cerramos todos los resources
			if (null != resultSet) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != statement) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				// Desconectamos la conexion iniciada dentro del metodo
				disconnect(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return listaGanador;
	}
	
	public List<Ganador> sacarGanadorAsturias() throws ClassNotFoundException, SQLException, IOException {

		List<Ganador> listaGanador = new ArrayList<Ganador>();

		String consultaSQL = "SELECT CANTANTE FROM VOTOS_AUX ORDER BY VOTOS_ASTURIAS DESC";

		Connection connection = null;

		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = createConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(consultaSQL);

			Ganador ganador;

			while (resultSet.next()) {
				ganador = new Ganador();
				ganador.setNombre(resultSet.getString("CANTANTE"));
				listaGanador.add(ganador);

				System.out.println(ganador);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			// Cerramos todos los resources
			if (null != resultSet) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != statement) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				// Desconectamos la conexion iniciada dentro del metodo
				disconnect(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return listaGanador;
	}
	
	public List<Ganador> sacarGanadorBaleares() throws ClassNotFoundException, SQLException, IOException {

		List<Ganador> listaGanador = new ArrayList<Ganador>();

		String consultaSQL = "SELECT CANTANTE FROM VOTOS_AUX ORDER BY VOTOS_BALEARES DESC";

		Connection connection = null;

		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = createConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(consultaSQL);

			Ganador ganador;

			while (resultSet.next()) {
				ganador = new Ganador();
				ganador.setNombre(resultSet.getString("CANTANTE"));
				listaGanador.add(ganador);

				System.out.println(ganador);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			// Cerramos todos los resources
			if (null != resultSet) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != statement) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				// Desconectamos la conexion iniciada dentro del metodo
				disconnect(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return listaGanador;
	}
	
	public List<Ganador> sacarGanadorCanarias() throws ClassNotFoundException, SQLException, IOException {

		List<Ganador> listaGanador = new ArrayList<Ganador>();

		String consultaSQL = "SELECT CANTANTE FROM VOTOS_AUX ORDER BY VOTOS_CANARIAS DESC";

		Connection connection = null;

		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = createConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(consultaSQL);

			Ganador ganador;

			while (resultSet.next()) {
				ganador = new Ganador();
				ganador.setNombre(resultSet.getString("CANTANTE"));
				listaGanador.add(ganador);

				System.out.println(ganador);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			// Cerramos todos los resources
			if (null != resultSet) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != statement) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				// Desconectamos la conexion iniciada dentro del metodo
				disconnect(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return listaGanador;
	}
	
	public List<Ganador> sacarGanadorCantabria() throws ClassNotFoundException, SQLException, IOException {

		List<Ganador> listaGanador = new ArrayList<Ganador>();

		String consultaSQL = "SELECT CANTANTE FROM VOTOS_AUX ORDER BY CANTABRIA DESC";

		Connection connection = null;

		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = createConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(consultaSQL);

			Ganador ganador;

			while (resultSet.next()) {
				ganador = new Ganador();
				ganador.setNombre(resultSet.getString("CANTANTE"));
				listaGanador.add(ganador);

				System.out.println(ganador);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			// Cerramos todos los resources
			if (null != resultSet) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != statement) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				// Desconectamos la conexion iniciada dentro del metodo
				disconnect(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return listaGanador;
	}
	
	public List<Ganador> sacarGanadorCastillaMancha() throws ClassNotFoundException, SQLException, IOException {

		List<Ganador> listaGanador = new ArrayList<Ganador>();

		String consultaSQL = "SELECT CANTANTE FROM VOTOS_AUX ORDER BY VOTOS_CASTILLA_MANCHA DESC";

		Connection connection = null;

		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = createConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(consultaSQL);

			Ganador ganador;

			while (resultSet.next()) {
				ganador = new Ganador();
				ganador.setNombre(resultSet.getString("CANTANTE"));
				listaGanador.add(ganador);

				System.out.println(ganador);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			// Cerramos todos los resources
			if (null != resultSet) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != statement) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				// Desconectamos la conexion iniciada dentro del metodo
				disconnect(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return listaGanador;
	}
	
	public List<Ganador> sacarGanadorCastillaLeon() throws ClassNotFoundException, SQLException, IOException {

		List<Ganador> listaGanador = new ArrayList<Ganador>();

		String consultaSQL = "SELECT CANTANTE FROM VOTOS_AUX ORDER BY VOTOS_CASTILLA_LEON DESC";

		Connection connection = null;

		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = createConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(consultaSQL);

			Ganador ganador;

			while (resultSet.next()) {
				ganador = new Ganador();
				ganador.setNombre(resultSet.getString("CANTANTE"));
				listaGanador.add(ganador);

				System.out.println(ganador);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			// Cerramos todos los resources
			if (null != resultSet) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != statement) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				// Desconectamos la conexion iniciada dentro del metodo
				disconnect(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return listaGanador;
	}
	
	public List<Ganador> sacarGanadorCatalunia() throws ClassNotFoundException, SQLException, IOException {

		List<Ganador> listaGanador = new ArrayList<Ganador>();

		String consultaSQL = "SELECT CANTANTE FROM VOTOS_AUX ORDER BY VOTOS_CATALUNIA DESC";

		Connection connection = null;

		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = createConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(consultaSQL);

			Ganador ganador;

			while (resultSet.next()) {
				ganador = new Ganador();
				ganador.setNombre(resultSet.getString("CANTANTE"));
				listaGanador.add(ganador);

				System.out.println(ganador);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			// Cerramos todos los resources
			if (null != resultSet) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != statement) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				// Desconectamos la conexion iniciada dentro del metodo
				disconnect(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return listaGanador;
	}
	
	public List<Ganador> sacarGanadorCeuta() throws ClassNotFoundException, SQLException, IOException {

		List<Ganador> listaGanador = new ArrayList<Ganador>();

		String consultaSQL = "SELECT CANTANTE FROM VOTOS_AUX ORDER BY VOTOS_CEUTA DESC";

		Connection connection = null;

		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = createConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(consultaSQL);

			Ganador ganador;

			while (resultSet.next()) {
				ganador = new Ganador();
				ganador.setNombre(resultSet.getString("CANTANTE"));
				listaGanador.add(ganador);

				System.out.println(ganador);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			// Cerramos todos los resources
			if (null != resultSet) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != statement) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				// Desconectamos la conexion iniciada dentro del metodo
				disconnect(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return listaGanador;
	}
	
	public List<Ganador> sacarGanadorValencia() throws ClassNotFoundException, SQLException, IOException {

		List<Ganador> listaGanador = new ArrayList<Ganador>();

		String consultaSQL = "SELECT CANTANTE FROM VOTOS_AUX ORDER BY VOTOS_VALENCIA DESC";

		Connection connection = null;

		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = createConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(consultaSQL);

			Ganador ganador;

			while (resultSet.next()) {
				ganador = new Ganador();
				ganador.setNombre(resultSet.getString("CANTANTE"));
				listaGanador.add(ganador);

				System.out.println(ganador);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			// Cerramos todos los resources
			if (null != resultSet) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != statement) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				// Desconectamos la conexion iniciada dentro del metodo
				disconnect(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return listaGanador;
	}
	
	public List<Ganador> sacarGanadorExtremadura() throws ClassNotFoundException, SQLException, IOException {

		List<Ganador> listaGanador = new ArrayList<Ganador>();

		String consultaSQL = "SELECT CANTANTE FROM VOTOS_AUX ORDER BY VOTOS_EXTREMADURA DESC";

		Connection connection = null;

		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = createConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(consultaSQL);

			Ganador ganador;

			while (resultSet.next()) {
				ganador = new Ganador();
				ganador.setNombre(resultSet.getString("CANTANTE"));
				listaGanador.add(ganador);

				System.out.println(ganador);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			// Cerramos todos los resources
			if (null != resultSet) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != statement) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				// Desconectamos la conexion iniciada dentro del metodo
				disconnect(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return listaGanador;
	}
	
	public List<Ganador> sacarGanadorGalicia() throws ClassNotFoundException, SQLException, IOException {

		List<Ganador> listaGanador = new ArrayList<Ganador>();

		String consultaSQL = "SELECT CANTANTE FROM VOTOS_AUX ORDER BY VOTOS_GALICIA DESC";

		Connection connection = null;

		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = createConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(consultaSQL);

			Ganador ganador;

			while (resultSet.next()) {
				ganador = new Ganador();
				ganador.setNombre(resultSet.getString("CANTANTE"));
				listaGanador.add(ganador);

				System.out.println(ganador);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			// Cerramos todos los resources
			if (null != resultSet) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != statement) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				// Desconectamos la conexion iniciada dentro del metodo
				disconnect(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return listaGanador;
	}
	
	public List<Ganador> sacarGanadorRioja() throws ClassNotFoundException, SQLException, IOException {

		List<Ganador> listaGanador = new ArrayList<Ganador>();

		String consultaSQL = "SELECT CANTANTE FROM VOTOS_AUX ORDER BY VOTOS_RIOJA DESC";

		Connection connection = null;

		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = createConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(consultaSQL);

			Ganador ganador;

			while (resultSet.next()) {
				ganador = new Ganador();
				ganador.setNombre(resultSet.getString("CANTANTE"));
				listaGanador.add(ganador);

				System.out.println(ganador);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			// Cerramos todos los resources
			if (null != resultSet) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != statement) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				// Desconectamos la conexion iniciada dentro del metodo
				disconnect(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return listaGanador;
	}
	
	public List<Ganador> sacarGanadorMadrid() throws ClassNotFoundException, SQLException, IOException {

		List<Ganador> listaGanador = new ArrayList<Ganador>();

		String consultaSQL = "SELECT CANTANTE FROM VOTOS_AUX ORDER BY VOTOS_MADRID DESC";

		Connection connection = null;

		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = createConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(consultaSQL);

			Ganador ganador;

			while (resultSet.next()) {
				ganador = new Ganador();
				ganador.setNombre(resultSet.getString("CANTANTE"));
				listaGanador.add(ganador);

				System.out.println(ganador);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			// Cerramos todos los resources
			if (null != resultSet) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != statement) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				// Desconectamos la conexion iniciada dentro del metodo
				disconnect(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return listaGanador;
	}
	
	public List<Ganador> sacarGanadorMelilla() throws ClassNotFoundException, SQLException, IOException {

		List<Ganador> listaGanador = new ArrayList<Ganador>();

		String consultaSQL = "SELECT CANTANTE FROM VOTOS_AUX ORDER BY VOTOS_MELILLA DESC";

		Connection connection = null;

		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = createConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(consultaSQL);

			Ganador ganador;

			while (resultSet.next()) {
				ganador = new Ganador();
				ganador.setNombre(resultSet.getString("CANTANTE"));
				listaGanador.add(ganador);

				System.out.println(ganador);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			// Cerramos todos los resources
			if (null != resultSet) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != statement) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				// Desconectamos la conexion iniciada dentro del metodo
				disconnect(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return listaGanador;
	}
	
	public List<Ganador> sacarGanadorMurcia() throws ClassNotFoundException, SQLException, IOException {

		List<Ganador> listaGanador = new ArrayList<Ganador>();

		String consultaSQL = "SELECT CANTANTE FROM VOTOS_AUX ORDER BY VOTOS_MURCIA DESC";

		Connection connection = null;

		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = createConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(consultaSQL);

			Ganador ganador;

			while (resultSet.next()) {
				ganador = new Ganador();
				ganador.setNombre(resultSet.getString("CANTANTE"));
				listaGanador.add(ganador);

				System.out.println(ganador);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			// Cerramos todos los resources
			if (null != resultSet) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != statement) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				// Desconectamos la conexion iniciada dentro del metodo
				disconnect(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return listaGanador;
	}
	
	public List<Ganador> sacarGanadorVasco() throws ClassNotFoundException, SQLException, IOException {

		List<Ganador> listaGanador = new ArrayList<Ganador>();

		String consultaSQL = "SELECT CANTANTE FROM VOTOS_AUX ORDER BY VOTOS_VASCO DESC";

		Connection connection = null;

		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = createConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(consultaSQL);

			Ganador ganador;

			while (resultSet.next()) {
				ganador = new Ganador();
				ganador.setNombre(resultSet.getString("CANTANTE"));
				listaGanador.add(ganador);

				System.out.println(ganador);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			// Cerramos todos los resources
			if (null != resultSet) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != statement) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				// Desconectamos la conexion iniciada dentro del metodo
				disconnect(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return listaGanador;
	}
	public List<Ganador> sacarGanadorNacarra() throws ClassNotFoundException, SQLException, IOException {

		List<Ganador> listaGanador = new ArrayList<Ganador>();

		String consultaSQL = "SELECT CANTANTE FROM VOTOS_AUX ORDER BY VOTOS_NAVARRA DESC";

		Connection connection = null;

		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = createConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(consultaSQL);

			Ganador ganador;

			while (resultSet.next()) {
				ganador = new Ganador();
				ganador.setNombre(resultSet.getString("CANTANTE"));
				listaGanador.add(ganador);

				System.out.println(ganador);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			// Cerramos todos los resources
			if (null != resultSet) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != statement) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				// Desconectamos la conexion iniciada dentro del metodo
				disconnect(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return listaGanador;
	}
	
	public void run() {
		try {
			int num = (int) (Math.random() * 101);
			aleatorio(num);

			System.out.println(num);
			// System.out.println(rango);

		} catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection createConnection() throws ClassNotFoundException, SQLException, IOException {

		Connection connection = null;
		FileReader fileReader = null;
		try {
			Properties propiedades = new Properties();
			fileReader = new FileReader("src/resources/database.properties");
			propiedades.load(fileReader);
			String driver = propiedades.getProperty("database.driver");
			String url = propiedades.getProperty("database.url");
			String user = propiedades.getProperty("database.user");
			String password = propiedades.getProperty("database.password");

			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);

			connection.setAutoCommit(false);

		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
			throw e;
		} finally {
			if (null != fileReader) {
				fileReader.close();
			}
		}

		return connection;
	}

	public void disconnect(Connection connection) throws SQLException {

		if (null != connection) {
			try {
				connection.close();
				connection = null;
			} catch (SQLException e) {
				e.printStackTrace();
				throw e;
			}
		}
	}

	public List<Comunidad> selectComunidad() throws ClassNotFoundException, SQLException, IOException {

		List<Comunidad> listaComunidad = new ArrayList<Comunidad>();

		String consultaSQL = "SELECT * FROM PORCENTAJES_RANGOEDAD";

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = createConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(consultaSQL);

			Comunidad comunidad;

			while (resultSet.next()) {
				comunidad = new Comunidad();
				comunidad.setNombreComunidad(resultSet.getString("NOMBRE_COMUNIDAD"));
				comunidad.setPorcent1_9(resultSet.getInt("RANGO_1_9"));
				comunidad.setPorcent10_17(resultSet.getInt("RANGO_10_17"));
				comunidad.setPorcent18_25(resultSet.getInt("RANGO_18_25"));
				comunidad.setPorcent26_40(resultSet.getInt("RANGO_26_40"));
				comunidad.setPorcent41_65(resultSet.getInt("RANGO_41_65"));
				comunidad.setPorcent66(resultSet.getInt("RANGO_MAS_66"));
				comunidad.setTotalHabitantes(resultSet.getInt("TOTAL_HABITANTES"));

				System.out.println(comunidad);

				listaComunidad.add(comunidad);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			// Cerramos todos los resources
			if (null != resultSet) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != statement) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				// Desconectamos la conexion iniciada dentro del metodo
				disconnect(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return listaComunidad;
	}

	public List<Porcentaje> selectPorcentajes() throws ClassNotFoundException, SQLException, IOException {

		List<Porcentaje> listaPorcentajes = new ArrayList<Porcentaje>();

		String consultaSQL = "SELECT * FROM PORCENTAJE_VOTACION_RANGO";

		Connection connection = null;

		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = createConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(consultaSQL);

			Porcentaje porcentaje;

			while (resultSet.next()) {
				porcentaje = new Porcentaje();
				porcentaje.setRangoEdad(resultSet.getString("RANGO"));
				porcentaje.setPorcentajeEdad(resultSet.getDouble("PORCENTAJE"));

				System.out.println(porcentaje);

				listaPorcentajes.add(porcentaje);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			// Cerramos todos los resources
			if (null != resultSet) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != statement) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				// Desconectamos la conexion iniciada dentro del metodo
				disconnect(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return listaPorcentajes;
	}

	public List<Cantante> selectCantante() throws ClassNotFoundException, SQLException, IOException {

		List<Cantante> listaCantante = new ArrayList<Cantante>();

		String consultaSQL = "SELECT * FROM CANTANTES";

		Connection connection = null;

		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = createConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(consultaSQL);

			Cantante cantante;

			while (resultSet.next()) {
				cantante = new Cantante();
				cantante.setNombre(resultSet.getString("NOMBRE"));
				cantante.setApellidos(resultSet.getString("APELLIDOS"));
				cantante.setCancion(resultSet.getString("NOMBRE_CANCION"));

				listaCantante.add(cantante);

				System.out.println(cantante);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			// Cerramos todos los resources
			if (null != resultSet) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null != statement) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			try {
				// Desconectamos la conexion iniciada dentro del metodo
				disconnect(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return listaCantante;
	}

	public static void main(String[] args) {
		try {
			Hilo helper = new Hilo();
			List<Comunidad> listaComunidad = helper.selectComunidad();
			List<Porcentaje> listaPorcentaje = helper.selectPorcentajes();
			listaCantante = helper.selectCantante();

			helper.generarVoto(listaCantante, listaComunidad, listaPorcentaje, listaInfo);

			helper.insertarHilo();

			// helper.sacarGanador();

			helper.insertarVotosRango();
			
			helper.sacarGanador1825();
			helper.sacarGanadorAndalucia();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}