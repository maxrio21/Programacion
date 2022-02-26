package Examen_1_Avaluacion;

import javax.swing.JOptionPane;

public class VideoJuego {

	private String titulo;
	private String plataforma;
	private String genero;
	private float coste;
	private int d_juego;
	
	public String getTitulo() {return titulo;}
	public String getPlataforma() {return plataforma;}
	public String getGenero() {return genero;}
	public float getCoste() {return coste;}
	public int getDJuego() {return d_juego;}
	
	/*Seteas el titulo*/
	public void setTitulo() 
	{
		titulo = JOptionPane.showInputDialog("Introduce el nombre del videojuego");
	}
	
	/*Seteas la plataforma*/
	public void setPlataforma() 
	{
		plataforma = JOptionPane.showInputDialog("Introduce la plataforma para el videojuego:");
	}
	
	/*Seteas el genero*/
	public void setGenero() 
	{
		int i = 0;
		while (i < 1) {
		String tipoGenero = JOptionPane.showInputDialog("Introduce el genero del videojuego. \n Lista de generos disponibles:\n\n"
				+ "+ Accion\n+ Aventura\n+ Deporte\n+ Misterio\n+ Horror\n+ Plataformas\n");
		
		
			if 
			(
				tipoGenero.equals("Accion") || tipoGenero.equals("accion") ||
				tipoGenero.equals("Aventura") || tipoGenero.equals("aventura") ||
				tipoGenero.equals("Deporte") || tipoGenero.equals("deporte") ||
				tipoGenero.equals("Misterio") || tipoGenero.equals("misterio") ||
				tipoGenero.equals("Horror") || tipoGenero.equals("horror") ||
				tipoGenero.equals("Plataformas") || tipoGenero.equals("plataformas")
			) 
			{
				
				i = 1;
				genero = tipoGenero;
	
			} 
			
			else {JOptionPane.showMessageDialog(null, "El genero introducido es invalido");}
		}
		
	}
	
	/*Seteas el coste*/
	public void setCoste(int d) 
	{
		float costeTotal = Float.parseFloat(JOptionPane.showInputDialog("Introduce el coste del producto"));
		 
		if (d == 1) {
			coste = costeTotal / 2;
		} 
		else {
			coste = costeTotal;
		}
		
	}

	/*Seteas los dias de juego*/
	public void setDJuego()
	{
		try 
		{
			
			int dJuego = Integer.parseInt(JOptionPane.showInputDialog("Introduce los dias de juego del videojuego"));
			
			if(dJuego <= 0) {d_juego = 0;}
			else {d_juego = dJuego;}
			
			
			if (dJuego <= 10) {JOptionPane.showMessageDialog(null, "El juego es interesante, te animo a que descubras más.");} 
			else if (dJuego > 10 && dJuego <= 20) {JOptionPane.showMessageDialog(null, "Eres bueno en el juego");} 
			else if (dJuego > 20 && dJuego <= 30) {JOptionPane.showMessageDialog(null, "Has jugado suficiente");} 
			else if (dJuego > 30) {JOptionPane.showMessageDialog(null, "Eres un viciado, te animo a que descubras otros juegos");}
			
		} 
		catch (NumberFormatException e) {JOptionPane.showMessageDialog(null, "Has introducido un formato incorrecto, escribe un numero mayor o igual a 0.");}

	}
	
	public void modifyCoste() {
		int i = 0;
		while (i < 1) 
		{
			try 
			{
				
				float c = Float.parseFloat(JOptionPane.showInputDialog("Introduce el nuevo precio del videojuego.\n(Recuerda que no puede ser un precio inferior a 30,50€ ni superior a 100€)"));
				if (c > 30.5 && c <= 100) 
				{
					c = coste;
					i++;
				} 
				else 
				{
					JOptionPane.showMessageDialog(null, "El importe introducido es incorrecto, vuelte a intentarlo.");
				}
				
			}
			
			catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "El formato del importe introducido es incorrecto.");
			}
		}
	}
	
	public void modifyDias() 
	{
		
		int i = 0;
		while (i < 1) 
		{
			try 
			{
				
				int de = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero extra de dias a añadir."));
				d_juego = getDJuego() + de;
				i++;


			}	
			catch(NumberFormatException e) 
			{
				JOptionPane.showMessageDialog(null, "El formato de los dias extras introducido es incorrecto.");
			}
		}
	}
	
	
}
