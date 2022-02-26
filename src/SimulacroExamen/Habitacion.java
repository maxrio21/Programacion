package SimulacroExamen;

import javax.swing.JOptionPane;

public class Habitacion {

	private int num_camas;
	private boolean vistas;
	private int dias_reserva;
	private int precio;
	private String comidas_reservadas = "";
	
	public void realizarReserva()
	{
		
		/*AQUI QUE ASEGURA QUE INTRODUCES EL NUMERO DE CAMAS CORRECTO*/
		int i = 0;
		while(i < 1) {
			try 
			{
				int numC = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas camas quieres reservar?"));
				
				if (numC > 0 && numC <= 4) 
				{
					this.num_camas = numC;
					i++;
				} 
				else 
				{
					JOptionPane.showMessageDialog(null, "¡Debes seleccionar como mínimo una cama!");
				}
			}
			catch (NumberFormatException e) 
			{
				JOptionPane.showMessageDialog(null, "¡El formato introducido es erroneo!, debes escribir un numero");

			}
			
		}
		
		
		/*AQUI QUE ASEGURA QUE INTRODUCES LAS VISTAS CORRECTAS*/
		i = 0;
		while(i < 1) {
			
			String vis = JOptionPane.showInputDialog("¿Deseas tener vistas al mar?");
			
			if (vis.equals("Si") || vis.equals("SI") || vis.equals("S")) 
			{
				this.vistas = true;
				i++;
			} 
			
			else if (vis.equals("No") || vis.equals("NO") || vis.equals("N")) 
			{
				this.vistas = false;
				i++;
			} 
			
			else 
			{
				JOptionPane.showMessageDialog(null, "¡El formato introducido es erroneo!, escribe Si o No.");
			}
		}
		
		
		
		/*AQUI QUE ASEGURA QUE INTRODUCES RESERVA CORRECTA*/
		i = 0;
		while(i < 1) {
			try 
			{
				int dias = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos dias de reserva deseas ingresar?"));
				if (dias > 0 && dias < 32) 
				{
					this.dias_reserva = dias;
					i++;
				} 
				else 
				{
					JOptionPane.showMessageDialog(null, "¡Debes seleccionar como mínimo un dia!");
				}
			} 
			catch (NumberFormatException e) 
			{
				JOptionPane.showMessageDialog(null, "¡El formato introducido es erroneo!, debes escribir un numero");

			}
			
		}
		
		/*AQUI QUE ASEGURA QUE RESERVAS COMIDA*/
		i = 0;
		while (i < 1) {
			
			String p1 = JOptionPane.showInputDialog("¿Deseas reservar desayuno?");
			String p2 = JOptionPane.showInputDialog("¿Deseas reservar comida?");
			String p3 = JOptionPane.showInputDialog("¿Deseas reservar cena?");

			if (p1.equals("Si") || p1.equals("SI") || p1.equals("S")) 
			{
				this.precio = this.getPrecio() + 30;
				this.comidas_reservadas = this.comidas_reservadas + "Desayuno"; 
			} 
			
			else if (p1.equals("No") || p1.equals("NO") || p1.equals("N")) {
				
			}
			
			else 
			{
				JOptionPane.showMessageDialog(null, "¡El formato introducido es erroneo!");
			}
			
			if (p2.equals("Si") || p2.equals("SI") || p2.equals("S")) 
			{
				this.precio = this.getPrecio() + 40;
				this.comidas_reservadas = this.comidas_reservadas + ",comida"; 

			} 
			
			else if (p2.equals("No") || p2.equals("NO") || p2.equals("N")) {
				
			}
			
			else 
			{
				JOptionPane.showMessageDialog(null, "¡El formato introducido es erroneo!");
			}
			
			if (p3.equals("Si") || p3.equals("SI") || p3.equals("S")) 
			{
				this.precio = this.getPrecio() + 30;
				this.comidas_reservadas = this.comidas_reservadas + ",cena"; 

			} 
			
			else if (p3.equals("No") || p3.equals("NO") || p3.equals("N")) {
				
			}
			
			else 
			{
				JOptionPane.showMessageDialog(null, "¡El formato introducido es erroneo!");
			}
			i++;
		}
		
		if(this.getVistas() == true) 
		{
			this.precio = this.getPrecio() + (this.getDiasReserva() * this.getNumCamas() * 50);
		} 
		else 
		{
			this.precio = this.getPrecio() + (this.getDiasReserva() * this.getNumCamas() * 40);
		}
		
		int reserva = this.getDiasReserva();
		
		if (reserva > 1 && reserva < 5) 
		{
			JOptionPane.showMessageDialog(null, "La reserva se ha realizado correctamente");
		} 
		
		else if (reserva >= 5 && reserva < 10)
		{
			JOptionPane.showMessageDialog(null, "Genial. Reserva realizada. Gracias");
		}
		
		else if (reserva >= 10 && reserva < 20)
		{
			JOptionPane.showMessageDialog(null, "Son una gran cantidad de días, te lo agradecemos");
		}
		
		else if (reserva >= 20)
		{
			JOptionPane.showMessageDialog(null, "“Eres un cliente especial y se te tratará como tal. A tu disposición\r\n"
					+ "todo el equipo");
		}
	}
	
	
	public void muestraDatos() {
		
		String vistas;
		
		if(this.getVistas() == true) {
			vistas = "Si";
		}
		else {
			vistas = "No";
		}
		JOptionPane.showMessageDialog(null, "Numero de camas: " + this.getNumCamas() + "\n" + 
											"Vistas al mar: " + vistas + "\n" + 
											"Número de dias: " + this.getDiasReserva() + "\n" + 
											"Precio: " + this.getPrecio() + "\n" + 
											"Desayuno y cena: " + this.getComidasReservadas()
									);
	}

	/*GETERS*/
	
	public int getNumCamas() {return this.num_camas;}
	public boolean getVistas() {return this.vistas;}
	public int getDiasReserva() {return this.dias_reserva;}
	public int getPrecio() {return this.precio;}
	public String getComidasReservadas() {return this.comidas_reservadas;}
	
}
