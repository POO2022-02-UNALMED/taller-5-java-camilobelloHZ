package zooAnimales;
import java.util.*;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
		
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		Anfibio.listado.add(this);
	}
	
	public Anfibio() {
		Anfibio.listado.add(this);
	}

	//metodos set
	
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	public static void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
	}
	
	public static void setRanas(int ranas) {
		Anfibio.ranas = ranas;
	}
	
	public static void setSalamandras(int salamandras) {
		Anfibio.salamandras = salamandras;
	}
	
	//metodos get 
	

	public String getColorPiel() {
		return colorPiel;
	}
	
	public boolean getVenenoso() {
		return venenoso;
	}
	
	public static ArrayList<Anfibio> getListado() {
		return listado;
	}

	public static int getRanas() {
		return ranas;
	}
	
	public static int getSalamandras() {
		return salamandras;
	}


  //metodos de la clase 

	public String movimiento() {
		return "saltar";
	}

	public static int cantidadAnfibios() {
		if (Anfibio.listado != null) {
			return Anfibio.listado.size();
		} else {
			return 0;
		}
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio ran = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		Anfibio.ranas+=1;
		return ran;
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio salam = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		Anfibio.salamandras+=1;
		return salam;
	}


}