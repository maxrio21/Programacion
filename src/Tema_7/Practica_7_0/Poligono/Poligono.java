package Tema_7.Practica_7_0.Poligono;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Poligono extends Punto
{
	
	ArrayList<Punto> arrayPunto = new ArrayList<Punto>();

	public Poligono()
	{
		
	}
	
	public Poligono(ArrayList<Punto> array)
	{
		
	}
	
	public static void main(String[] args) 
	{	
		Poligono pol = new Poligono();

		System.out.println(String.format("%.2f", pol.perimetro()));
		pol.translada(4, -3);
	}

	public void translada(double x, double y) 
	{
		for(int i = 0;i < this.arrayPunto.size();i++)
		{
			arrayPunto.set(i, new Punto(this.arrayPunto.get(i).x + 4,this.arrayPunto.get(i).y - 3));
		}
	}
	
	public int numVertex()
	{
		return arrayPunto.size();
	}
	
	public void verInfoPoligono()
	{
		System.out.println(this.perimetro());
	}
	
	public double perimetro() 
	{
		ArrayList<Double> arrayDiametros = new ArrayList<>();
		double perimetro = 0;

		for (int i = 0; i < 4;i++)
		{
			double x = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor x del vertice nº " + (i+1)));
			double y = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor y del vertice nº " + (i+1)));

			arrayPunto.add(new Punto(x,y));
		}
		
		for (int j = 0; j < arrayPunto.size();j++)
		{
			
			if (j == arrayPunto.size()-1) 
			{
				arrayDiametros.add(Math.sqrt(Math.pow((arrayPunto.get(0).x) - (arrayPunto.get(arrayPunto.size()-1).x), 2) + Math.pow((arrayPunto.get(0).y) - (arrayPunto.get(arrayPunto.size()-1).y), 2)));
			}
			else 
			{
				arrayDiametros.add(Math.sqrt(Math.pow((arrayPunto.get(j+1).x) - (arrayPunto.get(j).x), 2) + Math.pow((arrayPunto.get(j+1).y) - (arrayPunto.get(j).y), 2)));
			}
			
			perimetro = perimetro + arrayDiametros.get(j);
			
		}
		
		return perimetro;
	}
	
	
}
