package gestion;
import java.util.*;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	//constructores 
	
	public Zoologico(String nombre, String ubicacion) {
		this.ubicacion= ubicacion;
		this.nombre= nombre;
	}
		
	public Zoologico() {
		
	}
	
	//set 
	
	public void setnombre(String nom) {
		this.nombre= nom;
	}
	
	public void setubicacion(String ubic) {
		this.ubicacion= ubic;
	}
	//get
	
	public String getNombre() {
		return(this.nombre);
	}
	
	public String getubicacion() {
		return(this.ubicacion);
	}
	
	//metodos 
	
	public int cantidadTotalAnimales(){
		int total= 0;
		for(int e=0; e< zonas.size(); e+=1 ) {
			total += zonas.get(e).cantidadAnimales();
		}
		return(total);
		}
	
	
	public void agregarZonas(Zona zon) {
		zonas.add(zon);
	}
}

