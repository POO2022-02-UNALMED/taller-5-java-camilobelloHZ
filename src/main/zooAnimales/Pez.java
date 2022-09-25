package zooAnimales;
import java.util.*;


public class Pez extends Animal {
	public static ArrayList<Pez> listado= new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos ;
	public String colorEscamas;
	public int cantidadAletas;
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.cantidadAletas= cantidadAletas;
		this.colorEscamas= colorEscamas;
		Pez.listado.add(this);
	}
	
	public Pez() {
		Pez.listado.add(this);
	}

	//metodos set
	
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	
	public static void setListado(ArrayList<Pez> listado) {
		Pez.listado = listado;
	}
	
	public static void setSalmones(int salmones) {
		Pez.salmones = salmones;
	}
	
	public static void setBacalaos(int bacalaos) {
		Pez.bacalaos = bacalaos;
	}
	
	//metodos get
	
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public static ArrayList<Pez> getListado() {
		return listado;
	}
	
	public static int getSalmones() {
		return salmones;
	}
	
	public static int getBacalaos() {
		return bacalaos;
	}
	
	//metodos de la clase 
	
	public String movimiento() {
		return "nadar";
	}
	
	public static int cantidadPeces() {
		if (Pez.listado != null) {
			return Pez.listado.size();
		} else {
			return 0;
		}
	}
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez sal = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		Pez.salmones+=1;
		return sal;
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez bacal = new Pez(nombre, edad, "oceano", genero, "gris", 6);
		Pez.bacalaos+=1;
		return bacal;
	}
}
