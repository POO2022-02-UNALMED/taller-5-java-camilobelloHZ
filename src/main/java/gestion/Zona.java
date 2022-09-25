package gestion;
import java.util.*;
import zooAnimales.Animal;

public class Zona {
	
	private String nombre;
	private static ArrayList<Zoologico> zoo= new ArrayList<Zoologico>();
	private ArrayList<Animal> animales= new ArrayList<Animal>();


	//contructores 
	public Zona(String n, Zoologico z) {
		Zona.zoo.add(z);
		this.nombre= n;
	
	}	
	
	public Zona() {
		}
	
	//metodos set 
		
	public void setNombre(String n) {
		this.nombre= n;
	}
		
	public static void setZoo(Zoologico zoo) {
		Zona.zoo.add(zoo);
	}
	
	public void setAnimales(Animal animales) {
		this.animales.add(animales);
	}
	

	//metodos get 
	
	public String getNombre() {
		return(this.nombre);
		
	}
	
	public ArrayList<Animal> getAnimales() {
		return animales;
	}
	
	public static Zoologico getZoo() {
		return Zona.zoo.get(0);
		
	}
	
	//metodos de la clase
	public int cantidadAnimales() {
		return getAnimales().size();
	}	
	public void agregarAnimales(Animal anim) {
		this.animales.add(anim);
	}
	

}



