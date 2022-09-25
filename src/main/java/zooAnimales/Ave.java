package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	private static ArrayList<Ave> listado=new ArrayList<Ave>(); 
	public static int halcones; //la puse static
	public static int aguilas; //las puse static 
	private String colorPlumas; 
	
	public Ave() {
		listado.add(this);
	}


	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}



	public static int cantidadAves() {
		return listado.size();
		}
	public String movimiento() {
		return "volar";
		
	}
	public static Animal crearHalcon(String nombre, int edad, String genero) {
		Ave halcon= new Ave();
		halcon.setNombre(nombre);
		halcon.setEdad(edad);
		halcon.setGenero(genero);
		halcon.setColorPlumas("cafe glorioso");
		halcon.setHabitat("montanas");
		listado.add(halcon);
		halcones++;
		return halcon;
		
	}
	public static Animal crearAguila(String nombre, int edad, String genero) {
		Ave aguila = new Ave();
		aguila.setNombre(nombre);
		aguila.setEdad(edad);
		aguila.setGenero(genero);
		aguila.setColorPlumas("blanco y amarillo");
		aguila.setHabitat("montanas");
		listado.add(aguila);
		aguilas++;
		return aguila;
	}

	public static ArrayList<Ave> getListado() {
		return listado;
	}


	public static void setListado(Ave listado) {
		Ave.listado.add(listado);
	}


	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}

	

}
