package Tema_2.Practica_2_2;

public class TapeDeckTestDrive {

	public static void main(String[ ] args) {
		
		TapeDeck t = new TapeDeck();
		
		t.canRecord = true;
		t.playTape();
		
		if(t.canRecord == true) {
			t.recordTape();
		}
		
	}
	
}
