package modelo;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import modelo.Descargar;

public class Hilo extends Thread{
	private String rango;
	private String votado;
	static Descargar helper = new Descargar();
		
	public void aleatorio(int num) throws ClassNotFoundException, SQLException, IOException {
		List<Cantante> listaCantante = helper.selectCantante();
		
		if(rango=="RANGO_18_25") {
			if(num>=0&&num<=27) {
				votado="Joel";
				listaCantante.get(0).setVotos(+1);
			}else if(num>=7&&num<=10) {
				votado="Victoria";
			}else if(num>=11&&num<=23) {
				votado="Thiago";
			}else if(num>=24&&num<=30) {
				votado="Sarah";
			}else if(num>=31&&num<=37) {
				votado="Elton";
			}else if(num>=38&&num<=51) {
				votado="Amie";
			}else if(num>=52&&num<=61) {
				votado="Nahid";
			}else if(num>=62&&num<=88) {
				votado="Marc";
			}else if(num>=89&&num<=95) {
				votado="Alba";
			}else if(num>=96&&num<=100) {
				votado="Julio";
			}
		}else if (rango=="RANGO_26_40") {
			if(num>=0&&num<=14) {
				votado="Joel";
				listaCantante.get(0).setVotos(+1);
			}else if(num>=15&&num<=20) {
				votado="Victoria";
			}else if(num>=21&&num<=33) {
				votado="Thiago";
			}else if(num>=34&&num<=40) {
				votado="Sarah";
			}else if(num>=41&&num<=46) {
				votado="Elton";
			}else if(num>47&&num<=58) {
				votado="Amie";
			}else if(num>=59&&num<=65) {
				votado="Nahid";
			}else if(num>=66&&num<=81) {
				votado="Marc";
			}else if(num>=82&&num<=90) {
				votado="Alba";
			}else if(num>=91&&num<=100) {
				votado="Julio";
			}
		}else if (rango=="RANGO_41_65") {
			if(num>=0&&num<=5) {
				votado="Joel";
				listaCantante.get(0).setVotos(+1);
			}else if(num>=6&&num<=15) {
				votado="Victoria";
			}else if(num>=16&&num<=27) {
				votado="Thiago";
			}else if(num>=28&&num<=33) {
				votado="Sarah";
			}else if(num>=34&&num<=40) {
				votado="Elton";
			}else if(num>=41&&num<=54) {
				votado="Amie";
			}else if(num>=55&&num<=61) {
				votado="Nahid";
			}else if(num>=62&&num<=71) {
				votado="Marc";
			}else if(num>=72&&num<=88) {
				votado="Alba";
			}else if(num>=89&&num<=100) {
				votado="Julio";
			}
		}else if (rango=="RANGO_MAS_66") {
			if(num>=0&&num<=3) {
				votado="Joel";
				listaCantante.get(0).setVotos(+1);
			}else if(num>=4&&num<=20) {
				votado="Victoria";
			}else if(num>=21&&num<=25) {
				votado="Thiago";
			}else if(num>=26&&num<=37) {
				votado="Sarah";
			}else if(num>=38&&num<=49) {
				votado="Elton";
			}else if(num>=50&&num<=58) {
				votado="Amie";
			}else if(num>=59&&num<=65) {
				votado="Nahid";
			}else if(num>=66&&num<=76) {
				votado="Marc";
			}else if(num>=77&&num<=91) {
				votado="Alba";
			}else if(num>=92&&num<=100) {
				votado="Julio";
			}
		}
	}
	public void generarVoto() throws ClassNotFoundException, SQLException, IOException, InterruptedException {
		
		List<Comunidad> listaComunidad = helper.selectComunidad();
		List<Porcentaje> listaPorcentaje = helper.selectPorcentajes();
		
		for (int i = 0; i < listaComunidad.size(); i++) {
			int totalHabit = listaComunidad.get(i).getTotalHabitantes();
			
			int votos1825 = listaComunidad.get(i).getPorcent18_25();
			int votos2640 = listaComunidad.get(i).getPorcent26_40();
			int votos4165 = listaComunidad.get(i).getPorcent41_65();
			int votos66 = listaComunidad.get(i).getPorcent66();
			
			double total1825 = Math.ceil(totalHabit*votos1825/100*listaPorcentaje.get(2).getPorcentajeEdad()/100);
			double total2640 = Math.ceil(totalHabit*votos2640/100*listaPorcentaje.get(3).getPorcentajeEdad()/100);
			double total4165 = Math.ceil(totalHabit*votos4165/100*listaPorcentaje.get(4).getPorcentajeEdad()/100);
			double total66 = Math.ceil(totalHabit*votos66/100*listaPorcentaje.get(5).getPorcentajeEdad()/100);
			
			Hilo h = new Hilo();
			h.start();
			h.join();
		}
	}
	
	public void run() {	
		Hilo helper = new Hilo();
		try {
			int num = (int) (Math.random()*100);
			
			helper.aleatorio(num);
			System.out.println(num);
			this.sleep(500);
			
		} catch (InterruptedException | ClassNotFoundException | SQLException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
	}
	
	public static void main(String[]args) {
		try {
			Hilo helper = new Hilo();
			helper.generarVoto();
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
