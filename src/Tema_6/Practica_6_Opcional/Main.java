package Tema_6.Practica_6_Opcional;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main 
{
	public static void main(String[] args) 
	{
	
		boolean continueInterface = true;
		
		/*
		 * Ejercicio 1
		 */
		
		ArrayList<Pet> pets = new ArrayList<Pet>();
		
		//Objeto 1
		pets.add(new Pet());
		//Objeto 2
		pets.add(new Pet("Toby",2.56,"Green"));
		//Objeto 3
		pets.add(pets.get(0));
		//Objeto 4
		pets.add(pets.get(1));
		
		pets.get(0).setName("Roby");
		System.out.println(pets.get(2).getName());
		
		/*
		 * Ejercicio 2
		 */
		
		System.out.println(pets.get(0).isSame(pets.get(0)));
		System.out.println(pets.get(0).isSame(pets.get(1)));
		
		/*
		 * Ejercicio 7
		 */
		
		while(continueInterface == true) 
		{
			ArrayList<intArray> ints = new ArrayList<intArray>();
			int option = Integer.parseInt(JOptionPane.showInputDialog
					(
					"Bienvenido al menú de IntArray, introduzca la acción que desea realizar:" + "\n" +
					"1: Introducir un nuevo Array de enteros" + "\n" +
					"2: Obtener el mayor de los números" + "\n" +
					"3: Obtener el sumatorio de los elementos del Array" + "\n" +
					"4: Obtener el Array de los pares o los impares dependiendo de la situación" + "\n" +
					"0: Salir"
					));
			
			switch(option)
			{
				case 0:
					continueInterface = false;
					break;
				case 1:
					/*
					 * Ejercicio 3
					 */
					

					//Objeto 1
					ints.add(new intArray());
					//Objeto 2
					ints.add(new intArray(2));
					//Objeto 3
					ints.add(new intArray(ints.get(0).getSize()));
					//Objeto 4
					ints.add(new intArray(ints.get(1).getSize()));
					break;
				case 2:
					ints.add(new intArray());
					JOptionPane.showMessageDialog(null, "El mayor numero de los enteros es: " + ints.get(0).getBigger());
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "El sumatorio de los elementos del array es: " + ints.get(0).sumatorio(6));
					break;
				case 4:
					JOptionPane.showMessageDialog(null, ints.get(0).parOImpar());
					break;
			}
		}	
	}
}
