package CorreccionExamen;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Videojuegos 
{

	private String titulo;
	private String plataforma;
	private ArrayList<String> genero = new ArrayList<String>();
	private float coste;
	private int diasJuego;
	
	public void setTitulo() 
	{
		String tit = JOptionPane.showInputDialog("Introduce un titulo");
		this.titulo = tit; 
	}
	
	public void setGenero () 
	{
			
		String gen = JOptionPane.showInputDialog("Introduce un genero:") ;	
			
		if (!gen.equalsIgnoreCase("accion") || 
			!gen.equalsIgnoreCase("aventura") ||
			!gen.equalsIgnoreCase("deporte") ||
			!gen.equalsIgnoreCase("misterio") ||
			!gen.equalsIgnoreCase("horror") ||
			!gen.equalsIgnoreCase("plataforma")) 
		{
			JOptionPane.showMessageDialog(null, "El genero introducido es invalido.");
		} 
		
		else 
		{
			int i = 0;
			while (i < 1) 
			{
				genero.add(gen);
				String decision = JOptionPane.showInputDialog("¿Estas seguro de que no quieres modificar el genero?");
				
				if(decision.equalsIgnoreCase("si") || decision.equalsIgnoreCase("s")) 
				{
					String nuevo = JOptionPane.showInputDialog("Introduce el nuevo genero");
					this.genero.add(nuevo);
					i++;
				}
				
				else if (decision.equalsIgnoreCase("no") || decision.equalsIgnoreCase("n"))
				{
					i++;
				} 
				
				else 
				{
					JOptionPane.showMessageDialog(null, "La respuesta introducida es incorrecta, introduce Si o No.");
				}
			}
		}	
	}
	
	
	
	public void setDias()
	{
		try 
		{
			
			int dJuego = Integer.parseInt(JOptionPane.showInputDialog("Introduce los dias de juego del videojuego"));
			
			if(dJuego <= 0) 
			{
				diasJuego = 0;
			}
			else 
			{
				diasJuego = dJuego;
			}
			
			int i = 0;
			while (i < 1) 
			{
				
				String decision = JOptionPane.showInputDialog("¿Estas seguro de que no quieres modificar el genero?");
				
				if(decision.equalsIgnoreCase("si") || decision.equalsIgnoreCase("s")) 
				{
					int nuevo = Integer.parseInt(JOptionPane.showInputDialog("Modifica los dias:"));
					
					if(nuevo < this.diasJuego) 
					{
						JOptionPane.showMessageDialog(null, "Has introducido menos dias de los esperado.");
					}
					
					this.diasJuego = nuevo;
					i++;
				}
				
				else if (decision.equalsIgnoreCase("no") || decision.equalsIgnoreCase("n"))
				{
					i++;
				} 
				
				else 
				{
					JOptionPane.showMessageDialog(null, "La respuesta introducida es incorrecta, introduce Si o No.");
				}
			
			} 
		}
		catch (NumberFormatException e) {JOptionPane.showMessageDialog(null, "Has introducido un formato incorrecto, escribe un numero mayor o igual a 0.");
		
		}
	}
	
	public void setPlataforma() 
	{
		String plat = JOptionPane.showInputDialog("Introduce la plataforma:");
		this.plataforma = plat;		
	}
	
	public void setPrecio() 
	{
		float cost = Float.parseFloat(JOptionPane.showInputDialog("Introduce el precio:"));
		int i = 0;
		
		while (i < 1) 
		{
			if(cost < 30.50 || coste > 100) 
			{
				JOptionPane.showMessageDialog(null, "El precio introducido no puede superar los 100€ ni ser menor que 30.50€");
			} 
			else 
			{
				this.coste = cost;
				i++;
				
				while (i < 1) 
				{
					String decision = JOptionPane.showInputDialog("¿Estas seguro de que no quieres modificar el genero?");
					
					if(decision.equalsIgnoreCase("si") || decision.equalsIgnoreCase("s")) 
					{
						float nuevo =  Float.parseFloat(JOptionPane.showInputDialog("Introduce el nuevo genero"));
						this.coste = nuevo;
						i++;
					}
					
					else if (decision.equalsIgnoreCase("no") || decision.equalsIgnoreCase("n"))
					{
						i++;
					} 
					
					else 
					{
						JOptionPane.showMessageDialog(null, "La respuesta introducida es incorrecta, introduce Si o No.");
					}
				}
			}
		}
	}
	
	public void mensajeDiasJuego() 
	{
	
	}
}
