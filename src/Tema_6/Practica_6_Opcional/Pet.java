package Tema_6.Practica_6_Opcional;

import javax.swing.JOptionPane;

public class Pet 
{

	private String name;
	private double size;
	private String color;
	
	public Pet()
	{
		JOptionPane.showMessageDialog(null, "Objeto Creado!");
	}
	
	public Pet(String name, double size, String color) 
	{
		this.name = name;
		this.size = size;
		this.color = color;
		
		JOptionPane.showMessageDialog(null, "Objeto Creado!");
	}
	
	public String getName() {return this.name;}
	public double getSize() {return this.size;}
	public String getColor() {return this.color;}

	public void setName(String name) {this.name = name;}
	public void setSize(double size) {this.size = size;}
	public void setColor(String color) {this.color = color;}

	public boolean isSame(Pet p)
	{
		return this == p;
	}
	
}
