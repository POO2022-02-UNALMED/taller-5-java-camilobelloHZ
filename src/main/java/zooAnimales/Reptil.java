package zooAnimales;
import java.util.*;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado= new ArrayList<Reptil>();
	private static int iguanas;
	private static int serpientes;
	private String colorEscamas;
	private int largoCola;


//contructores 
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){
		super(nombre, edad, habitat, genero);	
		this.largoCola= largoCola;
		this.colorEscamas= colorEscamas;
		listado.add(this);
}

	public Reptil() {
		listado.add(this);
}

//metodos get
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public int getLargoCola() {
		return largoCola;
	}
	
	public static ArrayList<Reptil> getListado() {
		return listado;
	}
	
	
//metodos set
	

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
	public static void setListado(Reptil listado) {
		Reptil.listado.add(listado);
	}
	
	
	//metodos de la clase 
	
	public String movimiento() {
		return "reptar";
	}
	public static Animal crearIguana(String nombre, int edad, String genero) {
		Reptil iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		listado.add(iguana);
		iguanas +=1;
		return iguana;
	}
	
	public static int cantidadReptiles() {
		return listado.size();
	}
	
	public static Animal crearSerpiente(String nombre, int edad, String genero) {
		Reptil serpiente = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		listado.add(serpiente);
		serpientes +=1;
		return serpiente;
	}

}