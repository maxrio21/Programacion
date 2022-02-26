package Tema_2.Practica_2_1;

public class peliculaTestDrive {
	public static void main(String[] args) {
		Pelicula uno = new Pelicula();
		uno.titulo = "Blancanieves y los siente enanitos";
		uno.genero = "infantil";
		uno.calificacion = -2;
		uno.proyectar();
		Pelicula dos = new Pelicula();
		uno.titulo = "No habrá paz para los malvados";
		uno.genero = "Thriller";
		dos.calificacion = 127;
		dos.proyectar();
		Pelicula tres = new Pelicula();
		uno.titulo = "Bailando bajo la lluvia";
		uno.genero = "Musical";
		tres.calificacion = 5;
		tres.proyectar();
	}
}
