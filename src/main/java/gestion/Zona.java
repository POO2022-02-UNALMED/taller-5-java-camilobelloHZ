package gestion;

import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
	private  String nombre; 
	private  static ArrayList<Zoologico> zoo= new ArrayList<Zoologico>();
	private   ArrayList<Animal> animales = new ArrayList<Animal>();
	

	public Zona(String nombre,Zoologico zoo) {
		this.nombre = nombre;
		Zona.zoo.add(zoo);
		//Zoologico.setZonas(this);
	}

	public Zona() {
		
	}
	
	public void agregarAnimales(Animal animales) {
		this.animales.add(animales); 
		
	}
	
	public int cantidadAnimales() {
		return getAnimales().size();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static Zoologico getZoo() {
		return Zona.zoo.get(0);
	}

	public static void setZoo(Zoologico zoo) {
		Zona.zoo.add(zoo);
	}

	public ArrayList<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(Animal animales) {
		this.animales.add(animales);
	}

	
	

	
	
	
	

}
