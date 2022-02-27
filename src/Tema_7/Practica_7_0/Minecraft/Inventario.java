package Tema_7.Practica_7_0.Minecraft;

import javax.swing.JOptionPane;

public class Inventario 
{
	public static void main(String[] args) {
		
		boolean continuar = false;
		
		Slots[] s = new Slots[7];
		Items i = null;
		
		while(!continuar) 
		{
			/*
			 * Este try/catch sabrá si
			 * estas introduciendo un numero
			 * o cualquier otro valor.
			 */
			try 
			{
				
				
				/*
				 * Este switch obtendrá los datos introducidos 
				 * por el usuario y según el valor realizará
				 * una accion u otra.
				 */
				switch(Integer.parseInt(JOptionPane.showInputDialog(
					"¿Que deseas hacer?\n" + 
					"-------------------------------\n" + 
					"1. Añadir al inventario.\n" + 
					"2. Eliminar del inventario.\n" + 
					"3. Mostrar inventario.\n" + 
					"0. Salir."
				))) 
				{
					//Salir de la interfaz
					case 0: 
						continuar = true;
						break;
						
					//Añadir al inventario
					case 1: 

						/*
						 * Pide al usuario que diga 
						 * el slot del 1 - 7 donde quiere
						 * añadir el objeto.
						 */
						int slotNumber = Integer.parseInt(JOptionPane.showInputDialog("Escribe del 1 al 7 el slot a añadir objetos")) - 1;
						
						/*
						 * Pide al usuario que escriba la
						 * cantidad de objetos a introducir.
						 */
						int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Escribe la cantidad de objetos a guardar."));
						
						
						/*
						 * Pide al usuario que inserte un item
						 * que este dentro de la lista de items.
						 */
						String respuesta = JOptionPane.showInputDialog("Escribe el objeto a añadir");
												
						/*
						 * El try comprueba que el objeto introducido esta 
						 * dentro de la lista de enums y si no lo esta
						 * el catch te dira que no se ha encontrado.
						 */
						try 
						{
							/*
							 * Aqui creamos un nuevo slot y directamente comprobamos que el
							 * item existe, si existe le añade la capacidad máxima de estos items 
							 * que puedes tener, que hemos hecho que pida el constructor
							 */
							Items validItem = Items.valueOf(respuesta);
							
							s[slotNumber] = new Slots(validItem.getStack());
						
							

							/*
							 * Aqui comprobamos que la cantidad que queremos
							 * añadir no sea superior a la que permite el objeto.
							 */
							
							if(s[slotNumber].getCantidad() + cantidad <= s[slotNumber].getMaxCantidad()) 
							{
								if(cantidad <= s[slotNumber].getMaxCantidad())
								{
									s[slotNumber].setItem(validItem);
									s[slotNumber].setCantidad(s[slotNumber].getCantidad() + cantidad);
									
									System.out.println("Se ha añadido " + cantidad + " de " + validItem + " a tu inventario");
								}
								else 
								{
									System.out.println("El stack es demasiado grande, no cabe.");
								}
							}
							else 
							{
								System.out.println("La cantidad a añadir es superior al espacio que te queda.");
							}
						}
						catch(IllegalArgumentException ex)
						{
							JOptionPane.showInputDialog("El item introducido esta mal escrito o no existe.");
						}

						break;
						
					//Eliminar del inventario
					case 2: 
						
						/*
						 * Pide al usuario que diga 
						 * el slot del 1 - 7 donde quiere
						 * añadir el objeto.
						 */
						int removeNumber = Integer.parseInt(JOptionPane.showInputDialog("Escribe el slot a borrar")) - 1;
						
						s[removeNumber] = null;
						
						break;
						
					//Mostrar inventario
					case 3:
					
						String mensaje = "";
						String tryItem = "";
						String tryCantidad = "";
						
						for(int j = 0; j < s.length; j++) 
						{
						
							try 
							{
								tryItem = s[j].getItem().toString();
								tryCantidad = String.valueOf(s[j].getCantidad());
							
								mensaje = mensaje + "Slot " + (j + 1) + "\n" + "Item: " + tryItem + "\n" + "Cantidad: " + tryCantidad + "\n" + "" + "\n";

							}
							catch(NullPointerException e)
							{
								tryItem = "Vacio";
								tryCantidad = "0";
								
								mensaje = mensaje + "Slot " + (j + 1) + ": Vacio\n" + "" + "\n";

							}
						}
						
						JOptionPane.showMessageDialog(null,mensaje);
					
						break;
					//Opcion erronea.	
					default:
						JOptionPane.showMessageDialog(null, "Opcion inexistente, porfavor \nuse las opciones [0,1,2 y 3], gracias.");
						break;
				}
			}
			catch(NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "Formato numerico erroneo, porfavor \nuse las opciones [0,1,2 y 3], gracias.");
			}			
		}
	}
}
