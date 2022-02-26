package Tema_3.Practica_3_7;

import javax.swing.JOptionPane;

public class Persona {

	private String nombre;
	private int DNI;
	private String NIF;
	
	public void obtenDatos() 
	{
		this.nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		this.DNI = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu DNI"));
	}
	
	public void muestraDatos() 
	{
		String[] letras =  {"T", "R", "W", "A", "G", 
							"M", "Y", "F", "P", "D", 
							"X", "B", "N", "J", "Z", 
							"S", "Q", "V", "H", "L", 
							"C", "K", "E"
							};
		
		this.NIF = this.DNI + letras[this.DNI%23];
		
		JOptionPane.showMessageDialog(null, 
				
				
				
				"Nombre: " + this.nombre + "\n" + 
				"NIF: " + this.NIF);
	}
}
