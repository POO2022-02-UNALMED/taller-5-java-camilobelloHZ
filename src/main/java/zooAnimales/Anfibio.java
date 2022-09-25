package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado= new ArrayList<Anfibio>();
	public static int ranas; 
	public static int salamandras; 
	private String colorPiel; 
	private boolean venenoso;
	
	public Anfibio() {
		listado.add(this);
	}

	
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel,boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}



	public static  int cantidadAnfibios() {
		return listado.size();
		}
	public String movimiento() {
		return "saltar";
		
	}
	public static Animal crearRana(String nombre, int edad, String genero) {
		Anfibio rana= new Anfibio();
		rana.setNombre(nombre);
		rana.setEdad(edad);
		rana.setGenero(genero);
		rana.setColorPiel("rojo");
		rana.setVenenoso(true);
		rana.setHabitat("selva");
		listado.add(rana);
		ranas++;
		return rana;
	}
	public static Animal crearSalamandra(String nombre, int edad, String genero) {
		Anfibio salamandra =  new Anfibio();
		salamandra.setNombre(nombre);
		salamandra.setEdad(edad);
		salamandra.setGenero(genero);
		salamandra.setColorPiel("negro y amarillo");
		salamandra.setVenenoso(false);
		salamandra.setHabitat("selva");
		listado.add(salamandra);
		salamandras++;
		return salamandra;
	}


	public static ArrayList<Anfibio> getListado() {
		return listado;
	}


	public static void setListado(Anfibio listado) {
		Anfibio.listado.add(listado);
	}


	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	
}
