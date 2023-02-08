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
import java.util.List;
import java.util.Properties;

public class Descargar {
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
			
		}
		return listaCantante;
	}
	
	public static void main(String[]args) throws ClassNotFoundException, SQLException, IOException {
		Descargar helper = new Descargar();
		Connection connection = helper.createConnection(); 
		

		List<Comunidad> listaComunidad = helper.selectComunidad();
		
		List<Porcentaje> listaPorcentaje = helper.selectPorcentajes();
		
		List<Cantante> listaCantante = helper.selectCantante();
		
		
	}
}
