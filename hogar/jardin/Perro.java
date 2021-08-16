package hogar.jardin;

import hogar.Persona;

public class Perro {
	public String nombre; // necesito llamar desde la casa
	protected int edad = 6;
	
	String jugar(Persona persona) {
		return persona.lanzarPelota() + " hacia " + nombre;
	}
	
	public String ladrando() {
		return "Guau Guau";
	}
}
