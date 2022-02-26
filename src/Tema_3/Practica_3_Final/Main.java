package Tema_3.Practica_3_Final;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) 
	{
		
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos pacientes quieres almacenar?"));
		int i = 0;

		Paciente[] arrayPacientes = new Paciente[cantidad];
		
		float[] arrayEdades = new float[cantidad];
		float estaturas = 0;
		float pesos = 0;
		
		while(i < cantidad) 
		{
			
			arrayPacientes[i] = new Paciente();
			arrayPacientes[i].obtenDatos();
			arrayPacientes[i].muestraDatos();
			arrayPacientes[i].calculaIMC();
			
			arrayEdades[i] = arrayPacientes[i].getEdad();
			estaturas = estaturas + arrayPacientes[i].getEstatura();
			pesos = pesos + arrayPacientes[i].getPeso();
			
			i++;
		}
		
		Arrays.sort(arrayEdades);
		float mediaEstatura = estaturas / arrayPacientes.length;
		float mediaPeso = pesos / arrayPacientes.length;
		
		
		JOptionPane.showMessageDialog(null, 
				
				"La edad máxima registrada es de: " + arrayEdades[arrayEdades.length - 1] + " años\n" +
				"La edad minima registrada es de: " + arrayEdades[0] + " años\n" + 
				"La media de estatura entre los pacientes es de: " + mediaEstatura + "cm.\n" + 
				"La media del peso entre los pacientes es de: " + mediaPeso + "kg."
				);
	}
}
