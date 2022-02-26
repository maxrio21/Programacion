package Tema_7.Practica_7_0.Electrodomesticos;


public class Television extends Electrodomestico
{
	private int resolucion = 20;
	private boolean smartTV = false;
	
	//Constuctor por defecto de la clase Lavadora 
	public Television()
	{
		
	}
	
	/*
	 * Constructor que hereda el constructor de la clase Electrodomestico 
	 * que añade los atributos precio y peso
	 */
	public Television(int precio, int peso)
	{
		super(precio,peso);
	}
	
	/*
	 * Constructor que hereda el constructor de la clase Electrodomestico 
	 * que añade los atributos precio, peso, consumoEnergetico y colore s
	 */
	public Television(int resolucion, boolean smartTV, int precio, String color, char consumoEnergetico, int peso)
	{
		super(precio,color,consumoEnergetico,peso);
		this.resolucion = resolucion;
		this.smartTV = smartTV;
	}
	
	public int resolucion() {return this.resolucion;}
	
	public boolean smartTV() {return this.smartTV;}
	
}
