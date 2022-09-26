package gestion;
import java.util.*;

	public class Zoologico {
		private String nombre; 
		private String ubicacion; 
		private ArrayList<Zona> zonas = new ArrayList<Zona>(); 
		
		
		// contructores
		public Zoologico(String nombre, String ubicacion) {
			this.nombre = nombre;
			this.ubicacion = ubicacion;
		}

		public Zoologico() {
			
		}
		
		//metodos set 
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public void setUbicacion(String ubicacion) {
			this.ubicacion = ubicacion;
		}
		
		public void setZonas(Zona zonas) {
			this.zonas.add(zonas); 
		}

		// metodos set 
		public String getNombre() {
			return nombre;
		}

		public String getUbicacion() {
			return ubicacion;
		}

		

		public ArrayList<Zona> getZona() {
			return zonas;
		}
		
		// metodos de la clase 
		public void agregarZonas(Zona zonas) {
					this.zonas.add(zonas);
					
				}
				
		public int cantidadTotalAnimales() {
			int total=0;
				for (int e=0;e<zonas.size();e++) {
						total += zonas.get(e).cantidadAnimales();
				}
			return total; 

		
		}
		
	}
