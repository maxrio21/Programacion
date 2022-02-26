package Tema_2.Practica_2_3;

public class DrumKitTestDrive {

	public static void main (String[] args) {
		
		DrumKit d = new DrumKit();
		
		if (d.snare == true) {
			d.playSnare();
		}
		d.playTopHat();
	}
	
}
