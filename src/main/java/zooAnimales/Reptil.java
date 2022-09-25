package zooAnimales;

import java.util.ArrayList;


public class Reptil extends Animal{
	private static ArrayList<Reptil> listado= new ArrayList<Reptil>(); 
	public static int iguanas; //puse static
	public static int serpientes; //puse static
	private String colorEscamas; 
	private int largoCola;
	
	public Reptil() {
		listado.add(this);
	}
	

	

	public Reptil(String nombre, int edad, String habitat, String genero,String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}



	public static  int cantidadReptiles() {
		return listado.size();
	}
	public String movimiento() {
		return "reptar";
	}
	public static Animal crearIguana(String nombre, int edad, String genero) {
		Reptil iguana= new Reptil(); 
		iguana.setNombre(nombre);
		iguana.setEdad(edad);
		iguana.setGenero(genero);
		iguana.setColorEscamas("verde");
		iguana.setLargoCola(3);
		iguana.setHabitat("humedal");
		listado.add(iguana);
		iguanas++;
		return iguana; 
	}
	public static Animal crearSerpiente(String nombre, int edad, String genero) {
		Reptil serpiente= new Reptil();
		serpiente.setNombre(nombre);
		serpiente.setEdad(edad);
		serpiente.setGenero(genero);
		serpiente.setColorEscamas("blanco");
		serpiente.setLargoCola(1);
		serpiente.setHabitat("jungla");
		listado.add(serpiente);
		serpientes++;
		return serpiente;
	}


	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}


	public static ArrayList<Reptil> getListado() {
		return listado;
	}


	public static void setListado(Reptil listado) {
		Reptil.listado.add(listado);
	}

	
	
	
}
