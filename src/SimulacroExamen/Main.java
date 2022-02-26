package SimulacroExamen;

import javax.swing.JOptionPane;

public class Main 
{

	public static void main(String[] args) 
	{
		try 
		{
			int num = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas habitaciones quieres reservar?"));
			Habitacion[] habitaciones = new Habitacion[num];
			
			int i = 0;
			while(i < habitaciones.length) {
				habitaciones[i] = new Habitacion();
				habitaciones[i].realizarReserva();
				habitaciones[i].muestraDatos();
				
				i++;
			}
		}
		
		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Si has venido a tocar las narices vete a otro hotel.");
		}
		
		
		
	}
	
}
