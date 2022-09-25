package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal{
	private static ArrayList<Pez> listado = new ArrayList<Pez>(); 
	public static int salmones;
	public static int bacalaos; 
	private String colorEscamas; 
	private int cantidadAletas;
	
	public Pez() {
		listado.add(this);
	}


	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas,int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}



	public static  int cantidadPeces() {
		return listado.size();
		}
	public String movimiento() {
		return "nadar";
		
	}
	public static Animal crearSalmon(String nombre, int edad, String genero) {
		Pez salmon = new Pez();
		salmon.setNombre(nombre);
		salmon.setEdad(edad);
		salmon.setGenero(genero);
		salmon.setColorEscamas("rojo");
		salmon.setCantidadAletas(6);
		salmon.setHabitat("oceano");
		listado.add(salmon);
		salmones++;
		return salmon;
	}
	public static Animal crearBacalao(String nombre, int edad, String genero) {
		Pez bacalao = new Pez();
		bacalao.setNombre(nombre);
		bacalao.setEdad(edad);
		bacalao.setGenero(genero);
		bacalao.setColorEscamas("gris");
		bacalao.setCantidadAletas(6);
		bacalao.setHabitat("oceano");
		listado.add(bacalao);
		bacalaos++;
		return bacalao; 
	}


	public static ArrayList<Pez> getListado() {
		return listado;
	}


	public static void setListado(Pez listado) {
		Pez.listado.add(listado);
	}


	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}

	
	
	

}
