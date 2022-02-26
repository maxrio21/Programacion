package Tema_6.Practica_6_3.source;

import javax.swing.JOptionPane;

public class Fabrica 
{
	public static void main(String[] args) 
	{
		Coche arrayCoches[] = new Coche[4];
		
		//Coche 1.
		arrayCoches[0] = new Coche("1234-DF",200,3,5);
		arrayCoches[0].setNumero(1);
		arrayCoches[0].setMarca("Seat");
		arrayCoches[0].setModelo("Toledo");
		arrayCoches[0].setColor("azul");
		arrayCoches[0].setKilometros(200);
		arrayCoches[0].setNumPuertas(3);
		arrayCoches[0].setNumPlazas(5);
		
		//Coche 2.
		arrayCoches[1] = new Coche("5678-AG");
		arrayCoches[1].setNumero(2);
		arrayCoches[1].setMarca("Fiat");
		arrayCoches[1].setModelo("Uno");
		arrayCoches[1].setColor("azul");
		arrayCoches[1].setTechoSolar("Si");
		arrayCoches[1].setKilometros(300);
		arrayCoches[1].setNumPuertas(3);
		arrayCoches[1].setNumPlazas(2);
		
		//Coche 3.
		arrayCoches[2] = new Coche(5,5);
		arrayCoches[2].setMatricula("9012-HH");
		arrayCoches[2].setNumero(3);
		arrayCoches[2].setMarca("BMW");
		arrayCoches[2].setModelo("850");
		arrayCoches[2].setColor("gris");
		arrayCoches[2].setKilometros(400);

		//Coche 4.
		arrayCoches[3] = new Coche("VW","Caddy","blanco");
		arrayCoches[3].matricular("3456-XS");
		arrayCoches[3].setNumero(4);
		arrayCoches[3].setTechoSolar("Si");
		arrayCoches[3].setKilometros(500);
		arrayCoches[3].setNumPuertas(5);
		arrayCoches[3].setNumPlazas(7);
		
		for (int i = 0;i <= 3; i++)
		{
			caracteristicas
			(
					arrayCoches[i].getNumero(),
					arrayCoches[i].getMatricula(),
					arrayCoches[i].getMarca(),
					arrayCoches[i].getModelo(),
					arrayCoches[i].getColor(),
					arrayCoches[i].getTechoSolar(),
					arrayCoches[i].getKilometros(),
					arrayCoches[i].getNumPuertas(),
					arrayCoches[i].getNumPlazas()
			);
		}
	}
		
	
	public static void caracteristicas(int num,String mat,String marc,String mod,String col,String techo,float km,int npu,int npl) 
	{
		
			JOptionPane.showMessageDialog(null, 
					"Coche:    " + num + "\n" + 
					"Matricula:    " + mat + "\n" + 
					"Marca:    " + marc + "\n" + 
					"Modelo:    " + mod + "\n" + 
					"Color:    " + col + "\n" + 
					"Techo Solar:    " + techo + "\n" + 
					"Kilometros:    " + km + "\n" + 
					"Nº puertas:    " + npu + "\n" + 
					"Nº plazas:    " + npl + "\n"  	
			);	
	}
	
}

