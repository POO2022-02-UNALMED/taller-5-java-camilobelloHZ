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
Reptil.listado.add(this);
}

public Reptil() {
	Reptil.listado.add(this);
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
	public static int getIguanas() {
		return iguanas;
	}
	public static int getSerpientes() {
		return serpientes;
	}
//metodos set
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
	public static void setListado(ArrayList<Reptil> listado) {
		Reptil.listado = listado;
	}
	
	public static void setIguanas(int iguanas) {
		Reptil.iguanas = iguanas;
	}
	
	public static void setSerpientes(int serpientes) {
		Reptil.serpientes = serpientes;
	}
	
	
	//metodos de la clase 
	
	public String movimiento() {
		return ("reptar");
	}
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil igua = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		Reptil.iguanas+=1;
		return (igua);
	}
	
	public static int cantidadReptiles() {
		if (Reptil.listado != null) {
			return Reptil.listado.size();
		} else {
			return 0;
		}
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil ser = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		Reptil.serpientes+=1;
		return ser;
	}

}