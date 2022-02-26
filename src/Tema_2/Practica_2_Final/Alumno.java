package Tema_2.Practica_2_Final;

import javax.swing.JOptionPane;

public class Alumno {

	String nombre;
	int nota;
	
	public void felicitar() {
		JOptionPane.showMessageDialog(null,"Felicidades " + nombre + ", has sacado un: " + nota);
	}
	
	public void reprender() {
		JOptionPane.showMessageDialog(null,"¡Muy mal! " + nombre + ", debes de estudiar más, has sacado un misero: " + nota);
	}
	
	
	
}
