package hogar.casa;

import hogar.Persona;
import hogar.jardin.Perro;

public class EjecutandoCasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato gato = new Gato();
		gato.nombre = "Benito";
		System.out.println("Hola: " + gato.nombre + " " + gato.maullar());
		
		
		// Creando instancia de Perro
		Perro perro  = new Perro();
	    perro.nombre = "Rocky";
	    System.out.println("Desde la casa puedo escuchar a mi perro " + perro.nombre + " "+ perro.ladrando());
	    
	    // Creando la instancia Persona
	    Persona persona = new Persona();
	    persona.setNombre("Miguel");
	    persona.setApellido("Ramos");
	    
	    // Jugamos con el gato
	    System.out.println(persona.getNombre() + " " + gato.jugar(persona));
	   
	}

}
