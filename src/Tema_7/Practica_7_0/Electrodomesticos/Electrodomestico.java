package Tema_7.Practica_7_0.Electrodomesticos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * 
 * @author Mario Bellido Jiménez
 * 
 */

public class Electrodomestico 
{
	private int precioBase = 100;
	private String color = "Blanco";
	private char consumoEnergetico = 'F';
	private int peso = 5;

	public Electrodomestico()
	{

	}
	
	public Electrodomestico(int precio, int peso)
	{
		this.precioBase = precio;
		this.peso = peso;
	}
	
	public Electrodomestico(int precio, String color, char consumoEnergetico, int peso) 
	{
		this.precioBase = precio;
		this.peso = peso;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}
	
	public int getPrecioBase() {return this.precioBase;}
	public String getColor() {return this.color;}
	public char getConsumo() {return this.consumoEnergetico;}
	public int getPeso() {return this.peso;}
	
	public void setPrecioBase(int p) {this.precioBase = p;}
	public void setColor(String c) {this.color = c;}
	public void setConsumo(char c) {this.consumoEnergetico = c;}
	public void setPeso(int p) {this.peso = p;}
	
	/*
	 * Comrpueba el consumo energetico del electrodomestico
	 * y si esta fuera del rango establece F por defecto.
	 */
	
	private void comprobarConsumoEnergetico(char letra) 
	{
		
		String l = Character.toString(letra);
		if(		
			l.equalsIgnoreCase("A") ||
			l.equalsIgnoreCase("B") ||
			l.equalsIgnoreCase("C") ||
			l.equalsIgnoreCase("D") ||
			l.equalsIgnoreCase("E") ||
			l.equalsIgnoreCase("F")) 
		{
			this.consumoEnergetico = l.charAt(0);
		}
		else 
		{
			
			this.consumoEnergetico = 'F';
		}
	}
	
	public void comprobarColor(String c) 
	
	{
		if(		
				c.equalsIgnoreCase("Blanco") ||
				c.equalsIgnoreCase("B") ||
				c.equalsIgnoreCase("C") ||
				c.equalsIgnoreCase("D") ||
				c.equalsIgnoreCase("E") ||
				c.equalsIgnoreCase("F")) 
			{
				this.color = c;
			}
			else 
			{
				this.color = "Blanco";
			}
		
	}
	
	/*
	 * Establece el precio final del electrodomestico
	 * y devuelve tambien su precio.
	 */
	
	public int precioFinal() 
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
		return precioLetra + precioTamaño;
	}
}
