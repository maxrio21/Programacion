package Tema_4.Practica_4_Final;

import javax.swing.JOptionPane;

public class CirculoTestDrive 
{
	
	Circulo c = new Circulo();
	static CirculoTestDrive ct = new CirculoTestDrive();
	
	public static void main(String[] args) 
	{
		
		ct.obtenDatos();
		ct.muestraDatos();

	}
	
	public void obtenDatos()  
	{
		int i = 0;
		
		try 
		{
			while(i < 1) 
			{
				float radio = Float.parseFloat(JOptionPane.showInputDialog("Introduce el radio de la circunferencia"));
				
				if(radio > 0) {
					
					c.setRadio(radio);
					
					i++;
				} 
				else 
				{
					JOptionPane.showMessageDialog(null, "El numero introducido es menor a 0");
				}
				
			}
		} 
		
		catch(NumberFormatException e) 
		{
			JOptionPane.showMessageDialog(null, "El valor introducido debe ser numerico");
		}
		
		
	}
	
	public void muestraDatos() 
	{
		JOptionPane.showMessageDialog(null, "El radio de la circunferencia es de: " + c.getRadio() + " cm.\n" + 
											"El perimetro de la circunferencia es de: " + c.getPerimetro() + " cm.\n" + 
											"El area de la circunferencia es de: " + c.getArea() + " cm.");
	}
	
}
