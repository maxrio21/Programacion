package Concurso;

import javax.swing.JOptionPane;

public class Main 
{
	public static void main(String[] args) {		
		int m = 0, a= 0, c= 0, x=0;		
		while(x<1 || x>100000) {
			 x = Integer.parseInt(JOptionPane.showInputDialog("Cuantos vas a introducir"));
		}
			for(int i =0;i<x;i++) {				
				m = Integer.parseInt(JOptionPane.showInputDialog("Magenta"));				
				a = Integer.parseInt(JOptionPane.showInputDialog("Amarillo"));				
				c = Integer.parseInt(JOptionPane.showInputDialog("Cian"));				
				String col = JOptionPane.showInputDialog("colores").toUpperCase();				
				while(true) {					
					for(int j=0;j<100000
							
							
							
							
							
							
							
							
							
							
							;j++) {
						if(col.substring(j).equals("M")) {
							m--;
						}
						if(col.substring(j).equals("A")) {
							a--;
						}
						if(col.substring(j).equals("C")) {
							c--;
						}
						if(col.substring(j).equals("R")) {
							m--;
							a--;
						}
						if(col.substring(j).equals("N")) {
							m--;
							a--;
							c--;
						}
						if(col.substring(j).equals("V")) {
							a--;
							c--;
						}
						if(col.substring(j).equals("L")) {
							m--;
							c--;
						}					
					}
					break;					
				}
				
				if(m<0 || a<0 || c<0) {
					JOptionPane.showMessageDialog(null,"NO"+ m + "" + a+ ""+c);
				}
				
				else {
					JOptionPane.showMessageDialog(null, "SI" + m + "" + a+ "" +c);
				}				
			}		
	}
}
