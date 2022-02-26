package Examen_1_Avaluacion;

import javax.swing.JOptionPane;

public class Main 
{

	public static void main(String[] args) 
	{
		try 
		{
			int n_videojuegos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de juegos que tenemos disponibles"));
			VideoJuego[] vj = new VideoJuego[n_videojuegos];
			
			int i = 0;
			int j = 0;
			int k = 0;
			int distintos = 0;
			
			while(i < vj.length) 
			{
				
				vj[i] = new VideoJuego();
				vj[i].setTitulo();
				vj[i].setPlataforma();
				
				while(j < i) {
					
					if (vj[i].getTitulo().equals(vj[j].getTitulo()) && vj[i].getPlataforma().equals(vj[j].getPlataforma())) {
						
						JOptionPane.showMessageDialog(null, "El numero introducido esta repetido");
						
					}
					
					if (vj[i].getTitulo().equals(vj[j].getTitulo()) && !(vj[i].getPlataforma().equals(vj[j].getPlataforma()))) {
						
						distintos = 1;
						
					}

					j++;
				}
				j = 0;
				vj[i].setGenero();
				vj[i].setCoste(distintos);
				
				String pregunta = JOptionPane.showInputDialog("¿Quieres modificar el coste?");
				
				if (pregunta.equals("SI") || pregunta.equals("si") || pregunta.equals("S") || pregunta.equals("s")) 
				{
					vj[i].modifyCoste();
				} 
				
				vj[i].setDJuego();

				if (pregunta.equals("SI") || pregunta.equals("si") || pregunta.equals("S") || pregunta.equals("s")) 
				{
					vj[i].modifyDias();;
				} 
				
				i++;
			}
			
			while (k < vj.length) {
				JOptionPane.showMessageDialog(null, 
						"Videojuego nº" + (k+1) + ":\n\n" + 
						"Titulo: " + vj[k].getTitulo() + "\n" +
						"Plataforma: " + vj[k].getPlataforma() + "\n" + 
						"Género: " + vj[k].getGenero() + "\n" + 
						"Coste: " + vj[k].getCoste() + "€\n" + 
						"Dias de juego: " + vj[k].getDJuego());
				k++;
			}
		} 
		
		catch (NumberFormatException e) 
		{
			JOptionPane.showMessageDialog(null, "No te he entendido, repite bien el numero de videojuegos que deseas introducir.");
		}
		
		
	}
	
}
