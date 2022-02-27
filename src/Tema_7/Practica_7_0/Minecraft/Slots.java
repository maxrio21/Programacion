package Tema_7.Practica_7_0.Minecraft;

public class Slots 
{
	private Items item;
	private int cantidad = 0;
	private int max_cantidad = 0;
	
	public Slots(int max_cantidad)
	{
		this.max_cantidad = max_cantidad;
	}
	
	/*
	 * Getters y Setters
	 * de los atributos
	 */
	
	public Items getItem() {return this.item;}
	public int getCantidad() {return this.cantidad;}
	public int getMaxCantidad() {return this.max_cantidad;}

	public void setItem(Items i) {this.item = i;}
	public void setCantidad(int c) {this.cantidad = c;}
	public void setMaxCantidad(int max) {this.max_cantidad = max;}
}
