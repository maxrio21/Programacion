package PrimerosPasos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame implements ActionListener
{

	JPanel panel;
	JLabel texto;
	JButton boton;
	ActionListener oyenteDeAccion;
	
	public Ventana() 
	{
		panel = new JPanel();
		texto = new JLabel();
		boton = new JButton();
		
		this.add(panel);
		panel.add(texto);
		panel.add(boton);
		
		texto.setText("Hola mundo");
		boton.setText("Pulsa me");
		
		boton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		boton.setText("He sido pulsado");
	}
	
	
}
