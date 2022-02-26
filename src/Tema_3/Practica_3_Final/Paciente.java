package Tema_3.Practica_3_Final;

import javax.swing.JOptionPane;

public class Paciente 
{
	private String nombre;
	private int edad;
	private float peso;
	private float estatura;
	
	//Getter para obtener la edad del paciente.
	public int getEdad(){ return this.edad;}
	//Getter para obtener el peso del paciente.
	public float getPeso(){ return this.peso;}
	//Getter para obtener la estura del paciente.
	public float getEstatura(){ return this.estatura;}
	
	
	/*
	 * Este metodo modifica los datos de las variables de la clase a traves
	 * de entrada de teclado usando JOptionPane.
	 */
	
	public void obtenDatos() 
	{
		this.nombre = JOptionPane.showInputDialog("¿Como se llama el paciente?");
		this.edad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos años tiene el paciente?"));
		this.peso = Float.parseFloat(JOptionPane.showInputDialog("¿Cuanto pesa el cliente?"));
		this.estatura = Float.parseFloat(JOptionPane.showInputDialog("¿Cuanto mide el paciente?"));
	}
	
	//Este metodo calcula el IMC del paciente.
	public float calculaIMC() {return peso/(estatura * estatura);}
	
	//Este metodo calcula el estado del paciente a través del IMC de este.
	public String calculaEstado() 
	{
		float imc = calculaIMC();
		String estado = "DESCONOCIDO";
		
		if(imc < 16) {estado = "DESNUTRICIÓN GRADO 3";}
		else if (imc == 16 || imc < 17) {estado = "DESNUTRICIÓN GRADO 2";}
		else if (imc == 17 || imc < 18.5) {estado = "DESNUTRICIÓN GRADO 1";}
		else if (imc == 18.5 || imc < 25) {estado = "NORMAL";}
		else if (imc == 25 || imc < 30) {estado = "SOBREPESO GRADO 1";}
		else if (imc == 30 || imc < 40) {estado = "SOBREPESO GRADO 2";}
		else if (imc == 40 || imc > 40) {estado = "SOBREPESO GRADO 3";}

		return estado;
	}
	
	//Este muestra todos los datos introducidos.
	public void muestraDatos() 
	{
		JOptionPane.showMessageDialog(null,
		"Paciente: " + nombre + "\n" + 
		"Edad: " + edad + "\n" +  
		"Peso: " + peso + "\n" + 
		"Estatura: " + estatura + "\n" + 
		"IMC: " + calculaIMC() + "\n" + 
		"Estado actual: " + calculaEstado()
		);
	}
}
