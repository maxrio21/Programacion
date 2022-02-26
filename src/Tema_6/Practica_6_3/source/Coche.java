package Tema_6.Practica_6_3.source;

import javax.swing.JOptionPane;

public class Coche 
{

	private int numero;
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private String techoSolar;
	private float kilometros;
	private int numPuertas;
	private int numPlazas;
	
	//Getters
	
	public int getNumero() {return numero;}
	public String getMatricula() {return matricula;}
	public String getMarca() {return marca;}
	public String getModelo() {return modelo;}
	public String getColor() {return color;}
	public String getTechoSolar() {return techoSolar;}
	public float getKilometros() {return kilometros;}
	public int getNumPuertas() {return numPuertas;}
	public int getNumPlazas() {return numPlazas;}

	//Constructores
	
	public Coche(String matricula, float kilometros, int numPuertas, int numPlazas)
	{
		this.matricula = matricula;
		this.marca = "SEAT";
		this.modelo = "ALTEA";
		this.color = "blanco";
		this.techoSolar = "No";
		this.kilometros = kilometros;
		this.numPuertas = numPuertas;
		this.numPlazas = numPlazas;
	}
	
	public Coche(String matricula) 
	{
		this.matricula = matricula;
	}
	
	public Coche(int numPuertas, int numPlazas) 
	{
		this.numPuertas = numPuertas;
		this.numPlazas = numPlazas;
	}
	
	public Coche(String marca, String modelo, String color) 
	{
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}
	
	//Setters
	
	public void setNumero(int numero) {this.numero = numero;}
	
	public void setMatricula(String matricula) {this.matricula = matricula;}
	
	public void setMarca(String marca) {this.marca = marca;}
	
	public void setModelo(String modelo) {this.modelo = modelo;}
	
	public void setColor(String color) {this.color = color;}
	
	public void setTechoSolar(String techoSolar) {this.techoSolar = techoSolar;}
	
	public void setKilometros(float kilometros) 
	{
		try 
		{
			if(kilometros < 0) 
			{
				JOptionPane.showMessageDialog(null, "Los kilometros introducidos son inferiores a 0.");
			} 
			else 
			{
				this.kilometros = kilometros;
			}
		} 
		catch (NumberFormatException e) 
		{
			JOptionPane.showMessageDialog(null, "El formato numerico introducido es invalido.");
		}
	}

	public void setNumPuertas(int numPuertas) 
	{
		try 
		{
			if(numPuertas < 0) 
			{
				JOptionPane.showMessageDialog(null, "El numero de puertas introducido es inferior a 0.");
			} 
			else 
			{
				this.numPuertas = numPuertas;
			}
		} 
		catch (NumberFormatException e) 
		{
			JOptionPane.showMessageDialog(null, "El formato numerico introducido es invalido.");
		}
	}
		
	public void setNumPlazas(int numPlazas) 
	{
		try 
		{
			if(numPlazas < 0) 
			{
				JOptionPane.showMessageDialog(null, "El numero de plazas introducido es inferior a 0.");
			} 
			else 
			{
				this.numPlazas = numPlazas;
			}
		} 
		catch (NumberFormatException e) 
		{
			JOptionPane.showMessageDialog(null, "El formato numerico introducido es invalido.");
		}	
	}
	
	public void avanzar(float km_a) 
	{
		float km_sumados = km_a + this.getKilometros();
		
		JOptionPane.showMessageDialog
		(null, 
				"Kilometros recorridos anteriormente: " + this.getKilometros() + "\n" + 
				"Kilometros recorridos por el mecanico: " + km_a + "\n" + 
				"Total de kilometros recorridos: " + km_sumados
		);
		
		this.setKilometros(km_sumados);
	}
	
	public void tunear() 
	{
		this.setKilometros(0);
		
		if (this.getTechoSolar() == null) 
		{
			this.setTechoSolar("Si");
			JOptionPane.showMessageDialog(null,
					"El mecanico establece el cuenta kilometros a 0\n" + 
					"y le instala un techo solar.");
			
		} 
		else 
		{
			JOptionPane.showMessageDialog(null,
					"El mecanico establece el cuenta kilometros a 0\n" + 
					"pero no le instala un techo solar.");
		}
	}
	
	public void tunear(String color)
	{
		this.setColor(color);
		this.setKilometros(0);
		
		if (this.getTechoSolar() == null) 
		{
			this.setTechoSolar("Si");
			JOptionPane.showMessageDialog(null,
					"El mecanico establece el cuenta kilometros a 0\n" +
					"seguido pinta la carroceria de color "+ color + "\n" +
					"y por ultimo le instala un techo solar.");
			
		} 
		else 
		{
			JOptionPane.showMessageDialog(null,
					"El mecanico establece el cuenta kilometros a 0\n" + 
					"seguido pinta la carroceria de color "+ color + "\n" +
					"pero no le instala un techo solar.");
		}
	}
	
	public void matricular(String matricula) 
	{
		this.setMatricula(matricula);
		JOptionPane.showMessageDialog(null,
				"Se ha matriculado un coche con la matricula: " + matricula);
	}
}
