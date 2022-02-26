package Tema_7.Practica_7_0.Coche;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) 
	{
		String matricula = JOptionPane.showInputDialog("Inserta la matricula del coche:");
		String modo = JOptionPane.showInputDialog("¿Tu coche es manual o automatico?.");
		Coche coche;
		
		boolean conducir = true;
		
		if(modo.equalsIgnoreCase("manual")) //Coche manual
		{
			coche = new CocheCanviManual(matricula);
			while(conducir == true)
			{
				coche.mostrar();
				String respuesta = JOptionPane.showInputDialog("Deseas frenar o avanzar");
				
				if(respuesta.equalsIgnoreCase("avanzar"))
				{
					double velocidad = Double.parseDouble(JOptionPane.showInputDialog("Inserta los kilometros extra que quieres subir"));

					coche.acelerar(velocidad);
				}
				else //frenar
				{
					double frenar = Double.parseDouble(JOptionPane.showInputDialog("Inserta los kilometros extra que quieres reducir"));
					coche.frenar(frenar);
				}
				coche.setMarcha(4);
				

				if(coche.getVelocidad() == 0)
				{
					boolean seguir = true;
					coche.setMarcha(0);
					
					if(JOptionPane.showInputDialog("¿Deseas salir del coche?").equalsIgnoreCase("si")) 
					{
						conducir = false;
					} 
					else if (JOptionPane.showInputDialog("¿Deseas salir del coche?").equalsIgnoreCase("no")) 
					{
						
					} 
					else 
					{
						JOptionPane.showMessageDialog(null, "Lo siento no te entiendo");
					}
				} 										//Punto muerto
				else if (coche.getVelocidad() > 0 && coche.getVelocidad() <= 20)  {coche.setMarcha(1);} //Primera
				else if (coche.getVelocidad() > 20 && coche.getVelocidad() <= 30) {coche.setMarcha(2);} //Segunda
				else if (coche.getVelocidad() > 30 && coche.getVelocidad() <= 45) {coche.setMarcha(3);} //Tercera
				else if (coche.getVelocidad() > 45 && coche.getVelocidad() <= 65) {coche.setMarcha(4);} //Cuarta
				else if (coche.getVelocidad() > 65 && coche.getVelocidad() <= 80) {coche.setMarcha(5);} //Quinta
				else if (coche.getVelocidad() > 80) {coche.setMarcha(6);}								//Sexta
				
			}
		}
		else //Coche automatico
		{
			while(conducir == true)
			{
				
			}
			
			coche = new CocheCanviAutomatico(matricula);
		}
		
	}
}
