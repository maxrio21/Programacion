package Tema_7.Practica_7_0.Electrodomesticos;

public class Lavadora extends Electrodomestico 
{
	private int carga = 0;
	private final int CARGA_DEFECTO = 5;
	
	//Constuctor por defecto de la clase Lavadora 
	public Lavadora()
	{

	}
	
	/*
	 * Constructor que hereda el constructor de la clase Electrodomestico 
	 * que añade los atributos precio y peso
	 */
	public Lavadora(int precio, int peso)
	{
		super(precio,peso);
	}
	/*
	 * Constructor que hereda el constructor de la clase Electrodomestico 
	 * que añade los atributos precio, peso, consumoEnergetico y colors
	 */
	public Lavadora(int carga, int precio, String color, char consumoEnergetico, int peso)
	{
		super(precio,color,consumoEnergetico,peso);
		this.carga = carga;
	}
	
	//Metodo get de carga
	public int getCarga() {return this.carga;}
	
	@Override
	public void precioFinal()
	{
		int precioLetra = 0; //
		int precioTamaño = 0;
		int precioCarga = 0;
		
		int p = this.getPeso();
		
		/*
		 * Establecemos los precios del
		 * consumo energético según el
		 * su consumo.
		 */
		
		switch(this.getConsumo()) 
		{
			case 'A':
				precioLetra = 100;
				break;
			case 'B':
				precioLetra = 80;
				break;
			case 'C':
				precioLetra = 60;
				break;
			case 'D':
				precioLetra = 50;
				break;
			case 'E':
				precioLetra = 30;
				break;
			case 'F':
				precioLetra = 10;
				break;
		}
		
		/*
		 * Aquí establecemos el valor por
		 * peso de cada electrodomestico
		 * según lo que pese.
		 */
		
		if(p >= 0 && p <= 19)
		{
			precioTamaño = 10;
		}
		else if(p >= 20 && p <= 49) 
		{
			precioTamaño = 50;
		}
		else if(p >= 50 && p <= 80) 
		{
			precioTamaño = 80;
		}
		else if(p > 80) 
		{
			precioTamaño = 100;
		}
		else 
		{
			precioTamaño = 10;
		}
		
		/*
		 * Comprueba que la carga sea mayor a 30 y si lo es añade 50€ al precio, 
		 * para ello usamos un operador ternario, es para simplificar.
		 */
		precioCarga = (getCarga() > 30) ? (precioCarga = 50) : (precioCarga = 0);
		
		//@param Deveulve la suma de ambos parametros.
		setPrecio(precioLetra + precioTamaño + precioCarga);
	}
}
