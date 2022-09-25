package zooAnimales;
import java.util.*;

public class Mamifero extends Animal{
	private static ArrayList<Mamifero> listado= new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;

	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.patas= patas;
		this.pelaje= pelaje;
		Mamifero.listado.add(this);
	}
	public Mamifero() {
		Mamifero.listado.add(this);
	}
	 
	
	//metodos set 
	public void setPatas(int patas){
		this.patas= patas;
	
	}
	
	public void setPelaje(boolean pelaje){
		this.pelaje= pelaje;
	}
	
	public static void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}
	
	public static void setCaballos(int caballos) {
		Mamifero.caballos = caballos;
	}
	
	public static void setLeones(int leones) {
		Mamifero.leones = leones;
	}
	
	//metodos get
	public boolean getPelaje() {
		return(this.pelaje);
	}
	
	public int getPatas() {
		return(this.patas);
	}
	
	public static ArrayList<Mamifero> getListado() {
		return (listado);
	}
	
	public static int getCaballos() {
		return(caballos);
	}
	
	public static int getLeones() {
		return(leones);
	}

	//metodos de la clase
	
	
	public static Mamifero crearCaballos(String nombre, int edad, String genero) {
		Mamifero caballo= new Mamifero(nombre, edad, "pradera", genero, true, 4 );
		Mamifero.caballos+=1;
		return(caballo);
	
	}
	
	public static int cantidadMamiferos() {
		if(Mamifero.listado != null) {
			return Mamifero.listado.size();
		}
		else {
			return 0;
			
		}
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero leo = new Mamifero(nombre, edad, "selva", genero, true, 4);
		Mamifero.leones+=1;
		return(leo);
	}
	
	
}
