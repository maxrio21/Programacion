package Tema_3.Practica_3_0;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) 
	{
		
		JOptionPane.showMessageDialog(null, "1. int x = 34.5 | No es legal por que estas asignando un numero real a un numero entero por lo que a no ser que le hagas un casting o un parse este no lo redondeara");
		JOptionPane.showMessageDialog(null, "2. boolean boo = x | No es legal por que estas intentando asignar una variable de tipo entero que ya de por si fallaba a una variable de tipo booleano. ");
		JOptionPane.showMessageDialog(null, "3. int g = 17 | Es legal.");
		JOptionPane.showMessageDialog(null, "4. int y = g | Es legal.");
		JOptionPane.showMessageDialog(null, "5. y = y + 10| Es legal.");
		JOptionPane.showMessageDialog(null, "6. short s | Es legal.");
		JOptionPane.showMessageDialog(null, "7. s = y | Es legal.");
		JOptionPane.showMessageDialog(null, "8. byte b = 3 | Es legal.");
		JOptionPane.showMessageDialog(null, "9. byte v = b | Es legal.");
		JOptionPane.showMessageDialog(null, "10. short n = 12 | Es legal.");
		JOptionPane.showMessageDialog(null, "11. v = n | Es legal");
		JOptionPane.showMessageDialog(null, "12. byte k = 128 | Es ilegal por que estas asignando un valor superior de lo que el tipo de variable soporta, en concreto (-128 hasta 127). ");

	}
}
