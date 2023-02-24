package alumnoMain;

import alumno.Alumno;
public class PruebaAlumno {

	public static void main(String[] args) {
		
		Alumno uno = new Alumno("Alonso","DAM",5);
		Alumno dos = new Alumno ("Jlian","DAM");
		Alumno tres = new Alumno ("Alberto"); 
		
		uno.media();
		uno.sumarPuntos();
		dos.cambiarCurso();
		dos.notasPreferidas();
		tres.apodo();
		tres.contieneA();
	}

}
