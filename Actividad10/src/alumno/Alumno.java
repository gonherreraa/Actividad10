package alumno;

import java.util.Arrays;
import java.util.Scanner;

public class Alumno {
static Scanner sc=new Scanner(System.in);
	
	private String nombre;
	private String curso;
	private int [] notas;
	
	public Alumno(String nombre, String curso, int asignaturas) {
		this.nombre=nombre;
		this.curso=curso;
		this.notas = new int[asignaturas];
	}
	
	//constructor que llama al primer constructor
	public Alumno(String nombre, String curso) {
		this(nombre,curso,5);
		
	}
	
	//constructor que llama al constructor anterior
	public Alumno(String nombre) {
		this(nombre,"DAW");
	}
	
	//metodo para saber si el nombre contiene la a
	public void contieneA() {
		
		if(nombre.contains("a") || nombre.contains("A")){
			
			System.out.println("Tu nombre contiene la a");
			
		}else
			System.out.println("Tu nombre no contiene la a");
		
	}
	
	//metodo para saber la media de las notas mediante notas aleatorias
	public void media() {
		
		int total=0;
		
		for (int i = 0; i < notas.length; i++) {
			int aleatorio = (int)(Math.random()*10);
			notas[i]=aleatorio;
			total=aleatorio+total;
			
		}
		System.out.println("Tu nota media es: " + total/5);
	}

	//metodo para poner un apodo
	public void apodo() {
		
		System.out.println("Cual es tu apodo");
		
		String nombre = sc.next();
		
		System.out.println("Tu apodo es: " + nombre);
	}
	
	//metodo para saber cual serian las notas preferidas del alumno
	public void notasPreferidas() {
		
		System.out.println("Que notas crees que vas a tener a final de curso:");
		for (int i = 0; i < 5; i++) {
			System.out.println("Nota " + (i+1));
			int nota=sc.nextInt();
		}	
	}
	
	//metodo para cambiar de curso
	public void cambiarCurso() {
		String nombre="";
		this.nombre=nombre;
		System.out.println("A que curso te quieres cambiar: ");
		nombre = sc.next();
		System.out.println("Ahora estas en el curso: " + nombre);
		
		
	}
	
	//metodo para sumarse puntos a las notas
	public void sumarPuntos() {
		
		System.out.println("Cuantos puntos te quieres subir en las notas: ");
		for (int i = 0; i < notas.length; i++) {
			int aleatorio = (int)(Math.random()*10);
			notas[i]=aleatorio;
			System.out.println("Asignatura " + (i+1));
			int num = sc.nextInt();
			
			notas[i]=notas[i]+num;
			System.out.println(notas[i]);
		}
		
		
	}

	
}
