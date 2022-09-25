package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Animal {
	private static int totalAnimales;
	private String nombre; 
	private int edad; 
	private String habitat;
	private String genero; 
	private static ArrayList<Zona> zona = new ArrayList<Zona>(); 
	
	
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		totalAnimales++;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
	}


	public Animal() {
		totalAnimales++;
		
	}
	
	
	public String movimiento() {
		return "desplazarse";
		
	}
	public static String totalPorTipo() {
		return "Mamiferos: "+Mamifero.cantidadMamiferos()+
				"\nAves: "+Ave.cantidadAves()+
				"\nReptiles: "+Reptil.cantidadReptiles()+
				"\nPeces: "+Pez.cantidadPeces()+
				"\nAnfibios: "+Anfibio.cantidadAnfibios(); 
		
	}
	public String toString() {
		if(zona == null || zona.size() == 0) {
			return "Mi nombre es "+getNombre()+", tengo una edad de "+getEdad()+", habito en "+getHabitat()+
					" y mi genero es "+getGenero();
		}
		else {
			return "Mi nombre es "+getNombre()+" tengo una edad de "+getEdad()+", habito en "+getHabitat()+
						" y mi genero es "+getGenero()+", la zona en la que me ubico es "+zona.get(0).getNombre()+
						", en el zoo "+Zona.getZoo().getNombre();//mis dudas
			}
		
	}

	public int getTotalAnimales() {
		return totalAnimales;
	}


	//public void setTotalAnimales(int totalAnimales) {
		//this.totalAnimales = totalAnimales;
	//}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getHabitat() {
		return habitat;
	}


	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public static ArrayList<Zona> getZona() {
		return zona;
	}


	public static void setZona(Zona zona) {
		Animal.zona.add(zona);
	}

	
	

}
