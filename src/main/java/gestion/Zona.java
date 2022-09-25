package gestion;
import java.util.*;
import zooAnimales.Animal;

public class Zona {
	
	private String nombre;
	private ArrayList<Zoologico> zoo= new ArrayList<Zoologico>();
	private ArrayList<Animal> animales= new ArrayList<Animal>();


	//contructores 
	public Zona(String n, Zoologico z) {
		this.zoo.add(z);
		this.nombre= n;
	
	}	
	
	public Zona() {
		}
	
	//metodos set 
		
	public void setnombre(String n) {
		this.nombre= n;
		

	//jui
	}

	//metodos get 
	
	public String getnombre() {
		return(this.nombre);
		
	}
	public ArrayList<Animal> getzonas(){
		return(this.animales);
	}
	
	public Zoologico getzoo() {
		return(zoo.get(0));
		
	}
	
	//metodos de la clase
	public int cantidadAnimales() {
		return(animales.size());
	}	
	public void agregarAnimales(Animal anim) {
		animales.add(anim);
	}
	

}



