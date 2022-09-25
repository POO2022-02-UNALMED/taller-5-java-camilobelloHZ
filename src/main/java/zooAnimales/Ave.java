package zooAnimales;
import java.util.*;

public class Ave extends Animal{
	private static ArrayList<Ave> listado= new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	public String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad,habitat,genero);
		this.colorPlumas= colorPlumas;
		Ave.listado.add(this);
	}
	
	public Ave() {
		Ave.listado.add(this);
		
	}
	
	//metodos sett 
	
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	public static void setHalcones(int halcones) {
		Ave.halcones = halcones;
	}
	
	public static void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}
	
	public static void setAguilas(int aguilas) {
		Ave.aguilas = aguilas;
	}
	
	//metodos get
	
	public String getColorPlumas() {
		return colorPlumas;
	}
	
	public static int getHalcones() {
		return halcones;
	}
	
	public static ArrayList<Ave> getListado() {
		return listado;
	}
	
	public static int getAguilas() {
		return aguilas;
	}
	
	//metodos de la clase 
	
	public String movimiento() {
		return("volar");
	}
	
	public static int cantidadAves() {
		if(Ave.listado!=null) {
			return Ave.listado.size();
		}
		else {
			return 0;
		}
	}
	
	public static Ave crearHalcon(String nombre, int edad,String genero){
		Ave hal = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		Ave.halcones+=1;
		return hal;
		
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave agui = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		Ave.aguilas +=1;
		return(agui);
	}
	
	

}
