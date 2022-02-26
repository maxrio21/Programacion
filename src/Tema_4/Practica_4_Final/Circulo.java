package Tema_4.Practica_4_Final;

public class Circulo {

	private float r;
	
	public void setRadio(float radio) {
		this.r = radio;
	}
	
	public float getRadio() {
		return this.r;
	}
	
	public float getPerimetro() {
		return (float) (2 * Math.PI * r);
	}
	
	public float getArea() {
		return (float) (Math.PI * Math.pow(r, 2));
	}
	
}
