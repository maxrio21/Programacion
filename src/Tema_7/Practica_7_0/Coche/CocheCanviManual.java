package Tema_7.Practica_7_0.Coche;

import javax.swing.JOptionPane;

public class CocheCanviManual extends Coche 
{
	public CocheCanviManual(String mat) {
		super(mat);
	}

	@Override
	public void cambiarMarcha(int marcha)
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
