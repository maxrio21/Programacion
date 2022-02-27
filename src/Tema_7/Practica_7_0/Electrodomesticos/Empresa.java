package Tema_7.Practica_7_0.Electrodomesticos;

public class Empresa 
{
	public static void main(String[] args) 
	{
		/*
		 * Creamos un array de 10 posiciones
		 * de tipo Elecrodomestico que instanciaremos
		 * más adelante.
		 */
		
		Electrodomestico[] electrodomestico = new Electrodomestico[10];
		
		/*
		 * Este for itera por cada posicion del array
		 * y genera un numero aleatorio del 0 - 2
		 * segun el numero hace que la posicion del array
		 * contenga una referencia a una clase u otra
		 */
		
		for (int i = 0; i < electrodomestico.length; i++)
		{
			int valorAleatorio = (int) (Math.random() * 3);
			
			switch (valorAleatorio)
			{
				case 0:
					electrodomestico[i] = new Lavadora();
					break;
				case 1:
					electrodomestico[i] = new Television();
					break;
				case 2:
					electrodomestico[i] = new Electrodomestico();
					break;
			}
		}
	}
}
