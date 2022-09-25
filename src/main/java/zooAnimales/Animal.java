package zooAnimales;
import gestion.Zona;
import java.util.*;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private static ArrayList<Zona> zona = new ArrayList<Zona>(); ;

	public Animal() {
		totalAnimales++;
		
	}
	
	public Animal(String nombre, int edad, String habitat, String genero ) {
		this.genero= genero;
		this.habitat= habitat;
		this.edad= edad;
		this.nombre= nombre;
		totalAnimales++;
	}
	
	//metodos get 
	
	public int getTotalAnimales() {
		return totalAnimales;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public String getHabitat() {
		return habitat;
	}
	

	public String getGenero() {
		return genero;
	}
	
	public static ArrayList<Zona> getZona() {
		return zona;
	}
	
	//metodos sett
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public static void setZona(Zona zona) {
		Animal.zona.add(zona);
	}
	
	//metodos de la clase 
	
	public static String totalPorTipo () {
		return "Mamiferos: "+Mamifero.cantidadMamiferos()+
				"\n" +"Aves: "+Ave.cantidadAves()+
				"\n" +"Reptiles: "+Reptil.cantidadReptiles()+
				"\n" +"Peces: "+Pez.cantidadPeces()+
				"\n" +"Anfibios: "+Anfibio.cantidadAnfibios();

	}
	
	public String movimiento() {
		return "desplazarse";
	}
	
	
	public String toString() {
		if(zona != null || zona.size() != 0) {
			return "Mi nombre es "+getNombre()+" tengo una edad de "+getEdad()+", habito en "+getHabitat()+
					" y mi genero es "+getGenero()+", la zona en la que me ubico es "+zona.get(0).getNombre()+
					", en el zoo "+Zona.getZoo().getNombre();
		}
		else {
			return "Mi nombre es "+getNombre()+", tengo una edad de "+getEdad()+", habito en "+getHabitat()+
					" y mi genero es "+getGenero();
			}
	}
		
	
	
	
}
	




