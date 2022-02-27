package Tema_7.Practica_7_0.Electrodomesticos;

import javax.swing.JOptionPane;

public class Empresa 
{
	public static void main(String[] args) 
	{
		/*
		 * Creamos un array de 10 posiciones
		 * de tipo Elecrodomestico que instanciaremos
		 * más adelante.
		 */
		
		Electrodomestico[] e = new Electrodomestico[10];
		
		
	}
	
	/*
	 * Este metodo nos preguntará cada parametro
	 * sobre el electrodomestico y además calcula
	 * su precio.
	 */
	public void ventaElectrodomestico(Electrodomestico[] e)
	{
		/*
		 * Este for itera por cada posicion del array
		 * y genera un numero aleatorio del 0 - 2
		 * segun el numero hace que la posicion del array
		 * contenga una referencia a una clase u otra
		 */
		
		for (int i = 0; i < e.length; i++)
		{
			int valorAleatorio = (int) (Math.random() * 3);
			
			/*
			 * Preguntamos al usuario datos del
			 * electrodomestico.
			 */
			
			int precio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el precio del electrodomestico " + (i+1) + "."));
			String color = JOptionPane.showInputDialog("Introduce el color del electrodomestico " + (i+1) + ".");
			String askEnergetico = JOptionPane.showInputDialog("Introduce el consumo energetico del electrodomestico " + (i+1) + "\n" + "[A,B,C,D,E,F].");
			char consumoEnergetico = askEnergetico.charAt(0);
			int peso = Integer.parseInt(JOptionPane.showInputDialog("Introduce el peso del electrodomestico " + (i+1) + "."));
			
			switch (valorAleatorio)
			{
				case 0:
					
					int carga = Integer.parseInt(JOptionPane.showInputDialog("Introduce la carga de la lavadora " + (i+1) + "."));
					
					/*
					 * Constructor de la clase Lavadora personalizado
					 * int carga, int precio, 
					 * String color, char consumoEnergetico, 
					 * int peso
					 */
					
					e[i] = new Lavadora(carga,precio,color,consumoEnergetico,peso);
					
					break;
				case 1:
					
					int resolucion = Integer.parseInt(JOptionPane.showInputDialog("Introduce la resolucion de la pantalla " + (i+1) + "."));
					
					String askSmartTV = JOptionPane.showInputDialog("¿La television " + (i+1) + " posee smartTv? \n [Si o No]").toUpperCase();
					boolean smartTV = (askSmartTV.equalsIgnoreCase("SI")) ? (smartTV = true) : (smartTV = false) ;
					
					/*
					 * Constructor de la clase Television presonalizado
					 * int resolucion, boolean smartTV, 
					 * int precio, String color, 
					 * char consumoEnergetico, int peso
					 */
					
					e[i] = new Television(resolucion,smartTV,precio,color,consumoEnergetico,peso);
					break;
				case 2:
					
					e[i] = new Electrodomestico(precio,color,consumoEnergetico,peso);
					break;
			}
			
			/*
			 * Al final de declarar los valores
			 * de cada objeto calculamos el precio
			 * de cada electrodomestico.
			 */
			e[i].precioFinal();
		}
	}
}
