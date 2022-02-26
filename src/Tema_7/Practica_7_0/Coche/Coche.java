package Tema_7.Practica_7_0.Coche;
import javax.swing.JOptionPane;

public class Coche 
{
	private String matricula;
	private double velocidad;
	private int marcha;
	private double[] posiciones = new double[7];
	
	public Coche(String mat) 
	{
		this.matricula = mat;
		this.velocidad = 0;
		this.marcha = 0;
		
		this.posiciones[0] = (double) 0;
		this.posiciones[1] = (double) 20;
		this.posiciones[2] = (double) 30;
		this.posiciones[3] = (double) 45;
		this.posiciones[4] = (double) 65;
		this.posiciones[5] = (double) 80;
		this.posiciones[6] = (double) 200;
	}
	
	//Getters
	public String getMatricula() {return this.matricula;}
	public double getVelocidad() {return this.velocidad;}
	public int getMarcha() {return this.marcha;}
	public double getPosiciones() 
	{
		return this.posiciones[this.marcha];
	}
	
	//Setters
	public void setMatricula(String mat) {this.matricula = mat;}
	public void setVelocidad(double vel) {this.velocidad = vel;}
	public void setMarcha(int mar) {this.marcha = mar;}
	
	public void acelerar(double vel) 
	{
		if((this.posiciones[7] + vel) <= 200) 
		{
			this.velocidad = this.velocidad + vel;
		} 
		else
		{
			JOptionPane.showMessageDialog(null, "Ya has llegado a la velocidad máxima que es " + this.velocidad);
			this.velocidad = 200;
		}
	}
	
	public void frenar(double vel) 
	{
		if((this.posiciones[0] - vel) >= 0) 
		{
			this.velocidad = this.velocidad + vel;
		} 
		else
		{
			JOptionPane.showMessageDialog(null, "Ya has llegado a la velocidad minima que es " + this.velocidad);
			this.velocidad = 0;
		}		
	}
	
	public void mostrar() 
	{
		JOptionPane.showMessageDialog(null,
		"Matricula: " + this.matricula + "\n" + 
		"Velocidad actual: " + this.velocidad + "\n" + 
		"Velocidad máxima: " + this.getPosiciones() + "\n" + 
		"Marcha actual: " + this.marcha);
	}
	
	protected void cambiarMarcha(int marcha) 
	{
		if(marcha < 0 || marcha > 6) 
		{
			JOptionPane.showMessageDialog(null, "El coche tiene entre 0 y 6 marchas ni MÁS ni MENOS.");
			return;
		}
		else 
		{
			this.setMarcha(marcha);
		}	
	}
	
}
