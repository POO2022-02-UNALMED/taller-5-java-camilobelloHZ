package zooAnimales;

import java.util.ArrayList;


public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado=new ArrayList<Mamifero>();
	public static int caballos; //los puse static
	public static int leones; //lo puse static
	private boolean pelaje; 
	private int patas; 
	
	public Mamifero() {
		listado.add(this);
		
	}
	


	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje,int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}




	public static int cantidadMamiferos() {
		return listado.size();
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero caballo= new Mamifero();
		caballo.setNombre(nombre);
		caballo.setEdad(edad);
		caballo.setGenero(genero);
		caballo.setPelaje(true); 
		caballo.setPatas(4);
		caballo.setHabitat("pradera"); 
		listado.add(caballo);
		caballos++;
		return caballo; 
	}
	
	public static Animal crearLeon(String nombre, int edad, String genero) {
		Mamifero leon= new Mamifero();
		leon.setNombre(nombre);
		leon.setEdad(edad);
		leon.setGenero(genero);
		leon.setPelaje(true);
		leon.setPatas(4);
		leon.setHabitat("selva");
		listado.add(leon);
		leones++;
		return leon; 
	}

	public static ArrayList<Mamifero> getListado() {
		return listado;
	}

	public static void setListado(Mamifero listado) {
		Mamifero.listado.add(listado);
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	
	

}
