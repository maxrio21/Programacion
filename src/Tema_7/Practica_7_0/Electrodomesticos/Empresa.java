package Tema_7.Practica_7_0.Electrodomesticos;

import javax.swing.JOptionPane;

public class Empresa 
{
	
	Empresa em = new Empresa();
	
	
	public static void main(String[] args) 
	{
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de electrodomesticos"));
		
		/*
		 * Creamos un array de n posiciones definidas
		 * por el usuario de tipo Elecrodomestico que 
		 * instanciaremos más adelante.
		 */
		final Electrodomestico[] e = new Electrodomestico[cantidad];
		
		ventaElectrodomestico(e);
		mostrarResultados(e);
	}
	
	/*
	 * Este metodo nos mostrara información
	 * sobre casa electrodomestico.
	 */
	public static void mostrarResultados(Electrodomestico[] e)
	{
		for(int i = 0;i < e.length;i++) 
		{
			if(e[i] instanceof Electrodomestico) 
			{
				JOptionPane.showMessageDialog(null,
					"Electrodomestico nº " + (i+1) + "\n" + 
					"------------------------" + "\n" + 
					"Tipo: " + e[i].getClass().getSimpleName() + "\n" +
					"Precio: " + e[i].getPrecio() + "\n" +
					"Color: " + e[i].getColor() + "\n" +
					"Consumo energetico: " + e[i].getConsumo() + "\n" +
					"Peso: " + e[i].getPeso()
				);
			}
			else if(e[i] instanceof Lavadora)
			{
				JOptionPane.showMessageDialog(null,
						"Electrodomestico nº " + (i+1) + "\n" + 
						"------------------------" + "\n" + 
						"Tipo: " + e[i].getClass().getSimpleName() + "\n" +
						"Precio: " + e[i].getPrecio() + "\n" +
						"Color: " + e[i].getColor() + "\n" +
						"Consumo energetico: " + e[i].getConsumo() + "\n" +
						"Peso: " + e[i].getPeso() + "\n" +
						"Carga: " + ((Lavadora) e[i]).getCarga()
					);
			}
			else if(e[i] instanceof Television)
			{
				if(((Television) e[i]).getSmartTV()) 
				{
					JOptionPane.showMessageDialog(null,
							"Electrodomestico nº " + (i+1) + "\n" +
							"------------------------" + "\n" + 
							"Tipo: " + e[i].getClass().getSimpleName() + "\n" +
							"Precio: " + e[i].getPrecio() + "\n" +
							"Color: " + e[i].getColor() + "\n" +
							"Consumo energetico: " + e[i].getConsumo() + "\n" +
							"Peso: " + e[i].getPeso() + "\n" + 
							"Resolucion: " + ((Television) e[i]).getResolucion() + "\n" +
							"SmartTV: Si");
				} 
				else 
				{
					JOptionPane.showMessageDialog(null,
							"Electrodomestico nº " + (i+1) + "\n" +
							"------------------------" + "\n" + 
							"Tipo: " + e[i].getClass().getSimpleName() + "\n" +
							"Precio: " + e[i].getPrecio() + "\n" +
							"Color: " + e[i].getColor() + "\n" +
							"Consumo energetico: " + e[i].getConsumo() + "\n" +
							"Peso: " + e[i].getPeso() + "\n" + 
							"Resolucion: " + ((Television) e[i]).getResolucion() + "\n" +
							"SmartTV: No");
				}
			}
		}	
	}
	
	/*
	 * Este metodo nos preguntará cada parametro
	 * sobre el electrodomestico y además calcula
	 * su precio.
	 */
	public static void ventaElectrodomestico(Electrodomestico[] e)
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
