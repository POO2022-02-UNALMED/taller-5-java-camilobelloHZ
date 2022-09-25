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
	
	public void setZonas(Zona zon) {
		this.zonas.add(zon);
	}
	//get
	
	public String getNombre() {
		return nombre;
	}
	
	public String getubicacion() {
		return ubicacion;
	}
	
	public ArrayList<Zona> getZona() {
		return zonas;
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
		this.zonas.add(zon);
	}
}

