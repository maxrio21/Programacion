package Tema_7.Practica_7_0.Electrodomesticos;

/*
 * 
 * @author Mario Bellido Jiménez
 * Subido desde eclipse.
 */

public class Electrodomestico 
{
	private int precio = 100;
	private String color = ""; 
	private final String COLOR_DEFECTO = "Blanco";
	private char consumoEnergetico = 'F';
	private final char CONSUMO_ENERGETICO_DEFECTO = 'F';
	private int peso = 5;
	
	public Electrodomestico()
	{

	}
	
	public Electrodomestico(int precio, int peso)
	{
		this.precio = precio;
		this.peso = peso;
	}
	
	public Electrodomestico(int precio, String color, char consumoEnergetico, int peso) 
	{
		this.precio = precio;
		this.peso = peso;
		
		this.comprobarConsumoEnergetico(consumoEnergetico);
		this.comprobarColor(color);
	}
	
	public int getPrecioBase() {return this.precio;}
	public String getColor() {return this.color;}
	public char getConsumo() {return this.consumoEnergetico;}
	public int getPeso() {return this.peso;}
	
	public void setPrecio(int p) {this.precio = p;}
	public void setColor(String c) {this.color = c;}
	public void setConsumo(char c) {this.consumoEnergetico = c;}
	public void setPeso(int p) {this.peso = p;}
	
	/*
	 * Comrpueba el consumo energetico del electrodomestico
	 * y si esta fuera del rango establece F por defecto.
	 */
	
	public void comprobarConsumoEnergetico(char letra) 
	{
		
		String l = Character.toString(letra);
		if(		
			(l.equals("A") ||
			l.equals("B") ||
			l.equals("C") ||
			l.equals("D") ||
			l.equals("E") ||
			l.equals("F")) && l.length() == 1) 
		{
			this.consumoEnergetico = letra;
		}
		else 
		{
			
			this.consumoEnergetico = CONSUMO_ENERGETICO_DEFECTO;
		}
	}
	
	/*
	 * Comrpueba el color del electrodomestico
	 * y si el color introducido no es valido 
	 * inserta el color por defecto.
	 */
	
	public void comprobarColor(String c) 
	
	{
		if(		
			c.equalsIgnoreCase("Blanco") || 
			c.equalsIgnoreCase("Negro") ||
			c.equalsIgnoreCase("Rojo") ||
			c.equalsIgnoreCase("Azul") ||
			c.equalsIgnoreCase("Gris")
			)  
		{this.color = c;}
		else {this.color = COLOR_DEFECTO;}
	}
	
	/*
	 * Establece el precio final del electrodomestico
	 * y devuelve tambien su precio.
	 */
	
	public void precioFinal() 
	{
		int precioLetra = 0; //
		int precioTamaño = 0;
		
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
		
		//@param Deveulve la suma de ambos parametros.
		this.setPrecio(precioLetra + precioTamaño);
	}
}
