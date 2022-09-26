package gestion;
import java.util.*;


public class Zoologico {
	private String nombre; 
	private String ubicacion; 
	private ArrayList<Zona> zonas = new ArrayList<Zona>(); 
	
	
	
	public Zoologico(String nombre , String ubicacion) {
		this.ubicacion = ubicacion;
		this.nombre = nombre;
	}

	public Zoologico() {
		
	}
	
	public void agregarZonas(Zona zona) {
		this.zonas.add(zona);
		
	}
	
	public int cantidadTotalAnimales() {
		int total=0;
		for (int e=0;e<zonas.size();e=+1) {
			total += zonas.get(e).cantidadAnimales();
		}
		return total; 
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public ArrayList<Zona> getZona() {
		return zonas;
	}

	public void setZonas(Zona zonas) {
		this.zonas.add(zonas); 
	}

}
