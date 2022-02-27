package Tema_7.Practica_7_0.Poligono;

public class Punto 
{
	double x;
	double y;
	
	public Punto(double x, double y) 
	{
		this.x = x;
		this.y = y;
	}
	
	public Punto()
	{
		this.x = -2;
		this.y = 2;
	}
	
	
	public double distancia(Punto p) 
	{	
		double d = Math.sqrt(Math.pow((this.x) - (p.x), 2) + Math.pow((this.y) - (p.y), 2));
		return d;
	}
	
	public String verDistancia()
	{
		String valor = "(" + this.x + "," + this.y + ")";
		return valor;
	}
	
}
