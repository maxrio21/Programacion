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
	 * que añade los atributos precio, peso, consumoEnergetico y colores.
	 */
	public Television(int resolucion, boolean smartTV, int precio, String color, char consumoEnergetico, int peso)
	{
		super(precio,color,consumoEnergetico,peso);
		this.resolucion = resolucion;
		this.smartTV = smartTV;
	}
	
	//Metodo getter del atributo resolucion.
	public int getResolucion() {return this.resolucion;}
	
	//Metodo getter del atributo smartTV.
	public boolean getSmartTV() {return this.smartTV;}
	
	//Override del metodo precioFinal de la clase heredada Electrodomestico.
	@Override
	public void precioFinal() 
	{
		int precioLetra = 0; //
		int precioTamaño = 0;
		int precioFinal = precioLetra + precioTamaño;

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
		 *	Si la television posee smartTV
		 *	aumenta 50€ el precio.  
		 */
		if(this.smartTV) {precioFinal = precioFinal + 50;}

		/*
		 * 	Si la resolucion de la pantalla es mayor a 40
		 * 	se le suma un 30% de precio final.
		 */
		if(this.resolucion > 40) {precioFinal = precioFinal + (precioFinal * 30)/100;}
		
		//Establece el precio final.
		this.setPrecio(precioFinal);
	}
	
}
