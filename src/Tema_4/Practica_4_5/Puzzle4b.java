package Tema_4.Practica_4_5;

public class Puzzle4b {

	int ivar;
	
	public int doStuff(int factor) {
		if(ivar > 100) {
			return ivar * factor;
		} else {
			return ivar * (5 - factor);
		}
	}
	
}
