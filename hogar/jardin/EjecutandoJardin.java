package hogar.jardin;

import hogar.Persona;

public class EjecutandoJardin {

	public static void main(String[] args) {
	  
		Perro perro = new Perro();
		perro.nombre = "Rocky";
		
		// Gato gato = new Gato();
		
		Persona persona = new Persona();
		persona.setNombre("Javiera");
		persona.setApellido("Rojas");
		System.out.println(persona.getNombre() + " esta en el jardin");
		System.out.println(persona.getNombre() + " " + perro.jugar(persona));

	}

}
