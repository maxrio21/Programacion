package Tema_5.Practica_5_2;

import javax.swing.JOptionPane;

public class Operaciones 
{

	public void operacionSumas(String num) 
	{
	
		String numero_string = num;
		int suma = 0;
		String texto = "";
		
	
		for(int i = 0; i < numero_string.length();i++) 
		{
			int n = Integer.parseInt(numero_string.substring(i,i+1));
			
			if (i == numero_string.length()-1) 
			{texto = texto + n + " = ";} 
			else 
			{texto = texto + n + " + ";}
			
			suma = suma + n;
		}
		
		JOptionPane.showMessageDialog(null,texto + "" + suma);
		
	}
	
}
