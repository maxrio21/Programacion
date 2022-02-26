package Tema_2.Practica_2_Final;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main (String[] args) {
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos alumnos quieras ingresar?"));
		for (int i = 0; i < cantidad; i++) {
			
			Alumno alu = new Alumno();
			
			alu.nombre = JOptionPane.showInputDialog("Ingresa el nombre del alumno nº " + (i+1));
			alu.nota = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la nota del alumno nº " + (i+1)));
		
			if(alu.nota < 5) {
				alu.reprender();
			} else if (alu.nota >= 5) {
				alu.felicitar();
			}
		}
	}
}
