package zooAnimales;
import gestion.Zona;
//import java.util.*;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;

	public Animal(String nombre, int edad, String habitat, String genero ) {
		this.genero= genero;
		this.habitat= habitat;
		this.edad= edad;
		this.nombre= nombre;
		++Animal.totalAnimales;
	}
	
	public Animal() {
		++totalAnimales;
		
	}
	
	//metodos get 
	
	public static int getTotalAnimales() {
		return(totalAnimales);
	}
	
	public int getEdad() {
		return(this.edad);
	}
	
	
	public String getNombre() {
		return(this.nombre);
	}
	
	public String getHabitat() {
		return(this.habitat);
	}
	
	public String getGenero() {
		return(this.genero);
	
	}
	
	public Zona  getZona() {
		return(zona);
	}
	
	//metodos sett
	
	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales= totalAnimales;
	}
	
	public void setNombre(String nombre) {
		this.nombre= nombre;
	}
	
	public void setEdad(int edad) {
		this.edad= edad;
	}
	
	public void setHabitat(String habitat) {
		this.habitat= habitat;
		
	}
	
	public void setGenero(String genero) {
		this.genero= genero;
	}
	
	public void setZona(Zona zona) {
		this.zona= zona;
	}
	
	//metodos de la clase 
	
	public static String totalPorTipo () {
		return "Mamiferos: "+Mamifero.cantidadMamiferos()+"\n" +"Aves: "+Ave.cantidadAves()+"\n" +"Reptiles: "+Reptil.cantidadReptiles()+"\n" + "Peces: "+Pez.cantidadPeces()+"\n"
				+"Anfibios: "+Anfibio.cantidadAnfibios();

	}
	
	public String movimiento() {
		return "desplazarse";
	}
	
	public String toString() {
		if(this.zona!= null) {
			return "Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat
					+" y mi genero es "+this.genero+". la zona en la que me ubico es "+this.zona.getnombre()
					+", en el "+this.zona.getzoo().getNombre();
		}
		else {
			return "Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat
					+" y mi genero es "+this.genero;
		}
	}
		
		
	
	
	
}
	




